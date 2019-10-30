package sn.codeart.msa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.codeart.msa.dao.ChercheurRepository;
import sn.codeart.msa.model.Chercheur;

import java.util.List;

@RestController
public class ChercheurController {

    @Autowired
    private ChercheurRepository chercheurRepository;

    @GetMapping(value = "/chercheurs")
    public List<Chercheur> findAllChercheur(){
        return chercheurRepository.findAll();
    }
}
