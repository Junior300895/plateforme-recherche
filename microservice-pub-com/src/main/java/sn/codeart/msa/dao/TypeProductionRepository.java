package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.TypeProduction;

import java.util.List;

@RepositoryRestResource
public interface TypeProductionRepository extends JpaRepository<TypeProduction, Integer> {
    List<TypeProduction> findTypeProductionsBySoustype(String lc);
    TypeProduction findTypeProductionByLibelecourt(String lc);
}
