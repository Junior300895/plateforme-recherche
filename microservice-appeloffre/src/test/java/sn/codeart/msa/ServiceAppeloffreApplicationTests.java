package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
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

    @Test
    void contextLoads() {
        AppeloffreThematique appeloffreThematique = new AppeloffreThematique();
        Appeloffre appeloffre1 = new Appeloffre();

        appeloffre1.setIntitule("APPEL A PROJETS DE RECHERCHE CONJOINTS SÉNÉGAL ET BURKINA FASO");
        appeloffre1.setDate_parution(new Date());
        appeloffre1.setEmetteur("DGRI représentée par la Direction du " +
                "Financement de la Recherche et du Développement Technologique (DFRSDT) et le FONRID");

        appeloffre1 = appeloffreRepository.save(appeloffre1);
        Assert.assertEquals("test d'insertion d'un AO",
                "APPEL A PROJETS DE RECHERCHE CONJOINTS SÉNÉGAL ET BURKINA FASO",
                appeloffre1.getIntitule());

        appeloffreThematique.setIdAppeloffre(appeloffre1.getId_appeloffre());
        appeloffreThematique.setIdThematique(microserviceChercheurProxy.
                findThematiqueByLibeleCourt("Deep Learning").getIdThematique());
        appeloffreThematique = appeloffreThematiqueRepository.save(appeloffreThematique);
        createEventAOTheme(appeloffreThematique);
    }

    /**
     * Add events
     * @param appeloffreThematique
     */
    private void createEventAOTheme(AppeloffreThematique appeloffreThematique){
        this.kafkaTemplate.send("userss", appeloffreThematique);
        log.info("### Producer ==> idAo : "+appeloffreThematique.getIdAppeloffre()+
                " idThematique : "+appeloffreThematique.getIdThematique());
    }
}
