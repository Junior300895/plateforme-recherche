package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.dao.ChercheurRepository;
import sn.codeart.msa.dao.DiplomeRepository;
import sn.codeart.msa.dao.ThematiqueRepository;
import sn.codeart.msa.model.Chercheur;
import sn.codeart.msa.model.Diplome;
import sn.codeart.msa.model.Thematique;

import java.util.List;

@SpringBootTest
class ThematiqueTests {

    @Autowired
    private ThematiqueRepository thematiqueRepository;
    @Autowired
    private ChercheurRepository chercheurRepository;

    @Test
    void contextLoads() {
        Thematique thematique1 = new Thematique();
        thematique1.setLibeleCourt("Intelligence Artificielle");
        thematique1 = thematiqueRepository.save(thematique1);
        Assert.assertNotNull("test sur insertion thematique 1",thematique1);

        Thematique thematique2 = new Thematique();
        thematique2.setLibeleCourt("Deep Learning");
        thematique2 = thematiqueRepository.save(thematique2);
        Assert.assertNotNull("test sur insertion thematique 2",thematique2);
        
        Thematique thematique3 = new Thematique();
        thematique3.setLibeleCourt("Big DATA");
        thematique3 = thematiqueRepository.save(thematique3);
        Assert.assertNotNull("test sur insertion thematique 3",thematique3);
        
        Thematique thematique4 = new Thematique();
        thematique4.setLibeleCourt("Orthopédie Dento-Faciale");
        thematique4 = thematiqueRepository.save(thematique4);
        Assert.assertNotNull("test sur insertion thematique 4",thematique4);
        
        Thematique thematique5 = new Thematique();
        thematique5.setLibeleCourt("Espagnol-Civilisation latino-américaine");
        thematique5 = thematiqueRepository.save(thematique5);
        Assert.assertNotNull("test sur insertion thematique 5",thematique5);
    }
}
