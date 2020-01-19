package sn.codeart.msa.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.Chercheur;
import sn.codeart.msa.model.Thematique;

import java.util.List;
@RepositoryRestResource
public interface ChercheurRepository extends JpaRepository<Chercheur, Integer> {
    Chercheur findChercheurByIdChercheur(int id);
    Chercheur findChercheurByEmail(String email);
    List<Chercheur> findChercheursByThematiques(Thematique thematique);
}
