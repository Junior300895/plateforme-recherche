package sn.codeart.msa;

import org.apache.kafka.common.protocol.types.Field;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.dao.*;
import sn.codeart.msa.model.*;
import sn.codeart.msa.proxies.MicroserviceInfoProxy;

import java.util.Date;
import java.util.List;

@SpringBootTest
class YMicroserviceChercheurApplicationTests {

	@Autowired
    private ChercheurRepository chercheurRepository;
	@Autowired
	private FonctionRepository fonctionRepository;
	@Autowired
	private GradeRepository gradeRepository;
	@Autowired
	private StatutRepository statutRepository;
	@Autowired
	private ThematiqueRepository thematiqueRepository;


	@Test
    void contextLoads() {
		Fonction fonction1= fonctionRepository.findFonctionByLibeleCourt("Enseignant");
		Grade grade1 = gradeRepository.findGradeByLibeleCourt("Titulaire");
		Statut statut1 = statutRepository.findStatutByLibeleCourt("EnseignantChercheur");
		List<Thematique> thematiques = thematiqueRepository.findAll();
        /*
		 Test sur chercheur
		 */
        // 1
		Chercheur chercheur = new Chercheur();
		chercheur.setFonction(fonction1);
		chercheur.setGrade(grade1);
		chercheur.setStatut(statut1);
		chercheur.setPrenom("Karim");
		chercheur.setNom("Konate");
		chercheur.setNe_le(new Date());
		chercheur.setLieu_de_naissance("Russie");
		chercheur.setEmail("karim@yahoo.fr");
		chercheur.setCivilité("M");
		chercheur.setThematiques(thematiques);

		chercheurRepository.save(chercheur);
		// 2
		Chercheur chercheur2 = new Chercheur();
		chercheur2.setFonction(fonction1);
		chercheur2.setGrade(grade1);
		chercheur2.setStatut(statut1);
		chercheur2.setPrenom("Junior");
		chercheur2.setNom("Ndoye");
		chercheur2.setNe_le(new Date());
		chercheur2.setLieu_de_naissance("Dakar");
		chercheur2.setEmail("abadaa9518@gmail.com");
		chercheur2.setCivilité("M");
		chercheurRepository.save(chercheur2);


		Assert.assertEquals("test sur insertion du chercheur 1","Karim",
				chercheur.getPrenom());
		Assert.assertEquals("test sur insertion du chercheur 2","Junior",
				chercheur2.getPrenom());

	}

}
