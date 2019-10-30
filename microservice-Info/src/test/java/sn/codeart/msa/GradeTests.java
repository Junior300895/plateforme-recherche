package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.dao.GradeRepository;
import sn.codeart.msa.model.Grade;

@SpringBootTest
class GradeTests {

    @Autowired
    private GradeRepository gradeRepository;
    @Test
    void contextLoads() {
        Grade grade = new Grade();
        grade.setLibeleCourt("Titulaire");
        grade.setLibeleLong("Professeur titulaire");

        gradeRepository.save(grade);
        Assert.assertEquals("test sur insertion grade 1","Titulaire", grade.getLibeleCourt());
    }
}
