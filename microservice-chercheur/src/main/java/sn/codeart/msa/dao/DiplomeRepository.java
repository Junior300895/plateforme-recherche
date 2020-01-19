package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.Diplome;

@RepositoryRestResource
public interface DiplomeRepository extends JpaRepository<Diplome, Integer> {
    Diplome findDiplomeByLibeleCourt(String code);
}
