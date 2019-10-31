package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.codeart.msa.model.Diplome;

public interface DiplomeRepository extends JpaRepository<Diplome, Integer> {
    Diplome findDiplomeByLibeleCourt(String code);
}
