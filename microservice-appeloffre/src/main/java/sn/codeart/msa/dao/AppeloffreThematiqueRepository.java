package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.codeart.msa.model.Appeloffre;
import sn.codeart.msa.model.AppeloffreThematique;

public interface AppeloffreThematiqueRepository extends JpaRepository<AppeloffreThematique, Integer> {
}
