package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.Chercheur;
import sn.codeart.msa.model.Thematique;

@RepositoryRestResource
public interface ThematiqueRepository extends JpaRepository<Thematique, Integer> {
    Thematique findThematiqueByLibeleCourt(String lc);
    Thematique findThematiqueByIdThematique(int id);
}
