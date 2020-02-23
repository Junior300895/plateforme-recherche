package sn.codeart.msa.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.model.TypeUniteRecherche;
import sn.codeart.msa.service.TypeUniteRechercheSevice;
import sn.codeart.msa.util.Constante;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TypeUniteRechercheServiceTest {

    @Autowired
    private TypeUniteRechercheSevice typeUniteRechercheSevice;

    private static TypeUniteRecherche typeUniteRecherche1;
    private static TypeUniteRecherche typeUniteRecherche2;
    private static TypeUniteRecherche typeUniteRecherche3;
    private static TypeUniteRecherche typeUniteRecherche4;

    @BeforeAll
    static void setUp() {
        typeUniteRecherche1 = new TypeUniteRecherche();
        typeUniteRecherche2 = new TypeUniteRecherche();
        typeUniteRecherche3 = new TypeUniteRecherche();
        typeUniteRecherche4 = new TypeUniteRecherche();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void saveTypeUniteRecherche() {
        typeUniteRecherche1.setLibeleCourt(Constante.T_U_RECHERCHE1);
        typeUniteRecherche1 = typeUniteRechercheSevice.saveTypeUniteRecherche(typeUniteRecherche1);
        assertNotNull(typeUniteRecherche1, "type unité recherche 1");

        typeUniteRecherche2.setLibeleCourt(Constante.T_U_RECHERCHE2);
        typeUniteRecherche2 = typeUniteRechercheSevice.saveTypeUniteRecherche(typeUniteRecherche2);
        assertNotNull(typeUniteRecherche2,"type unité recherche 2");

        typeUniteRecherche3.setLibeleCourt(Constante.T_U_RECHERCHE3);
        typeUniteRecherche3 = typeUniteRechercheSevice.saveTypeUniteRecherche(typeUniteRecherche3);
        assertNotNull(typeUniteRecherche3,"type unité recherche 3");

        typeUniteRecherche4.setLibeleCourt(Constante.T_U_RECHERCHE4);
        typeUniteRecherche4 = typeUniteRechercheSevice.saveTypeUniteRecherche(typeUniteRecherche4);
        assertNotNull(typeUniteRecherche4,"type unité recherche 4");
    }
}