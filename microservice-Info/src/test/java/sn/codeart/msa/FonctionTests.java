package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.dao.FonctionRepository;
import sn.codeart.msa.model.Fonction;

@SpringBootTest
class FonctionTests {

    @Autowired
    private FonctionRepository fonctionRepository;
    @Test
    void contextLoads() {
        Fonction fonction = new Fonction();
        fonction.setLibeleCourt("Enseignant");
        fonction.setLibeleLong("Université de dakar");

        fonctionRepository.save(fonction);
        Assert.assertEquals("test sur insertion fonction 1","Enseignant", fonction.getLibeleCourt());
    }
}
