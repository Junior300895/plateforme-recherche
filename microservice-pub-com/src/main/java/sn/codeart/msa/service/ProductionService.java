package sn.codeart.msa.service;

import org.springframework.stereotype.Service;
import sn.codeart.msa.model.ChercheurProduction;
import sn.codeart.msa.model.Production;

import java.util.List;
import java.util.Map;

@Service
public interface ProductionService {
    Production saveProduction(Production production, String typeProd,
                               String chercheurBeanMail, String lcThematique);
//    Production saveProductionWithAuthors(
//            Production production, String typeProd,
//            String lcThematique, Map<String, Integer> emailAuthors);
    boolean addAuthorsImplicatedInPublication(int idPub, Map<String, Integer> emailAuthors);
    List<Production> findAllProductions();
    Production findProductionByIdProduction(int id);
    List<ChercheurProduction> findChercheurProductionsByProductionOrderByRangChercheur(int idProd);
    List<Production> findProductionsByTypeProductionLibelecourt(String lc_tp);
    Production deleteProduction(int id);
}
