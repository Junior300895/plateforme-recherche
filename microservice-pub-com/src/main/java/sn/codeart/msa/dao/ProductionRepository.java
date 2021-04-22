package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sn.codeart.msa.model.Chercheur;
import sn.codeart.msa.model.Production;
import sn.codeart.msa.model.TypeProduction;

import java.util.List;

@RepositoryRestResource
public interface ProductionRepository extends JpaRepository<Production, Integer> {
    Production findProductionByIdProduction(int id);
    List<Production> findProductionsByTypeProductionLibelecourt(String lc);
    List<Production> findProductionsByTypeProductionSoustype(String st);
    List<Production> findProductionsByChercheurProductionsChercheur(Chercheur chercheur);
    List<Production> findProductionsByChercheurProductionsChercheurEmail(String email);
}
