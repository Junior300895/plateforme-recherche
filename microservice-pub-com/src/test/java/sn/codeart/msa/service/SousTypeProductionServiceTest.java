package sn.codeart.msa.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.model.SousTypeProduction;
import sn.codeart.msa.util.Constante;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SousTypeProductionServiceTest {
    @Autowired
    private SousTypeProductionService sousTypeProductionService;

    private static SousTypeProduction sousTypeProduction1;
    private static SousTypeProduction sousTypeProduction2;

    @BeforeAll
    static void setUp() {
        sousTypeProduction1 = new SousTypeProduction();
        sousTypeProduction2 = new SousTypeProduction();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void saveSousTypeProduction() {
        /**
         * Saving sous type production
         */
        sousTypeProduction1.setLibelecourt(Constante.STP1);
        sousTypeProduction1 = sousTypeProductionService.saveSousTypeProduction(sousTypeProduction1);
        assertNotNull(sousTypeProduction1);

        sousTypeProduction2.setLibelecourt(Constante.STP2);
        sousTypeProduction2 = sousTypeProductionService.saveSousTypeProduction(sousTypeProduction2);
        assertNotNull(sousTypeProduction2);
    }
}