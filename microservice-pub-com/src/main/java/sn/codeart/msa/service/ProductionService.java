package sn.codeart.msa.service;

import org.springframework.stereotype.Service;

import sn.codeart.msa.model.Chercheur;
import sn.codeart.msa.model.ChercheurProduction;
import sn.codeart.msa.model.Production;

import java.util.List;
import java.util.Map;

@Service
public interface ProductionService {
    Production saveProduction(Production production, String typeProd,
                               String chercheurBeanMail, String lcThematique);
    Production saveProductionWithAuthors(Production production, String typeProd,
    		Map<String, Integer> emailAuthors, String lcThematique);
//    Production saveProductionWithAuthors(
//            Production production, String typeProd,
//            String lcThematique, Map<String, Integer> emailAuthors);
    boolean addAuthorsImplicatedInPublication(int idPub, Map<String, Integer> emailAuthors);
    List<Production> findAllProductions();
    Production findProductionByIdProduction(int id);
    List<ChercheurProduction> findChercheurProductionsByProductionOrderByRangChercheur(int idProd);
    List<Production> findProductionsByTypeProductionSoustype(String stp);
    List<Production> findProductionsByChercheurProductionsChercheur(String email);
    Production deleteProduction(int id);
}
