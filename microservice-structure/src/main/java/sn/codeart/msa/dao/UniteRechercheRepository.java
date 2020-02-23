package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.UniteRecherche;

@RepositoryRestResource
public interface UniteRechercheRepository extends JpaRepository<UniteRecherche, Integer> {
    UniteRecherche findUniteRechercheByLibeleCourt(String lc);
    UniteRecherche findUniteRechercheByIdUnite(int id);
    UniteRecherche deleteUniteRechercheByIdUnite(int id);
}