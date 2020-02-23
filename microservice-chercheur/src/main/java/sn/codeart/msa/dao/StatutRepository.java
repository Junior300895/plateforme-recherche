package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.Statut;

@RepositoryRestResource
public interface StatutRepository extends JpaRepository<Statut, Integer> {
    public Statut findStatutByLibeleCourt(String lc);
    public Statut findStatutByIdStatut(int id);
}
