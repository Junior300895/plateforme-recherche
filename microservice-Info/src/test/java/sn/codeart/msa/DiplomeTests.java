package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.dao.DiplomeRepository;
import sn.codeart.msa.model.Diplome;

@SpringBootTest
class DiplomeTests{

    @Autowired
    private DiplomeRepository diplomeRepository;
    @Test
    void contextLoads() {
        Diplome diplome = new Diplome();
        diplome.setLibeleCourt("PhD");
        diplome.setLibeleLong("Diplôme universitaire");

        diplomeRepository.save(diplome);
        Assert.assertEquals("test sur insertion diplome 1","PhD", diplome.getLibeleCourt());
    }

}
