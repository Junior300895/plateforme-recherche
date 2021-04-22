package sn.codeart.msa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.codeart.msa.dao.*;
import sn.codeart.msa.model.*;
import sn.codeart.msa.proxies.MicroserviceStructureProxy;
import sn.codeart.msa.service.ServiceChercheur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class ChercheurApplicationTests {

	@Autowired
	private ServiceChercheur serviceChercheur;

	@Test
	void contextLoads() {
		// 1
		Chercheur chercheur = new Chercheur();
		chercheur.setPrenom("Seydou");
		chercheur.setNom("Diallo");
		chercheur.setEmail("diallodiery301@gmail.com");
		chercheur.setNe_le(new Date());
		chercheur.setLieu_de_naissance("Russie");
		chercheur.setNationalite("SEN");
		chercheur.setAdresse_perso("DK");
		List<String> lcThematiques = new ArrayList<>();
		lcThematiques.add("Intelligence Artificielle");
		lcThematiques.add("Deep Learning");

		chercheur = serviceChercheur.saveCherheur(chercheur, lcThematiques, "Titulaire",
				"EnseignantChercheur", "FST", "Equipe d’Algèbre");
		Assert.assertNotNull("test sur insertion du chercheur 1", chercheur);
		
		// 2
		Chercheur chercheur2 = new Chercheur();
		chercheur2.setPrenom("Junior");
		chercheur2.setNom("Ndoye");
		chercheur2.setEmail("juniorndoye95@gmail.com");
		chercheur2.setNe_le(new Date());
		chercheur2.setLieu_de_naissance("Dakar");
		chercheur2.setNationalite("SEN");
		chercheur2.setAdresse_perso("DK");
		List<String> lcThematiques2 = new ArrayList<>();
		lcThematiques2.add("Big DATA");

		chercheur2 = serviceChercheur.saveCherheur(chercheur2, lcThematiques2, "Titulaire", "EnseignantChercheur",
				"FST", "Groupe de Recherche sur l’Exclusion");
		Assert.assertNotNull("test sur insertion du chercheur 2", chercheur2);
		
		// 3
		Chercheur chercheur3 = new Chercheur();
		chercheur3.setPrenom("Falilou");
		chercheur3.setNom("Niang");
		chercheur3.setEmail("fallou@gmail.com");
		chercheur3.setNe_le(new Date());
		chercheur3.setLieu_de_naissance("Dakar");
		chercheur3.setNationalite("SEN");
		chercheur3.setAdresse_perso("DK");
		List<String> lcThematiques3 = new ArrayList<>();
		lcThematiques3.add("Orthopédie Dento-Faciale");
		
		chercheur3 = serviceChercheur.saveCherheur(chercheur3, lcThematiques3, "Titulaire", "EnseignantChercheur",
				"FMPO", "Groupe de Recherche sur l’Exclusion");
		Assert.assertNotNull("test sur insertion du chercheur 3", chercheur3);
		
		// 4
		Chercheur chercheur4 = new Chercheur();
		chercheur4.setPrenom("Malick Ada");
		chercheur4.setNom("Gaye");
		chercheur4.setEmail("malick@gmail.com");
		chercheur4.setNe_le(new Date());
		chercheur4.setLieu_de_naissance("Dakar");
		chercheur4.setNationalite("SEN");
		chercheur4.setAdresse_perso("DK");
		List<String> lcThematiques4 = new ArrayList<>();
		lcThematiques4.add("Orthopédie Dento-Faciale");
		lcThematiques4.add("Espagnol-Civilisation latino-américaine");
		
		
		chercheur4 = serviceChercheur.saveCherheur(chercheur4, lcThematiques4, "Titulaire", "EnseignantChercheur",
				"FST", "Anatomie Pathologique");
		Assert.assertNotNull("test sur insertion du chercheur 4", chercheur4);

	}

}
