package sn.codeart.msa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.codeart.msa.model.Structure;

@Service
public interface StructureService {
    Structure saveStructure(Structure structure);
    Structure findStructureByLibeleCourt(String lc);
}
