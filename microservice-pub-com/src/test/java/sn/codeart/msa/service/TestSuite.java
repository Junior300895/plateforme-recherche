package sn.codeart.msa.service;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        SousTypeProductionServiceTest.class,
        TypeProductionServiceTest.class,
        ProductionServiceTest.class
        })
public class TestSuite {

}
