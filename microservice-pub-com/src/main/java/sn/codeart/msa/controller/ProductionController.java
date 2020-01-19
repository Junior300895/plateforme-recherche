package sn.codeart.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.codeart.msa.model.Production;
import sn.codeart.msa.service.ProductionService;

import java.util.HashMap;
import java.util.List;

//@CrossOrigin("*")
@RestController
public class ProductionController {

    @Autowired
    private ProductionService productionService;

    @GetMapping(value = "/publications/{id}")
    public Production getPublication(@PathVariable("id") int id){
        return productionService.findProductionByIdProduction(id);
    }
    @GetMapping(value = "/publications")
    public List<Production> getAllPublication(){
        return productionService.findAllProductions();
    }
    @PostMapping(value = "/savePublication/{typePub}/{email}/{thematique}")
    public Production savePublication(@RequestBody Production production,
                                      @PathVariable("typePub") String typePub,
                                      @PathVariable("email") String emailChercheur,
                                      @PathVariable("thematique") String thematique){
        return productionService.saveProduction(production,typePub,emailChercheur,thematique);
    }
    @PostMapping(value = "/savePublicationWithAuthors/{id}")
    public void savePublicationWithAuthors(@PathVariable("id") int id,
                                                  HashMap<Integer, String> emails){
        productionService.addAuthorsImplicatedInPublication(id,emails);
    }

//
//    @GetMapping(value = "/communications/{id}")
//    public Production getCommunication(@PathVariable("id") int id){
//        return productionService.findProductionByIdProduction(id);
//    }
//    @GetMapping(value = "/communications")
//    public List<Communication> getAllCommunication(){
//        return communicationService.findAllCommunication();
//    }
}
