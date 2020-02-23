package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.dao.*;
import sn.codeart.msa.model.*;
import sn.codeart.msa.proxies.MicroserviceStructureProxy;
import sn.codeart.msa.service.ServiceChercheur;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ChercheurApplicationTests {

    @Autowired
    private ServiceChercheur serviceChercheur;



    @Test
    void contextLoads() {
//        Fonction fonction1 = fonctionRepository.findFonctionByLibeleCourt("Enseignant");
//        Grade grade1 = gradeRepository.findGradeByLibeleCourt("Titulaire");
//        Statut statut1 = statutRepository.findStatutByLibeleCourt("EnseignantChercheur");
//        List<Thematique> thematiques = thematiqueRepository.findAll();
        /*
		 Test sur chercheur
		 */
        // 1
        Chercheur chercheur = new Chercheur();
//        chercheur.setFonction(fonction1);
//        chercheur.setGrade(grade1);
//        chercheur.setStatut(statut1);
        chercheur.setPrenom("Seydou");
        chercheur.setNom("Diallo");
        chercheur.setEmail("diallodiery301@gmail.com");
        chercheur.setNe_le(new Date());
        chercheur.setLieu_de_naissance("Russie");
        chercheur.setNationalite("SEN");
        chercheur.setAdresse_perso("DK");
//        chercheur.setThematiques(thematiques);
//        chercheur = chercheurRepository.save(chercheur);
        serviceChercheur.saveCherheur(chercheur,"Intelligence Artificielle",
                "Enseignant","Titulaire","EnseignantChercheur",
                "Faculté des Sciences et Techniques","Equipe d’Algèbre");

        // 2
        Chercheur chercheur2 = new Chercheur();
//        chercheur2.setFonction(fonction1);
//        chercheur2.setGrade(grade1);
//        chercheur2.setStatut(statut1);
        chercheur2.setPrenom("Junior");
        chercheur2.setNom("Ndoye");
        chercheur2.setEmail("juniorndoye95@gmail.com");
        chercheur2.setNe_le(new Date());
        chercheur2.setLieu_de_naissance("Dakar");
        chercheur.setNationalite("SEN");
        chercheur.setAdresse_perso("DK");
//        chercheur2.setThematiques(thematiques);
//        chercheur2 = chercheurRepository.save(chercheur2);
        serviceChercheur.saveCherheur(chercheur2,"Deep Learning",
                "Enseignant","Titulaire","EnseignantChercheur",
                "Faculté des Sciences et Techniques","Groupe de Recherche sur l’Exclusion et la Marginalité Sociale");

        Assert.assertNotNull("test sur insertion du chercheur 1",chercheur);
        Assert.assertNotNull("test sur insertion du chercheur 2", chercheur2);

    }

}
