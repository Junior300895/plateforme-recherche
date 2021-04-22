package sn.codeart.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.codeart.msa.dao.TypeProductionRepository;
import sn.codeart.msa.model.Production;
import sn.codeart.msa.model.TypeProduction;
import sn.codeart.msa.service.ProductionService;
import sn.codeart.msa.service.TypeProductionService;
import sn.codeart.msa.util.PostDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ProductionController {

    @Autowired
    private TypeProductionRepository typeProductionRepository;
    @Autowired
    private ProductionService productionService;
    @Autowired
    private TypeProductionService typeProductionService;

    @GetMapping(value = "/productions/{id}")
    public Production getPublication(@PathVariable("id") int id){
        return productionService.findProductionByIdProduction(id);
    }
    @GetMapping(value = "/typeProductions")
    public List<TypeProduction> getTypeProduction(){
        return typeProductionRepository.findAll();
    }
    @GetMapping(value = "/publications")
    public List<Production> getAllPublication(){
        return productionService.findAllProductions();
    }
    @GetMapping(value = "/productionsByTp/{lctp}")
    public List<Production> getAllPublicationByTypeProduction(@PathVariable("lctp") String lctp){
        return productionService.findProductionsByTypeProductionSoustype(lctp);
    }
    @GetMapping(value = "/typeProductionsBySoustype/{code}")
    public List<TypeProduction> getAllTypeProductionBySousType(@PathVariable("code") String code){
        return typeProductionService.findTypeProductionsBySoustype(code);
    }
    @PostMapping(value = "/saveProduction/{typePub}/{email}/{thematique}")
    public Production saveProduction(@RequestBody Production production,
                                      @PathVariable("typePub") String typePub,
                                      @PathVariable("email") String emailChercheur,
                                      @PathVariable("thematique") String thematique){
        return productionService.saveProduction(production,typePub,emailChercheur,thematique);
    }
//    @PostMapping(value = "/saveProductionWithAuthors/{typeProd}/{thematique}")
//    public Production saveProductionWithAuthors(
//            @RequestBody Production production,
//            @RequestBody HashMap<String, Integer> emailAuthors,
//            @PathVariable("typeProd") String typeProd,
//            @PathVariable("thematique") String thematique
//                                  ){
//        return productionService.saveProductionWithAuthors(production, typeProd, emailAuthors, thematique);
//    }
    @PostMapping(value = "/saveProductionWithAuthors/{typeProd}/{thematique}")
    public Production saveProductionWithAuthors(
    		@RequestBody PostDTO postDTO,
    		@PathVariable("typeProd") String typeProd,
    		@PathVariable("thematique") String thematique
    		){
    	return productionService.saveProductionWithAuthors(postDTO.getProduction(), typeProd, postDTO.getEmailsRangs(), thematique);
    }
    @PostMapping(value = "/addAuthorsImplicatedInPublication/{id}")
    public void saveProductionWithAuthors(@PathVariable("id") int id,
                                           @RequestBody HashMap<String, Integer> emails){
        productionService.addAuthorsImplicatedInPublication(id,emails);
    }
    @DeleteMapping(value = "/deleteProduction/{id}")
    public Production deleteProduction(@PathVariable("id") int id){
        return productionService.deleteProduction(id);
    }
    @GetMapping(value = "/productions/chercheur/{emailChercheur}")
    public List<Production> findProductionsByChercheurProductionsChercheur(@PathVariable("emailChercheur") String emailChercheur){
        return productionService.findProductionsByChercheurProductionsChercheur(emailChercheur);
    }
}
