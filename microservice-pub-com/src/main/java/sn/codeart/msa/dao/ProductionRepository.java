package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.Production;

@RepositoryRestResource
public interface ProductionRepository extends JpaRepository<Production, Integer> {
    Production findProductionByIdProduction(int id);
}
