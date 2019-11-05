package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.codeart.msa.model.Appeloffre;

public interface AppeloffreRepository extends JpaRepository<Appeloffre, Integer> {
    Appeloffre findAppeloffreByIdAppeloffre(int idAO);
}
