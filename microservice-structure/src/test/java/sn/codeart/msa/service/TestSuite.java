package sn.codeart.msa.service;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import sn.codeart.msa.model.UniteRecherche;
import sn.codeart.msa.service.TypeUniteRechercheServiceTest;
import sn.codeart.msa.service.UniteRechercheServiceTest;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        TypeUniteRechercheServiceTest.class,
        StructureServiceTest.class,
        UniteRechercheServiceTest.class,
})
public class TestSuite {

}
