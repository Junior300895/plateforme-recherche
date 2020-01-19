package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.Appeloffre;

@RepositoryRestResource
public interface AppeloffreRepository extends JpaRepository<Appeloffre, Integer> {
    Appeloffre findAppeloffreByIdAppeloffre(int idAO);
}
