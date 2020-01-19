package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.Chercheur;
import sn.codeart.msa.model.ChercheurDiplome;

@RepositoryRestResource
public interface ChercheurDiplomeRepository extends JpaRepository<ChercheurDiplome, Integer> {
}
