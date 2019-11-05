package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.codeart.msa.model.Fonction;

public interface FonctionRepository extends JpaRepository<Fonction, Integer> {
    Fonction findFonctionByLibeleCourt(String lc);

    Fonction findFonctionByIdFonction(int id);
}
