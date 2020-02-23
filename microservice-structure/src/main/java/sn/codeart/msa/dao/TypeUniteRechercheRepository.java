package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.TypeUniteRecherche;

@RepositoryRestResource
public interface TypeUniteRechercheRepository extends JpaRepository<TypeUniteRecherche, Integer> {
    TypeUniteRecherche findTypeUniteRechercheByLibeleCourt(String lc);
}
