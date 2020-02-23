package sn.codeart.msa.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.codeart.msa.dao.StructureRepository;
import sn.codeart.msa.dao.TypeUniteRechercheRepository;
import sn.codeart.msa.dao.UniteRechercheRepository;
import sn.codeart.msa.model.Structure;
import sn.codeart.msa.model.TypeUniteRecherche;
import sn.codeart.msa.model.UniteRecherche;
import sn.codeart.msa.service.StructureService;
import sn.codeart.msa.service.UniteRechercheService;

import java.util.List;

@RestController
public class StructureController {

    @Autowired
    private StructureService structureService;
    @Autowired
    private UniteRechercheService uniteRechercheService;
    @Autowired
    private UniteRechercheRepository uniteRechercheRepository;
    @Autowired
    private StructureRepository structureRepository;
    @Autowired
    private TypeUniteRechercheRepository typeUniteRechercheRepository;

    @GetMapping(value = "/getStructureByLc/{lc}")
    public Structure findStructureByLc(@PathVariable("lc") String lc){
        return structureService.findStructureByLibeleCourt(lc);
    }

    @GetMapping(value = "/getUniteByLc/{lc}")
    public UniteRecherche findUniteByLc(@PathVariable("lc") String lc){
        return uniteRechercheService.findUniteRechercheByLibeleCourt(lc);
    }

    @GetMapping(value = "/findAllUnites")
    public List<UniteRecherche> findAllunite(){
        return uniteRechercheRepository.findAll();
    }

    @GetMapping(value = "/findAllStructures")
    public List<Structure> findAllStructure(){
        return structureRepository.findAll();
    }

    @GetMapping(value = "/findAllTypeUniteRecherche")
    public List<TypeUniteRecherche> findAllTypeUniteRecherche(){
        return typeUniteRechercheRepository.findAll();
    }
    @PostMapping(value = "/saveUniteRecherche/{tur}/{structure}")
    public UniteRecherche saveUniteRecherche(@RequestBody UniteRecherche uniteRecherche,
                                             @PathVariable("tur") String tur,
                                             @PathVariable("structure") String structure){
        return uniteRechercheService.saveUniteRecherche(uniteRecherche,tur, structure);
    }
    @PostMapping(value = "/saveUniteRechercheWithResponsable/{tur}/{structure}/{emailresponsable}")
    public UniteRecherche saveUniteRechercheWithResponsable(@RequestBody UniteRecherche uniteRecherche,
                                             @PathVariable("tur") String tur,
                                             @PathVariable("structure") String structure,
                                             @PathVariable("emailresponsable") String emailresponsable){
        return uniteRechercheService.saveUniteRechercheWithResponsable(uniteRecherche,tur,
                structure,emailresponsable);
    }
    @DeleteMapping(value = "/deleteUniteRecherche/{id}")
    public UniteRecherche deleteUniteRecherche(@PathVariable("id") int id){
        return uniteRechercheService.deleteUniteRecherche(id);
    }
}
