package sn.codeart.msa.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.model.UniteRecherche;
import sn.codeart.msa.service.UniteRechercheService;
import sn.codeart.msa.util.Constante;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UniteRechercheServiceTest {
    @Autowired
    private UniteRechercheService uniteRechercheService;

    private static UniteRecherche uniteRecherche1;
    private static UniteRecherche uniteRecherche2;
    private static UniteRecherche uniteRecherche3;

    @BeforeAll
    static void setUp() {
        uniteRecherche1 = new UniteRecherche();
        uniteRecherche2 = new UniteRecherche();
        uniteRecherche3 = new UniteRecherche();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void saveUniteRecherche() {
        uniteRecherche1.setLibeleCourt(Constante.UNITE_RECHERCHE1);
        uniteRecherche1.setAdresse("UCAD");
        uniteRecherche1.setEmail("abc@ucad.sn");
        uniteRecherche1 = uniteRechercheService.saveUniteRecherche(uniteRecherche1,
                Constante.T_U_RECHERCHE4, Constante.STRUCTURE1);
        assertNotNull(uniteRecherche1, "save unite de recherhe 1");

        uniteRecherche2.setLibeleCourt(Constante.UNITE_RECHERCHE2);
        uniteRecherche2.setAdresse("UCAD");
        uniteRecherche2.setEmail("efg@ucad.sn");
        uniteRecherche2 = uniteRechercheService.saveUniteRecherche(uniteRecherche2,
                Constante.T_U_RECHERCHE3, Constante.STRUCTURE2);
        assertNotNull(uniteRecherche2, "save unite de recherhe 2");

        uniteRecherche3.setLibeleCourt(Constante.UNITE_RECHERCHE3);
        uniteRecherche3.setAdresse("UCAD");
        uniteRecherche3.setEmail("ijk@ucad.sn");
        uniteRecherche3 = uniteRechercheService.saveUniteRecherche(uniteRecherche3,
                Constante.T_U_RECHERCHE3, Constante.STRUCTURE2);
        assertNotNull(uniteRecherche3, "save unite de recherhe 3");
    }
}