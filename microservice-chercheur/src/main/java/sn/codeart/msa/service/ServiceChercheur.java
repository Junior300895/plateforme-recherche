package sn.codeart.msa.service;

import java.util.List;

import org.springframework.stereotype.Service;
import sn.codeart.msa.model.*;

@Service
public interface ServiceChercheur {
    Chercheur saveCherheur(Chercheur chercheur, List<String> lcThematiques,
                                  String grade, String statut, String structure, String uniteRecherche);
    Chercheur updateCherheur(Chercheur chercheur, List<String> lcThematiques,
            String grade, String statut, String structure, String uniteRecherche);
    Chercheur findChercheurByID(int id);
    Chercheur deleteChercheur(String email);

    Thematique saveThematique(String libele);
    Fonction saveFonction(String libele);
    Grade saveGrade(String libele);
    Statut saveStatut(String libele);

    Thematique deleteThematique(String libele);
    Fonction deleteFonction(String libele);
    Grade deleteGrade(String libele);
    Statut deleteStatut(String libele);

    Thematique updateThematique(int id, String libele);
    Fonction updateFonction(int id, String libele);
    Grade updateGrade(int id, String libele);
    Statut updateStatut(int id, String libele);
}
