package sn.codeart.msa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.dao.ChercheurProductionRepository;
import sn.codeart.msa.service.ProductionService;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class MicroserviceChercheurProductionTests {

    @Autowired
    private ProductionService productionService;
    @Autowired
    private ChercheurProductionRepository chercheurProductionRepository;

    @Test
    void contextLoads() {
        /**
         * Production 1
         */
//        Production publication = publicationService.findPublicationByIdPublication(4);
//        ChercheurProduction chercheurPublication = new ChercheurProduction();
//        chercheurPublication.setIdChercheur(5);
//        chercheurPublication.setProduction(publication);
//        chercheurPublication.setRangChercheur(3);
//        chercheurPublicationRepository.save(chercheurPublication);
//
//        Assert.assertEquals("Test sur chercheurPublication 1",5,
//                chercheurPublication.getIdChercheur());
//        /**
//         * Production 1
//         */
//        ChercheurProduction chercheurPublication2 = new ChercheurProduction();
//        chercheurPublication2.setIdChercheur(6);
//        chercheurPublication2.setProduction(publication);
//        chercheurPublication2.setRangChercheur(4);
//        chercheurPublicationRepository.save(chercheurPublication2);
//        Assert.assertEquals("Test sur chercheurPublication 2",6,
//                chercheurPublication2.getIdChercheur());
//
//        /**
//         * Production 1
//         */
//        ChercheurProduction chercheurPublication3 = new ChercheurProduction();
//        chercheurPublication3.setIdChercheur(2);
//        chercheurPublication3.setProduction(publication);
//        chercheurPublication3.setRangChercheur(2);
//        chercheurPublicationRepository.save(chercheurPublication3);
//        Assert.assertEquals("Test sur chercheurPublication 3",5,
//                chercheurPublication3.getIdChercheur());
//        /**
//         * Production 1
//         */
//        ChercheurProduction chercheurPublication4 = new ChercheurProduction();
//        chercheurPublication4.setIdChercheur(2);
//        chercheurPublication4.setProduction(publication);
//        chercheurPublication4.setRangChercheur(2);
//        chercheurPublicationRepository.save(chercheurPublication4);
//        Assert.assertEquals("Test sur chercheurPublication 3",2,
//                chercheurPublication4.getIdChercheur());
//
//        /**
//         * Test de récupération des auteurs pour une publication donnée
//         */
//        List<ChercheurProduction> chercheurPublications = publicationService.findChercheurPublicationsByPublicationOrderByRangChercheur(6);
//        chercheurPublications.forEach(chercheurPub -> {
//            System.out.println("ID : "+chercheurPub.getIdChercheur()
//                    +" RANG : "+chercheurPub.getRangChercheur());
//        });
//        List<String> emails = new ArrayList<>();
//        emails.add(1,"diallodiery301@gmail.com");
//        emails.add("juniorndoye95@gmail.com");
        Map<Integer, String> emails = new HashMap<>();
        emails.put(9, "diallodiery301@gmail.com");
        //emails.put(8, "juniorndoye95@gmail.com");
        productionService.addAuthorsImplicatedInPublication(6, emails);
    }
}
