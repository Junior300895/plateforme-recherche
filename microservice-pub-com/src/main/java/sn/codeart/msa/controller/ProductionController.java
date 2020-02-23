package sn.codeart.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.codeart.msa.model.Production;
import sn.codeart.msa.service.ProductionService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@CrossOrigin("*")
@RestController
public class ProductionController {

    @Autowired
    private ProductionService productionService;

    @GetMapping(value = "/productions/{id}")
    public Production getPublication(@PathVariable("id") int id){
        return productionService.findProductionByIdProduction(id);
    }
    @GetMapping(value = "/publications")
    public List<Production> getAllPublication(){
        return productionService.findAllProductions();
    }
    @GetMapping(value = "/productionsByTp/{lctp}")
    public List<Production> getAllPublicationByTypeProduction(@PathVariable("lctp") String lctp){
        return productionService.findProductionsByTypeProductionLibelecourt(lctp);
    }
    @PostMapping(value = "/saveProduction/{typePub}/{email}/{thematique}")
    public Production saveProduction(@RequestBody Production production,
                                      @PathVariable("typePub") String typePub,
                                      @PathVariable("email") String emailChercheur,
                                      @PathVariable("thematique") String thematique){
        return productionService.saveProduction(production,typePub,emailChercheur,thematique);
    }
//    @PostMapping(value = "/saveProductionWithAuthors/{typePub}/{thematique}")
//    public Production saveProductionWithAuthors(
//            @RequestBody Production production,
//            @RequestBody Map<String, Integer> emailAuthors,
//            @PathVariable("typePub") String typePub,
//            @PathVariable("thematique") String thematique
//                                  ){
//        return productionService.saveProductionWithAuthors(production,typePub,thematique,emailAuthors);
//    }
    @PostMapping(value = "/addAuthorsImplicatedInPublication/{id}")
    public void saveProductionWithAuthors(@PathVariable("id") int id,
                                           @RequestBody HashMap<String, Integer> emails){
        productionService.addAuthorsImplicatedInPublication(id,emails);
    }
    @DeleteMapping(value = "/deleteProduction/{id}")
    public Production deleteProduction(@PathVariable("id") int id){
        return productionService.deleteProduction(id);
    }
}
