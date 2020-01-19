package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import sn.codeart.msa.beans.DiffusionBean;
import sn.codeart.msa.beans.ThematiqueBean;
import sn.codeart.msa.dao.AppeloffreRepository;
import sn.codeart.msa.dao.AppeloffreThematiqueRepository;
import sn.codeart.msa.model.Appeloffre;
import sn.codeart.msa.model.AppeloffreThematique;
import sn.codeart.msa.proxies.MicroserviceChercheurProxy;

import java.util.Date;

@SpringBootTest
class ServiceAppeloffreApplicationTests {
    private final Logger log = LoggerFactory.getLogger(ServiceAppeloffreApplicationTests.class);

    @Autowired
    private AppeloffreRepository appeloffreRepository;
    @Autowired
    private MicroserviceChercheurProxy microserviceChercheurProxy;
    @Autowired
    private AppeloffreThematiqueRepository appeloffreThematiqueRepository;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private KafkaTemplate<String, AppeloffreThematique> kafkaTemplate;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private KafkaTemplate<String, sn.codeart.msa.beans.AppeloffreThematique> kafkaTemplate1;

    @Autowired
    ThematiqueBean thematiqueBean; // Pour ajouter un theme

    @Test
    void contextLoads() {
        Appeloffre appeloffre1 = new Appeloffre();

        appeloffre1.setIntitule("APPEL A PROJETS DE RECHERCHE CONJOINTS SÉNÉGAL ET BURKINA FASO");
        appeloffre1.setDate_parution(new Date());
        appeloffre1.setEmetteur("DGRI représentée par la Direction du " +
                "Financement de la Recherche et du Développement Technologique (DFRSDT) et le FONRID");

        appeloffre1 = appeloffreRepository.save(appeloffre1);

        Assert.assertEquals("test d'insertion d'un AO",
                "APPEL A PROJETS DE RECHERCHE CONJOINTS SÉNÉGAL ET BURKINA FASO",
                appeloffre1.getIntitule());

        // Assignation de theme pour l'AO
        thematiqueBean = microserviceChercheurProxy.findThematiqueByLibeleCourt("Deep Learning");

        AppeloffreThematique appeloffreThematique = new AppeloffreThematique();
        appeloffreThematique.setIdAppeloffre(appeloffre1.getIdAppeloffre());
        appeloffreThematique.setIdThematique(thematiqueBean.getIdThematique());

        appeloffreThematique = appeloffreThematiqueRepository.save(appeloffreThematique);
        //createEventAOTheme(appeloffreThematique);

        sn.codeart.msa.beans.AppeloffreThematique appeloffreThematique1 = new sn.codeart.msa.beans.AppeloffreThematique();
        appeloffreThematique1.setIdAppeloffre(appeloffre1.getIdAppeloffre());
        appeloffreThematique1.setIdThematique(thematiqueBean.getIdThematique());

        //createEventNotifyChercheur(appeloffreThematique1);
    }

    /**
     * Add events
     *
     * @param appeloffreThematique
     */
    private void createEventAOTheme(AppeloffreThematique appeloffreThematique) {
        this.kafkaTemplate.send("ao-th", appeloffreThematique);
        log.info("### Producer ao-th ==> " + appeloffreThematique.toString());
    }
    private void createEventNotifyChercheur(sn.codeart.msa.beans.AppeloffreThematique appeloffreThematique){
        this.kafkaTemplate1.send("notify", appeloffreThematique);
        log.info("### Producer notify ==> " + appeloffreThematique.toString());
    }
}
