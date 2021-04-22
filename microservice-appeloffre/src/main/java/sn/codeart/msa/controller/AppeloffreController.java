package sn.codeart.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.codeart.msa.beans.ThematiqueBean;
import sn.codeart.msa.model.Appeloffre;
import sn.codeart.msa.service.ServiceAppeloffre;

import java.util.List;

//@CrossOrigin("*")
@RestController
public class AppeloffreController {

    @Autowired
    private ServiceAppeloffre serviceAppeloffre;

    @GetMapping(value = "/appeloffres/{idAO}")
    public Appeloffre findAppeloffreByIdAO(@PathVariable("idAO") int idAO){
        return serviceAppeloffre.findAppeloffreById_appeloffre(idAO);
    }
    @GetMapping(value = "/appeloffres")
    public List<Appeloffre> findAllAppeloffre(){
        return serviceAppeloffre.findAllAppeloffre();
    }
    @PostMapping(value = "/saveAO/{libeleCourt}")
    public Appeloffre saveAppeloffre(@RequestBody Appeloffre appeloffre, @PathVariable String libeleCourt){
        return serviceAppeloffre.saveAppeloffre(appeloffre, libeleCourt);
    }
}
