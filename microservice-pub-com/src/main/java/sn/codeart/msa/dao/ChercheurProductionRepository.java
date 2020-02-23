package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.ChercheurProduction;
import sn.codeart.msa.model.Production;

import java.util.List;
@RepositoryRestResource
public interface ChercheurProductionRepository extends JpaRepository<ChercheurProduction, Integer> {
    List<ChercheurProduction> findChercheurProductionsByProductionOrderByRangChercheur(Production production);
    void deleteChercheurProductionsByProduction(Production production);
}
