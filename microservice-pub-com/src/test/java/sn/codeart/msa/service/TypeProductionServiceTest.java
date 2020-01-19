package sn.codeart.msa.service;

import org.apache.tomcat.util.bcel.Const;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.model.TypeProduction;
import sn.codeart.msa.util.Constante;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TypeProductionServiceTest {
    @Autowired
    private TypeProductionService typeProductionService;
    private static TypeProduction typeProduction1;
    private static TypeProduction typeProduction2;

    @BeforeAll
    static void setUp() {
        typeProduction1 = new TypeProduction();
        typeProduction2 = new TypeProduction();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void saveTypeProduction() {
        /**
         * Saving type production
         */
        typeProduction1.setLibelecourt(Constante.TP1);
        typeProduction1 = typeProductionService.saveTypeProduction(typeProduction1, Constante.STP2);

        typeProduction2.setLibelecourt(Constante.TP2);
        typeProduction2 = typeProductionService.saveTypeProduction(typeProduction2, Constante.STP1);
    }
}