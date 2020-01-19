package sn.codeart.msa.service;

import org.springframework.stereotype.Service;
import sn.codeart.msa.model.TypeProduction;

@Service
public interface TypeProductionService {
    TypeProduction saveTypeProduction(TypeProduction typeProduction, String stp);
}
