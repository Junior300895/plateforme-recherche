package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import sn.codeart.msa.dao.ChercheurRepository;
import sn.codeart.msa.dao.ThematiqueRepository;
import sn.codeart.msa.model.Thematique;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        DiplomeTests.class,
        FonctionTests.class,
        GradeTests.class,
        StatutTests.class,
        ThematiqueTests.class,
        ChercheurApplicationTests.class,
        ChercheurDiplomeTests.class,
})
class TestSuite {


}
