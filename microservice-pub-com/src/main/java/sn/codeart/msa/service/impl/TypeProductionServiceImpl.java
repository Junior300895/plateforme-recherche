package sn.codeart.msa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.codeart.msa.dao.SousTypeProductionRepository;
import sn.codeart.msa.dao.TypeProductionRepository;
import sn.codeart.msa.model.SousTypeProduction;
import sn.codeart.msa.model.TypeProduction;
import sn.codeart.msa.service.TypeProductionService;

@Service
public class TypeProductionServiceImpl implements TypeProductionService {

    @Autowired
    private TypeProductionRepository typeProductionRepository;
    @Autowired
    private SousTypeProductionRepository sousTypeProductionRepository;

    @Override
    public TypeProduction saveTypeProduction(TypeProduction typeProduction, String stp) {
        typeProduction.setSousTypeProduction(sousTypeProductionRepository.
                findSousTypeProductionByLibelecourt(stp));
        return typeProductionRepository.save(typeProduction);
    }
}
