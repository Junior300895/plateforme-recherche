package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.codeart.msa.model.Grade;

public interface GradeRepository extends JpaRepository<Grade, Integer> {
    public Grade findGradeByLibeleCourt(String lc);
}
