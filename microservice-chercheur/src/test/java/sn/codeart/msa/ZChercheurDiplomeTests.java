package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.dao.ChercheurDiplomeRepository;
import sn.codeart.msa.dao.ChercheurRepository;
import sn.codeart.msa.dao.DiplomeRepository;
import sn.codeart.msa.model.Chercheur;
import sn.codeart.msa.model.ChercheurDiplome;
import sn.codeart.msa.model.Diplome;

import java.util.Date;

@SpringBootTest
class ZChercheurDiplomeTests {

    @Autowired
    private ChercheurRepository chercheurRepository;
    @Autowired
    private DiplomeRepository diplomeRepository;
    @Autowired
    private ChercheurDiplomeRepository chercheurDiplomeRepository;

    @Test
    void contextLoads() {
        Chercheur chercheur = chercheurRepository.findChercheurByEmail("karim@yahoo.fr");
        addDiplome(chercheur, diplomeRepository.
                findDiplomeByLibeleCourt("PhD"), new Date(), "Honorable");
        addDiplome(chercheur, diplomeRepository.
                findDiplomeByLibeleCourt("DEA - Diplôme d’Etat d’architecte"), new Date(), "Très Bien");

        Assert.assertEquals("test sur insertion diplome pour un chercheur", "PhD",
                chercheur.getDiplomes().get(0).getDiplome().getLibeleCourt());

        Chercheur chercheurSave = chercheurRepository.findChercheurByEmail("karim@yahoo.fr");
        System.out.println(chercheurSave.getDiplomes().get(0).getDiplome().getLibeleCourt());
    }

    /*
       Ajouter un diplôme à un chercheur
    */
    public void addDiplome(Chercheur chercheur, Diplome diplome, Date annee, String mention) {
        ChercheurDiplome chercheurDiplome = new ChercheurDiplome();
        chercheurDiplome.setDiplome(diplome);
        chercheurDiplome.setChercheur(chercheur);
        chercheurDiplome.setIdDiplome(diplome.getIdDiplome());
        chercheurDiplome.setIdChercheur(chercheur.getIdChercheur());
        chercheurDiplome.setAnnee(annee);
        chercheurDiplome.setMention(mention);

        chercheurDiplomeRepository.save(chercheurDiplome);
    }
}
