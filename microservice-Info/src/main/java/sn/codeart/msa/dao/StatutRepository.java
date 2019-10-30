package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.codeart.msa.model.Statut;

public interface StatutRepository extends JpaRepository<Statut, Integer> {
    public Statut findStatutByLibeleCourt(String lc);
}
