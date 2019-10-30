package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.dao.StatutRepository;
import sn.codeart.msa.model.Statut;

@SpringBootTest
class StatutTests {
    @Autowired
    private StatutRepository statutRepository;
    @Test
    void contextLoads() {
        Statut statut = new Statut();
        statut.setLibeleCourt("EnseignantChercheur");
        statut.setLibeleLong("EnseignantChercheur");

        statutRepository.save(statut);
        Assert.assertEquals("test sur insertion statut 1","EnseignantChercheur", statut.getLibeleCourt());
    }
}
