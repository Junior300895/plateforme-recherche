package sn.codeart.msa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.codeart.msa.beans.ChercheurBean;
import sn.codeart.msa.beans.ThematiqueBean;
import sn.codeart.msa.dao.ChercheurProductionRepository;
import sn.codeart.msa.dao.ProductionRepository;
import sn.codeart.msa.dao.TypeProductionRepository;
import sn.codeart.msa.model.ChercheurProduction;
import sn.codeart.msa.model.Production;
import sn.codeart.msa.model.TypeProduction;
import sn.codeart.msa.proxies.MicroserviceChercheurProxy;
import sn.codeart.msa.service.ProductionService;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ProductionServiceImpl implements ProductionService {
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
        ChercheurBean chercheurBean = microserviceChercheurProxy
                .findChercheurByEmail(chercheurBeanMail);
        ThematiqueBean thematiqueBean = microserviceChercheurProxy
                .findThematiqueByLibeleCourt(lcThematique);

        production.setIdThematique(thematiqueBean.getIdThematique());
        production.setNomThematique(thematiqueBean.getLibeleCourt());
        production.setDatemiseenligne(new Date());
        production.setTypeProduction(typeProduction);
        production = productionRepository.save(production);

        ChercheurProduction chercheurProduction = new ChercheurProduction();
        chercheurProduction.setProduction(production);
        chercheurProduction.setIdChercheur(chercheurBean.getIdChercheur());
        chercheurProduction.setRangChercheur(0);
        chercheurProduction.setNomChercheur(chercheurBean.getPrenom()+" "+chercheurBean.getNom());

        chercheurProductionRepository.save(chercheurProduction);
        return production;
    }
    @Override
    public void addAuthorsImplicatedInPublication(int idPub, Map<Integer, String> emailAuthors){
        AtomicInteger rang = new AtomicInteger();
        emailAuthors.forEach((integer, s) -> {
            ChercheurBean chercheurBean = microserviceChercheurProxy
                    .findChercheurByEmail(s);
            ChercheurProduction chercheurProduction = new ChercheurProduction();
            chercheurProduction.setProduction(productionRepository.findProductionByIdProduction(idPub));
            chercheurProduction.setIdChercheur(chercheurBean.getIdChercheur());
            chercheurProduction.setRangChercheur(integer);
            chercheurProduction.setNomChercheur(chercheurBean.getPrenom()+" "+chercheurBean.getNom());
            chercheurProductionRepository.save(chercheurProduction);
        });
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
}
