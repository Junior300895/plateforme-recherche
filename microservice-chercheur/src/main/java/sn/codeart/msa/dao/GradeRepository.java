package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.Grade;

@RepositoryRestResource
public interface GradeRepository extends JpaRepository<Grade, Integer> {
    public Grade findGradeByLibeleCourt(String lc);
    public Grade findGradeByIdGrade(int id);
}
