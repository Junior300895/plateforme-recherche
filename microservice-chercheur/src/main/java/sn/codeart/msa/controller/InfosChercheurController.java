//package sn.codeart.msa.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.*;
//import sn.codeart.msa.dao.*;
//import sn.codeart.msa.model.*;
//import sn.codeart.msa.service.ServiceChercheur;
//
//import java.util.List;
//@CrossOrigin("*")
//@RestController
//public class InfosChercheurController {
//
//    @Autowired
//    private ChercheurRepository chercheurRepository;
//    @Autowired
//    private ThematiqueRepository thematiqueRepository;
//    @Autowired
//    private FonctionRepository fonctionRepository;
//    @Autowired
//    private GradeRepository gradeRepository;
//    @Autowired
//    private StatutRepository statutRepository;
//
//    @Autowired
//    private ServiceChercheur serviceChercheur;
//
//    @GetMapping(value = "/chercheurs")
//    public List<Chercheur> findAllChercheur() {
//        return chercheurRepository.findAll();
//    }
//    @GetMapping(value = "/chercheurs/{email}")
//    public Chercheur findChercheurByEmail(@PathVariable("email") String email) {
//        return chercheurRepository.findChercheurByEmail(email);
//    }
//
//    @GetMapping(value = "/listThematiques")
//    public List<Thematique> findAllThematique() {
//        return thematiqueRepository.findAll();
//    }
//
//    @GetMapping(value = "/getThematiqueByLc/{lc}")
//    public Thematique findThematiqueByLibeleCourt(@PathVariable("lc") String lc) {
//        return thematiqueRepository.findThematiqueByLibeleCourt(lc);
//    }
//    @GetMapping(value = "/getThematiqueById/{idTh}")
//    public Thematique findThematiqueByIdthematique(@PathVariable("idTh") int idTh) {
//        return thematiqueRepository.findThematiqueByIdThematique(idTh);
//    }
//    @GetMapping(value = "/chercheursByThematique/{idTh}")
//    List<Chercheur> findChercheursByThematiques(@PathVariable("idTh") int idTh){
//        Thematique thematique1 = findThematiqueByIdthematique(idTh);
//        return chercheurRepository.findChercheursByThematiques(thematique1);
//    }
//    @PostMapping(value = "/saveChercheur/{lcThe}/{lcFct}/{lcGra}/{lcSta}/{lcStruct}/{lcUnit}")
//    Chercheur saveChercheur(
//            @RequestBody Chercheur chercheur,@PathVariable("lcThe") String lcThe,
//            @PathVariable("lcFct") String lcFct,@PathVariable("lcGra") String lcGra,
//            @PathVariable("lcSta") String lcSta,@PathVariable("lcStruct") String lcStruct,
//            @PathVariable("lcUnit") String lcUnit){
//        return serviceChercheur.saveCherheur(chercheur,lcThe,lcFct,lcGra,lcSta,lcStruct,lcUnit);
//    }
//
//    @GetMapping(value = "/findAllThematiques")
//    public List<Thematique> findAllThematiques(){
//        return thematiqueRepository.findAll();
//    }
//    @GetMapping(value = "/findAllFonctions")
//    public List<Fonction> findAllFonctions(){
//        return fonctionRepository.findAll();
//    }
//    @GetMapping(value = "/findAllGrades")
//    public List<Grade> findAllGrades(){
//        return gradeRepository.findAll();
//    }
//    @GetMapping(value = "/findAllStatuts")
//    public List<Statut> findAllStatuts(){
//        return statutRepository.findAll();
//    }
//    @Transactional
//    @DeleteMapping(value = "/deleteChercheur/{id}")
//    public Chercheur deleteChercheur(@PathVariable("id") String id){
//        return serviceChercheur.deleteChercheur(id);
//    }
//
//    /**
//     * ajout d'infos
//     */
//    @PostMapping(value = "/saveThematique/{libele}")
//    public Thematique saveThematique(@PathVariable("libele") String libele ){
//        return serviceChercheur.saveThematique(libele);
//    }
//    @PostMapping(value = "/saveFonction/{libele}")
//    public Fonction saveFonction(@PathVariable("libele") String libele ){
//        return serviceChercheur.saveFonction(libele);
//    }
//    @PostMapping(value = "/saveGrade/{libele}")
//    public Grade saveGrade(@PathVariable("libele") String libele ){
//        return serviceChercheur.saveGrade(libele);
//    }
//    @PostMapping(value = "/saveStatut/{libele}")
//    public Statut saveStatut(@PathVariable("libele") String libele ){
//        return serviceChercheur.saveStatut(libele);
//    }
//
//    /**
//     * Suppression des infos
//     */
//    @DeleteMapping(value = "/deleteThematique/{libele}")
//    public Thematique deleteThematique(@PathVariable("libele") String libele){
//        return serviceChercheur.deleteThematique(libele);
//    }
//    @DeleteMapping(value = "/deleteFonction/{libele}")
//    public Fonction deleteFonction(@PathVariable("libele") String libele){
//        return serviceChercheur.deleteFonction(libele);
//    }
//    @DeleteMapping(value = "/deleteGrade/{libele}")
//    public Grade deleteGrade(@PathVariable("libele") String libele){
//        return serviceChercheur.deleteGrade(libele);
//    }
//    @DeleteMapping(value = "/deleteStatut/{libele}")
//    public Statut deleteStatut(@PathVariable("libele") String libele){
//        return serviceChercheur.deleteStatut(libele);
//    }
//
//    /**
//     * Recherche infos
//     */
//    @GetMapping(value = "/findThematiqueByLc/{lc}")
//    public Thematique findThematiqueByLc(@PathVariable("lc") String lc) {
//        return thematiqueRepository.findThematiqueByLibeleCourt(lc);
//    }
//    @GetMapping(value = "/findFonctionByLc/{lc}")
//    public Fonction findFonctionByLc(@PathVariable("lc") String lc) {
//        return fonctionRepository.findFonctionByLibeleCourt(lc);
//    }
//    @GetMapping(value = "/findGradeByLc/{lc}")
//    public Grade findGradeByLc(@PathVariable("lc") String lc) {
//        return gradeRepository.findGradeByLibeleCourt(lc);
//    }
//    @GetMapping(value = "/findStatutByLc/{lc}")
//    public Statut findStatutByLc(@PathVariable("lc") String lc) {
//        return statutRepository.findStatutByLibeleCourt(lc);
//    }
//
//    /**
//     * Update infos
//     */
//    @PostMapping(value = "/updateThematique/{id}/{libele}")
//    public Thematique updateThematique(@PathVariable("id") int id, @PathVariable("libele") String libele ){
//        return serviceChercheur.updateThematique(id, libele);
//    }
//    @PostMapping(value = "/updateFonction/{id}/{libele}")
//    public Fonction updateFonction(@PathVariable("id") int id, @PathVariable("libele") String libele ){
//        return serviceChercheur.updateFonction(id, libele);
//    }
//    @PostMapping(value = "/updateGrade/{id}/{libele}")
//    public Grade updateGrade(@PathVariable("id") int id, @PathVariable("libele") String libele ){
//        return serviceChercheur.updateGrade(id, libele);
//    }
//    @PostMapping(value = "/updateStatut/{id}/{libele}")
//    public Statut updateStatut(@PathVariable("id") int id, @PathVariable("libele") String libele ){
//        return serviceChercheur.updateStatut(id, libele);
//    }
//    /**
//     * récupération des chercheurs d'une unité
//     */
//    @GetMapping(value = "/findChercheursByIdUniteRecherche/{id}")
//    public List<Chercheur> findChercheurByIdUniteRecherche(@PathVariable("id") int id) {
//        return chercheurRepository.findChercheursByIdUniteRecherche(id);
//    }
//}
