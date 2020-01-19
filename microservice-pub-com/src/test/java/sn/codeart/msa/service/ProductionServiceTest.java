package sn.codeart.msa.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.model.Production;
import sn.codeart.msa.util.Constante;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ProductionServiceTest {
    @Autowired
    private ProductionService productionService;

    private static Production production1;
    private static Production production2;
    private static Production production3;

    @BeforeAll
    static void setUp() {
        production1 = new Production();
        production2 = new Production();
        production3 = new Production();
    }

    @AfterEach
    void tearDown() {
    }

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
    @Test
    void addAuthorsImplicatedInPublication() {
    }

    @Test
    void findAllProductions() {
    }

    @Test
    void findProductionByIdProduction() {
    }

    @Test
    void findChercheurProductionsByProductionOrderByRangChercheur() {
    }
}