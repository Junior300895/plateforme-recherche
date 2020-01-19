package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.Fonction;

@RepositoryRestResource
public interface FonctionRepository extends JpaRepository<Fonction, Integer> {
    Fonction findFonctionByLibeleCourt(String lc);

    Fonction findFonctionByIdFonction(int id);
}
