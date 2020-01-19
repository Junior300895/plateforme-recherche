package sn.codeart.msa.service;

import org.springframework.stereotype.Service;
import sn.codeart.msa.model.SousTypeProduction;

@Service
public interface SousTypeProductionService {
    SousTypeProduction saveSousTypeProduction(SousTypeProduction sousTypeProduction);
}
