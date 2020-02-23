package sn.codeart.msa.service;

import org.springframework.stereotype.Service;
import sn.codeart.msa.model.TypeUniteRecherche;

@Service
public interface TypeUniteRechercheSevice {
    TypeUniteRecherche saveTypeUniteRecherche(TypeUniteRecherche typeUniteRecherche);
}
