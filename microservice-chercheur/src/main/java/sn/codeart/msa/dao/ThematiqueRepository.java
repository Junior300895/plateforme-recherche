package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.codeart.msa.model.Chercheur;
import sn.codeart.msa.model.Thematique;

public interface ThematiqueRepository extends JpaRepository<Thematique, Integer> {
    Thematique findThematiqueByLibeleCourt(String lc);
}
