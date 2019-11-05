package sn.codeart.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sn.codeart.msa.model.Appeloffre;
import sn.codeart.msa.service.AppeloffreService;

@RestController
public class AppeloffreController {

    @Autowired
    private AppeloffreService appeloffreService;

    @GetMapping(value = "/appeloffres/{idAO}")
    public Appeloffre findAppeloffreByIdAO(@PathVariable("idAO") int idAO){
        return appeloffreService.findAppeloffreById_appeloffre(idAO);
    }
}
