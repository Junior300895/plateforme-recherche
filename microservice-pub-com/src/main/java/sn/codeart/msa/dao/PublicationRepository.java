package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.codeart.msa.model.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Integer> {
}
