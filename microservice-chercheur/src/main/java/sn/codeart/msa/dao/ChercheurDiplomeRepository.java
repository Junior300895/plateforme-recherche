package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.codeart.msa.model.Chercheur;
import sn.codeart.msa.model.ChercheurDiplome;

public interface ChercheurDiplomeRepository extends JpaRepository<ChercheurDiplome, Integer> {
}
