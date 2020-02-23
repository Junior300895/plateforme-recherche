package sn.codeart.msa.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.model.Production;
import sn.codeart.msa.util.Constante;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class ProductionServiceTest {
    @Autowired
    private ProductionService productionService;

    private static Production production1;
    private static Production production2;
    private static Production production3;
    private static Production production4;

    @BeforeAll
    static void setUp() {
        production1 = new Production();
        production2 = new Production();
        production3 = new Production();
        production4 = new Production();
    }

    @AfterEach
    void tearDown() {
    }

    @Order(1)
    @Test
    void saveProduction() {
        /**
         * Production 1
         */
        production1.setLibelelong("Quotidiens, hebdomadaires de la presse européenne nous ont montré et " +
                "remontré des images des attentats du 13 novembre 2015 à Paris ou du 22 mars 2016 à Bruxelles " +
                "et leurs conséquences");
        production1.setRevuelieu("Revue du Centre de Linguistique Appliquée de Dakar");
        production1.setNumvol(6);
        production1.setPages("134");
        production1.setDateproduction(new Date());
        production1.setLangue("Français");
        production1 = productionService.saveProduction(production1, Constante.TP1,
                "diallodiery301@gmail.com","Intelligence Artificielle");
        assertNotNull(production1);

        /**
         * Production 2
         */
        production2.setLibelelong("Le contrat de transport de marchandises est-il un contrat d'adhésion à l'aune du " +
                "droit OHADA et comparé");
        production2.setRevuelieu("Lexbase Afrique-OHADA");
        production2.setNumvol(14);
        production2.setPages("234");
        production2.setDateproduction(new Date());
        production2.setLangue("Français");
        production2 = productionService.saveProduction(production2, Constante.TP1,
                "juniorndoye95@gmail.com","Deep Learning");
        assertNotNull(production2);

        /**
         * Communication 1
         */
        production3.setLibelelong("Evaluation du profil hemorheologique, lipidique et du risque cardiovasculaire " +
                "des drepanocytaires homozygotes et heterozygotes senegalais.");
        production3.setRevuelieu("Dakar/Senegal");
        production3.setNumvol(24);
        production3.setPages("45");
        production3.setDateproduction(new Date());
        production3.setLangue("Français");
        production3.setDatedebutcommunication(new Date());
        production3.setDatefincommunication(new Date());
        production3 = productionService.saveProduction(production3, Constante.TP2,
                "juniorndoye95@gmail.com","Deep Learning");
        assertNotNull(production3);

//        Assert.assertEquals("Test sur communication 1","Dakar/Senegal", production3.getRevuelieu());
    }
//    @Order(2)
//    @Test
//    void saveProductionWithAuthors() {
//            fail("test non implémenté");
//        /**
//         * Production 1 with author
//         */
//        production4.setLibelelong("« Le scepticisme chez Sextus Empiricus et l’école médicale " +
//                "méthodiste : vraie proximité ou simple coïncidence? »");
//        production4.setRevuelieu("Petite côte Afrique-SUD");
//        production4.setNumvol(5);
//        production4.setPages("55");
//        production4.setDateproduction(new Date());
//        production4.setLangue("Français");
//
//        Map<String, Integer> emails = new HashMap<>();
//        emails.put("juniorndoye95@gmail.com",5);
//        emails.put("diallodiery301@gmail.com",5);
//
//        production4 = productionService.saveProductionWithAuthors(
//                production4, Constante.TP1, "Deep Learning", emails);
//        assertNotNull(production4);
//
//    }
    @Order(2)
    @Test
    void addAuthorsImplicatedInPublication() {
        Map<String, Integer> emails = new HashMap<>();
        emails.put("juniorndoye95@gmail.com", 5);
        boolean reussi = productionService.addAuthorsImplicatedInPublication(production1.getIdProduction(), emails);
        assertTrue(reussi);
    }

    @Test
    void findAllProductions() {
        fail("test non implémenté");
    }

    @Test
    void findProductionByIdProduction() {
        fail("test non implémenté");
    }

    @Test
    void findChercheurProductionsByProductionOrderByRangChercheur() {
        fail("test non implémenté");
    }
    @Order(3)
    @Test
    void findProductionsByTypeProductionLibelecourt() {
        List<Production> productions = productionService.
                findProductionsByTypeProductionLibelecourt(Constante.TP1);
        assertNotNull(productions);
    }

}