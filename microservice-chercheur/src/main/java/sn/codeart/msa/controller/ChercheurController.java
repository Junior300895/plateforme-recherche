package sn.codeart.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.codeart.msa.dao.ChercheurRepository;
import sn.codeart.msa.dao.ThematiqueRepository;
import sn.codeart.msa.model.Chercheur;
import sn.codeart.msa.model.Thematique;

import java.util.List;

@RestController
public class ChercheurController {

    @Autowired
    private ChercheurRepository chercheurRepository;
    @Autowired
    private ThematiqueRepository thematiqueRepository;

    @GetMapping(value = "/chercheurs")
    public List<Chercheur> findAllChercheur(){
        return chercheurRepository.findAll();
    }

    @GetMapping(value = "/thematiques")
    public  List<Thematique> findAllThematique(){
        return thematiqueRepository.findAll();
    }

    @GetMapping(value = "/getThematique/{lc}")
    public  Thematique findThematiqueByLibeleCourt(@PathVariable("lc") String lc){
        return thematiqueRepository.findThematiqueByLibeleCourt(lc);
    }
}
