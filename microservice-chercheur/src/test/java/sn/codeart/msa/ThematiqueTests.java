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

        Thematique thematique2 = new Thematique();
        thematique2.setLibeleCourt("Deep Learning");

        thematiqueRepository.save(thematique1);
        thematiqueRepository.save(thematique2);
        Assert.assertEquals("test sur insertion thematique 1",
                "Intelligence Artificielle", thematique1.getLibeleCourt());
        Assert.assertEquals("test sur insertion thematique 2",
                "Deep Learning", thematique2.getLibeleCourt());
    }
}
