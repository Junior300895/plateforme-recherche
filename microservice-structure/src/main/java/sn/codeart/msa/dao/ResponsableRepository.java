package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sn.codeart.msa.model.Responsable;

@RepositoryRestResource
public interface ResponsableRepository extends JpaRepository<Responsable, Integer> {
}
