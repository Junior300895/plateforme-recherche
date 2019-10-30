package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.dao.ChercheurRepository;
import sn.codeart.msa.model.Chercheur;
import sn.codeart.msa.proxies.MicroserviceInfoProxy;

import java.util.Date;

@SpringBootTest
class MicroserviceChercheurApplicationTests {

	@Autowired
    private ChercheurRepository chercheurRepository;
	@Autowired
	private MicroserviceInfoProxy microserviceInfoProxy;

	@Test
    void contextLoads() {
		int idFonction = microserviceInfoProxy.findFonctionByLibeleCourt("Enseignant").getIdFonction();
		int idGrade = microserviceInfoProxy.findGradeByLibeleCourt("Titulaire").getIdGrade();
		int idStatut = microserviceInfoProxy.findStatutByLibeleCourt("EnseignantChercheur").getIdStatut();
        /*
		 Test sur chercheur
		 */
        // 1
		Chercheur chercheur = new Chercheur();
		chercheur.setId_fonction(idFonction);
		chercheur.setId_grade(idGrade);
		chercheur.setId_statut(idStatut);
		chercheur.setPrenom("Karim");
		chercheur.setNom("Konate");
		chercheur.setNe_le(new Date());
		chercheur.setLieu_de_naissance("Russie");
		chercheur.setEmail("karim@yahoo.fr");
		chercheur.setCivilité("M");

		chercheurRepository.save(chercheur);
		// 2
		Chercheur chercheur2 = new Chercheur();
		chercheur2.setId_fonction(idFonction);
		chercheur2.setId_grade(idGrade);
		chercheur2.setId_statut(idStatut);
		chercheur2.setPrenom("Junior");
		chercheur2.setNom("Ndoye");
		chercheur2.setNe_le(new Date());
		chercheur2.setLieu_de_naissance("Dakar");
		chercheur2.setEmail("abadaa9518@gmail.com");
		chercheur2.setCivilité("M");
		chercheurRepository.save(chercheur2);


		Assert.assertEquals("test sur insertion du chercheur 1","Karim",chercheur.getPrenom());
		Assert.assertEquals("test sur insertion du chercheur 2","Junior",chercheur2.getPrenom());
    }

}
