package sn.codeart.msa.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.codeart.msa.beans.ChercheurBean;
import sn.codeart.msa.beans.ThematiqueBean;
import sn.codeart.msa.dao.ChercheurProductionRepository;
import sn.codeart.msa.dao.ProductionRepository;
import sn.codeart.msa.dao.TypeProductionRepository;
import sn.codeart.msa.model.*;
import sn.codeart.msa.proxies.MicroserviceChercheurProxy;
import sn.codeart.msa.service.ProductionService;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ProductionServiceImpl implements ProductionService {
    private final Logger log = LoggerFactory.getLogger(ProductionServiceImpl.class);

    @Autowired
    private ProductionRepository productionRepository;
    @Autowired
    private TypeProductionRepository typeProductionRepository;
    @Autowired
    private MicroserviceChercheurProxy microserviceChercheurProxy;
    @Autowired
    private ChercheurProductionRepository chercheurProductionRepository;
    @Override
    public Production saveProduction(Production production, String typeProd,
                                      String chercheurBeanMail, String lcThematique) {
        TypeProduction typeProduction = typeProductionRepository.
                findTypeProductionByLibelecourt(typeProd);
        Chercheur chercheur = microserviceChercheurProxy
                .findChercheurByEmail(chercheurBeanMail);
        Thematique thematique = microserviceChercheurProxy
                .findThematiqueByLibeleCourt(lcThematique);

        production.setThematique(thematique);
        production.setDatemiseenligne(new Date());
        production.setTypeProduction(typeProduction);
        production = productionRepository.save(production);

        if(production != null){
            ChercheurProduction chercheurProduction = new ChercheurProduction();
            chercheurProduction.setProduction(production);
            chercheurProduction.setRangChercheur(0);
            chercheurProduction.setMiseEnLignePar(true);
            chercheurProduction.setChercheur(chercheur);
            chercheurProductionRepository.save(chercheurProduction);
            return production;
        }
       return null;
    }

    @Override
    @Transactional
    public boolean addAuthorsImplicatedInPublication(int idPub, Map<String, Integer > emailAuthors){
        Boolean reussi = false;
        Production production = productionRepository.findProductionByIdProduction(idPub);
//        List<ChercheurProduction> list = chercheurProductionRepository.
//                findChercheurProductionsByProductionOrderByRangChercheur(production);
//        if(!list.isEmpty()){
//            chercheurProductionRepository.deleteChercheurProductionsByProduction(production);
//        }
        emailAuthors.forEach((s, integer) -> {
            Chercheur chercheur = microserviceChercheurProxy.findChercheurByEmail(s);

            ChercheurProduction chercheurProduction = new ChercheurProduction();
            chercheurProduction.setRangChercheur(integer);
            chercheurProduction.setChercheur(chercheur);
            chercheurProduction.setProduction(production);
            chercheurProductionRepository.save(chercheurProduction);

        });
        reussi = true;
        return reussi;
    }
    @Override
    public List<Production> findAllProductions() {
        return productionRepository.findAll();
    }

    @Override
    public Production findProductionByIdProduction(int id) {
        return productionRepository.findProductionByIdProduction(id);
    }

    @Override
    public List<ChercheurProduction> findChercheurProductionsByProductionOrderByRangChercheur(int idProd) {
        Production production = productionRepository.findProductionByIdProduction(idProd);
        return chercheurProductionRepository.
                findChercheurProductionsByProductionOrderByRangChercheur(production);
    }

    @Override
    public List<Production> findProductionsByTypeProductionLibelecourt(String lc_tp) {
        return productionRepository.findProductionsByTypeProductionLibelecourt(lc_tp);
    }

    @Override
    public Production deleteProduction(int id) {
        Production production = productionRepository.findProductionByIdProduction(id);
        if(production==null) throw new RuntimeException("Production non existante");

        else {
            log.info("production {} exist", id);
            productionRepository.delete(production);
            return production;
        }
    }
}
