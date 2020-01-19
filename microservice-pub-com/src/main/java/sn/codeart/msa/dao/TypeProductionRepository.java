package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.SousTypeProduction;
import sn.codeart.msa.model.TypeProduction;

@RepositoryRestResource
public interface TypeProductionRepository extends JpaRepository<TypeProduction, Integer> {
    TypeProduction findTypeProductionByLibelecourt(String lc);
}
