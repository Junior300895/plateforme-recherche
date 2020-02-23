package sn.codeart.msa.service;

import org.springframework.stereotype.Service;
import sn.codeart.msa.model.*;

@Service
public interface ServiceChercheur {
    public Chercheur saveCherheur(Chercheur chercheur, String thematique, String fonction,
                                  String grade, String statut, String structure, String uniteRecherche);
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
