package sn.codeart.msa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.codeart.msa.dao.TypeProductionRepository;
import sn.codeart.msa.model.TypeProduction;
import sn.codeart.msa.service.TypeProductionService;

import java.util.List;

@Service
public class TypeProductionServiceImpl implements TypeProductionService {

    @Autowired
    private TypeProductionRepository typeProductionRepository;

    @Override
    public TypeProduction saveTypeProduction(TypeProduction typeProduction, String stp) {
        typeProduction.setSoustype(stp);
        return typeProductionRepository.save(typeProduction);
    }

    @Override
    public List<TypeProduction> findTypeProductionsBySoustype(String soustype) {
        return typeProductionRepository.findTypeProductionsBySoustype(soustype);
    }
}
