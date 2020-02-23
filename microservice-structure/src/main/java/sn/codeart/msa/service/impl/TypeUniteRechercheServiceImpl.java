package sn.codeart.msa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.codeart.msa.dao.TypeUniteRechercheRepository;
import sn.codeart.msa.model.TypeUniteRecherche;
import sn.codeart.msa.service.TypeUniteRechercheSevice;

@Service
public class TypeUniteRechercheServiceImpl implements TypeUniteRechercheSevice {

    @Autowired
    private TypeUniteRechercheRepository typeUniteRechercheRepository;

    @Override
    public TypeUniteRecherche saveTypeUniteRecherche(TypeUniteRecherche typeUniteRecherche) {
        return typeUniteRechercheRepository.save(typeUniteRecherche);
    }
}
