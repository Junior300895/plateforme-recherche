package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.codeart.msa.model.Chercheur;

public interface ChercheurRepository extends JpaRepository<Chercheur, Integer> {
    Chercheur findChercheurByIdChercheur(int id);
    Chercheur findChercheurByEmail(String email);
}
