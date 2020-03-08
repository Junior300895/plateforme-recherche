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
    private static TypeProduction typeProduction3;
    private static TypeProduction typeProduction4;
    private static TypeProduction typeProduction5;
    private static TypeProduction typeProduction6;
    private static TypeProduction typeProduction7;

    @BeforeAll
    static void setUp() {
        typeProduction1 = new TypeProduction();
        typeProduction2 = new TypeProduction();
        typeProduction3 = new TypeProduction();
        typeProduction4 = new TypeProduction();
        typeProduction5 = new TypeProduction();
        typeProduction6 = new TypeProduction();
        typeProduction7 = new TypeProduction();
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
        typeProduction1 = typeProductionService.saveTypeProduction(typeProduction1, Constante.STP1);
        assertNotNull(typeProduction1);

        typeProduction2.setLibelecourt(Constante.TP2);
        typeProduction2 = typeProductionService.saveTypeProduction(typeProduction2, Constante.STP1);
        assertNotNull(typeProduction2);

        typeProduction3.setLibelecourt(Constante.TP3);
        typeProduction3 = typeProductionService.saveTypeProduction(typeProduction3, Constante.STP1);
        assertNotNull(typeProduction3);

        typeProduction4.setLibelecourt(Constante.TP4);
        typeProduction4 = typeProductionService.saveTypeProduction(typeProduction4, Constante.STP1);
        assertNotNull(typeProduction4);

        typeProduction5.setLibelecourt(Constante.TP5);
        typeProduction5 = typeProductionService.saveTypeProduction(typeProduction5, Constante.STP2);
        assertNotNull(typeProduction5);

        typeProduction6.setLibelecourt(Constante.TP6);
        typeProduction6 = typeProductionService.saveTypeProduction(typeProduction6, Constante.STP2);
        assertNotNull(typeProduction6);

        typeProduction7.setLibelecourt(Constante.TP7);
        typeProduction7 = typeProductionService.saveTypeProduction(typeProduction7, Constante.STP2);
        assertNotNull(typeProduction7);
    }
}