package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.dao.ThematiqueRepository;
import sn.codeart.msa.model.Thematique;

@SpringBootTest
class ThematiqueTests {

    @Autowired
    private ThematiqueRepository thematiqueRepository;
    @Test
    void contextLoads() {
        Thematique thematique = new Thematique();
        thematique.setLibeleCourt("Services publics et personnes sans-abri ou mal logées");
        thematique.setLibeleLong("");

        thematiqueRepository.save(thematique);
        Assert.assertEquals("test sur insertion thematique 1","Services publics et personnes sans-abri ou mal logées", thematique.getLibeleCourt());
    }
}
