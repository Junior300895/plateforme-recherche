package sn.codeart.msa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.codeart.msa.dao.StructureRepository;
import sn.codeart.msa.model.Structure;
import sn.codeart.msa.service.StructureService;

@Service
public class StructureServiceImpl implements StructureService {
    @Autowired
    private StructureRepository structureRepository;
    @Override
    public Structure saveStructure(Structure structure) {
        return structureRepository.save(structure);
    }

    @Override
    public Structure findStructureByLibeleCourt(String lc) {
        return structureRepository.findStructureByLibeleCourt(lc);
    }
}
