package sn.codeart.msa.service;

import org.springframework.stereotype.Service;
import sn.codeart.msa.model.TypeProduction;

import java.util.List;

@Service
public interface TypeProductionService {
    TypeProduction saveTypeProduction(TypeProduction typeProduction, String stp);
    List<TypeProduction> findTypeProductionsBySoustype(String soustype);
}
