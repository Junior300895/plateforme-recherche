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
   // public void addAuthorsImplicatedInPublication(int idPub, List<String> emailAuthors);
    public void addAuthorsImplicatedInPublication(int idPub, Map<Integer, String> emailAuthors);
    List<Production> findAllProductions();
    Production findProductionByIdProduction(int id);
    List<ChercheurProduction> findChercheurProductionsByProductionOrderByRangChercheur(int idProd);
}
