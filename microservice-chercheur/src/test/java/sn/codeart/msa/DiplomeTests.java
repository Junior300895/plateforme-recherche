package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.dao.DiplomeRepository;
import sn.codeart.msa.dao.FonctionRepository;
import sn.codeart.msa.model.Diplome;
import sn.codeart.msa.model.Fonction;

@SpringBootTest
class DiplomeTests {

    @Autowired
    private DiplomeRepository diplomeRepository;
    @Test
    void contextLoads() {
        Diplome diplome1 = new Diplome();
        diplome1.setLibeleCourt("PhD");

        Diplome diplome2 = new Diplome();
        diplome2.setLibeleCourt("DEA - Diplôme d’Etat d’architecte");

        diplomeRepository.save(diplome1);
        diplomeRepository.save(diplome2);
        Assert.assertEquals("test sur insertion diplome 1","PhD", diplome1.getLibeleCourt());
        Assert.assertEquals("test sur insertion diplome 2","DEA - Diplôme d’Etat d’architecte", diplome2.getLibeleCourt());
    }
}
