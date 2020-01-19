package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.AppeloffreThematique;

@RepositoryRestResource
public interface ThematiqueAppeloffreRepository extends JpaRepository<AppeloffreThematique, Integer> {
}
