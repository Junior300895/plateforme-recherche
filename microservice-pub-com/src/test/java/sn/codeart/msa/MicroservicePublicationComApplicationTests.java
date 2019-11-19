package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.beans.ChercheurBean;
import sn.codeart.msa.model.Communication;
import sn.codeart.msa.model.Publication;
import sn.codeart.msa.proxies.MicroserviceChercheurProxy;
import sn.codeart.msa.service.ServiceCommunication;
import sn.codeart.msa.service.ServicePublication;

import java.util.Date;

@SpringBootTest
class MicroservicePublicationComApplicationTests {

    @Autowired
    private ServicePublication servicePublication;
    @Autowired
    private ServiceCommunication serviceCommunication;
    @Autowired
    private MicroserviceChercheurProxy microserviceChercheurProxy;
    @Test
    void contextLoads() {
        ChercheurBean chercheurBean1 = microserviceChercheurProxy.
                findChercheurByEmail("diallodiery301@gmail.com");
        ChercheurBean chercheurBean2 = microserviceChercheurProxy.
                findChercheurByEmail("juniorndoye95@gmail.com");
        /**
         * Publication 1
         */
        Publication publication1 = new Publication();
        publication1.setLibelelong("Quotidiens, hebdomadaires de la presse européenne nous ont montré et " +
                "remontré des images des attentats du 13 novembre 2015 à Paris ou du 22 mars 2016 à Bruxelles " +
                "et leurs conséquences");
        publication1.setDatepub(new Date());
        publication1.setRevuelieu("Revue du Centre de Linguistique Appliquée de Dakar");
        publication1.setNumvol(6);
        publication1 = servicePublication.savePublication(publication1, chercheurBean1);
        Assert.assertEquals("Test sur publication 1","Revue du Centre de " +
                "Linguistique Appliquée de Dakar", publication1.getRevuelieu());

        /**
         * Publication 2
         */
        Publication publication2 = new Publication();
        publication2.setLibelelong("Le contrat de transport de marchandises est-il un contrat d'adhésion à l'aune du " +
                "droit OHADA et comparé");
        publication2.setDatepub(new Date());
        publication2.setRevuelieu("Lexbase Afrique-OHADA");
        publication2.setNumvol(14);
        publication2 = servicePublication.savePublication(publication2, chercheurBean1);
        Assert.assertEquals("Test sur publication 2","Lexbase Afrique-OHADA",
                publication2.getRevuelieu());

        /**
         * Communication 1
         */
        Communication communication1 = new Communication();
        communication1.setLibelelong("Evaluation du profil hemorheologique, lipidique et du risque cardiovasculaire " +
                "des drepanocytaires homozygotes et heterozygotes senegalais.");
        communication1.setDatecom(new Date());
        communication1.setLieu("Dakar/Senegal");
        communication1 = serviceCommunication.savePublication(communication1, chercheurBean2);
        Assert.assertEquals("Test sur communication 1","Dakar/Senegal",
                communication1.getLieu());


    }

}
