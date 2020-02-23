package sn.codeart.msa.service;

import org.springframework.stereotype.Service;
import sn.codeart.msa.model.UniteRecherche;

@Service
public interface UniteRechercheService {
    UniteRecherche saveUniteRecherche(UniteRecherche uniteRecherche, String t_u_r, String struct);
    public UniteRecherche saveUniteRechercheWithResponsable(UniteRecherche uniteRecherche, String tur,
                                                            String struct, String emailResponsable);
    UniteRecherche findUniteRechercheByLibeleCourt(String lc);
    UniteRecherche deleteUniteRecherche(int id);
}
