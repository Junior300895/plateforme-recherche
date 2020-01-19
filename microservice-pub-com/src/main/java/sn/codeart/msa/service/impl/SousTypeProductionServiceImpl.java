package sn.codeart.msa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.codeart.msa.dao.SousTypeProductionRepository;
import sn.codeart.msa.model.SousTypeProduction;
import sn.codeart.msa.model.TypeProduction;
import sn.codeart.msa.service.SousTypeProductionService;
import sn.codeart.msa.service.TypeProductionService;

@Service
public class SousTypeProductionServiceImpl implements SousTypeProductionService {

    @Autowired
    private SousTypeProductionRepository sousTypeProductionRepository;

    @Override
    public SousTypeProduction saveSousTypeProduction(SousTypeProduction sousTypeProduction) {
        return sousTypeProductionRepository.save(sousTypeProduction);
    }
}
