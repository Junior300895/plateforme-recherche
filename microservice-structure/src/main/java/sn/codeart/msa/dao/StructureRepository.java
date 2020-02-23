package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.Structure;

@RepositoryRestResource
public interface StructureRepository extends JpaRepository<Structure, Integer> {
    Structure findStructureByLibeleCourt(String lc);
}
