package sn.codeart.msa.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.model.Structure;
import sn.codeart.msa.util.Constante;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StructureServiceTest {

    @Autowired
    private StructureService structureService;

    private static Structure structure1;
    private static Structure structure2;
    private static Structure structure3;

    @BeforeAll
    static void setUp() {
        structure1 = new Structure();
        structure2 = new Structure();
        structure3 = new Structure();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void saveStructure() {
        structure1.setLibeleCourt(Constante.STRUCTURE1);
        structure1 = structureService.saveStructure(structure1);
        assertNotNull(structure1, "save structure 1");

        structure2.setLibeleCourt(Constante.STRUCTURE2);
        structure2 = structureService.saveStructure(structure2);
        assertNotNull(structure2, "save structure 2");

        structure3.setLibeleCourt(Constante.STRUCTURE3);
        structure3 = structureService.saveStructure(structure3);
        assertNotNull(structure3, "save structure 3");
    }
}