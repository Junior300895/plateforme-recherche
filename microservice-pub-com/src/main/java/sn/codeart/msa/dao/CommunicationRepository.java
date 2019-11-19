package sn.codeart.msa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.codeart.msa.model.Communication;

public interface CommunicationRepository extends JpaRepository<Communication, Integer> {
}
