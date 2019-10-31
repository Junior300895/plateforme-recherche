package sn.codeart.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.codeart.msa.dao.*;
import sn.codeart.msa.model.Fonction;
import sn.codeart.msa.model.Grade;
import sn.codeart.msa.model.Statut;
import sn.codeart.msa.events.Producer;

import java.util.List;

@RestController
public class InfoController {
    @Autowired
    private DiplomeRepository diplomeRepository;
    @Autowired
    private FonctionRepository fonctionRepository;
    @Autowired
    private GradeRepository gradeRepository;
    @Autowired
    private StatutRepository statutRepository;
    @Autowired
    private ThematiqueRepository thematiqueRepository;

    private final Producer producer;
    @Autowired
    InfoController(Producer producer) {
        this.producer = producer;
    }
    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
    }

    @GetMapping(value = "/fonctions")
    public List<Fonction> findAllFonction(){
        return fonctionRepository.findAll();
    }
    @GetMapping(value = "/fonction/{libeleCourt}")
    public Fonction findFonctionByLibeleCourt(@PathVariable("libeleCourt") String lc){
        return fonctionRepository.findFonctionByLibeleCourt(lc);
    }
    @GetMapping(value = "/getfonction/{id}")
    public Fonction findFonctionByIdFonction(@PathVariable("id") int id){
        return fonctionRepository.findFonctionByIdFonction(id);
    }

    @GetMapping(value = "/grades")
    public List<Grade> findAllGrade(){
        return gradeRepository.findAll();
    }
    @GetMapping(value = "/grade/{libeleCourt}")
    public Grade findGradeByLibeleCourt(@PathVariable("libeleCourt") String lc){
        return gradeRepository.findGradeByLibeleCourt(lc);
    }

    @GetMapping(value = "/statuts")
    public List<Statut> findAllStatut(){
        return statutRepository.findAll();
    }
    @GetMapping(value = "/statut/{libeleCourt}")
    public Statut findStatutByLibeleCourt(@PathVariable("libeleCourt") String lc){
        return statutRepository.findStatutByLibeleCourt(lc);
    }
}
