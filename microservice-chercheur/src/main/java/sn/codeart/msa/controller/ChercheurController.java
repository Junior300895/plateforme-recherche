package sn.codeart.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
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
    public List<Chercheur> findAllChercheur() {
        return chercheurRepository.findAll();
    }

    @GetMapping(value = "/thematiques")
    public List<Thematique> findAllThematique() {
        return thematiqueRepository.findAll();
    }

    @GetMapping(value = "/getThematique/{lc}")
    public Thematique findThematiqueByLibeleCourt(@PathVariable("lc") String lc) {
        return thematiqueRepository.findThematiqueByLibeleCourt(lc);
    }
    @GetMapping(value = "/getIdThematique/{idTh}")
    public Thematique findThematiqueByIdthematique(@PathVariable("idTh") int idTh) {
        return thematiqueRepository.findThematiqueByIdThematique(idTh);
    }
    @GetMapping(value = "/chercheursByThematique/{idTh}")
    List<Chercheur> findChercheursByThematiques(@PathVariable("idTh") int idTh){
        Thematique thematique1 = findThematiqueByIdthematique(idTh);
        return chercheurRepository.findChercheursByThematiques(thematique1);
    }
}
