package sn.codeart.msa.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.codeart.msa.dao.ResponsableRepository;
import sn.codeart.msa.dao.StructureRepository;
import sn.codeart.msa.dao.TypeUniteRechercheRepository;
import sn.codeart.msa.dao.UniteRechercheRepository;
import sn.codeart.msa.model.Chercheur;
import sn.codeart.msa.model.Responsable;
import sn.codeart.msa.model.UniteRecherche;
import sn.codeart.msa.proxies.MicroserviceChercheurProxy;
import sn.codeart.msa.service.UniteRechercheService;

@Service
public class UniteRechercheServiceImpl implements UniteRechercheService {

    private final Logger log = LoggerFactory.getLogger(UniteRechercheServiceImpl.class);

    @Autowired
    private UniteRechercheRepository uniteRechercheRepository;
    @Autowired
    private TypeUniteRechercheRepository typeUniteRechercheRepository;
    @Autowired
    private StructureRepository structureRepository;
    @Autowired
    private ResponsableRepository responsableRepository;
    @Autowired
    private MicroserviceChercheurProxy chercheurProxy;

    @Override
    public UniteRecherche saveUniteRecherche(UniteRecherche uniteRecherche, String tur, String struct) {
        uniteRecherche.setTypeUniteRecherche(typeUniteRechercheRepository
                .findTypeUniteRechercheByLibeleCourt(tur));
        uniteRecherche.setStructure(structureRepository
                .findStructureByLibeleCourt(struct));
        return uniteRechercheRepository.save(uniteRecherche);
    }
    @Override
    public UniteRecherche saveUniteRechercheWithResponsable(UniteRecherche uniteRecherche, String tur,
                                                            String struct, String emailResponsable) {
        UniteRecherche uniteRecherche1 = null;
        if(uniteRecherche.getIdUnite() == 0){ // nouvel ajout
            uniteRecherche.setTypeUniteRecherche(typeUniteRechercheRepository
                    .findTypeUniteRechercheByLibeleCourt(tur));
            uniteRecherche.setStructure(structureRepository
                    .findStructureByLibeleCourt(struct));

        }else{ // modification
            uniteRecherche1 = uniteRechercheRepository
                    .findUniteRechercheByIdUnite(uniteRecherche.getIdUnite());
            uniteRecherche1 = uniteRecherche;
            uniteRecherche1.setTypeUniteRecherche(typeUniteRechercheRepository
                    .findTypeUniteRechercheByLibeleCourt(tur));
            uniteRecherche1.setStructure(structureRepository
                    .findStructureByLibeleCourt(struct));
        }


        //ChercheurBean chercheurBean = chercheurProxy.findChercheurByEmail(emailResponsable);
        Chercheur chercheur = chercheurProxy.findChercheurByEmail(emailResponsable);

        if(chercheur != null){

            Responsable responsable = new Responsable();
//            responsable.setIdChercheur(chercheurBean.getIdChercheur());
//            responsable.setEmail(chercheurBean.getEmail());
//            responsable.setNomChercheur(chercheurBean.getPrenom()+" "+chercheurBean.getNom());
            responsable.setChercheur(chercheur);
            responsable = responsableRepository.save(responsable);
            if(responsable != null) {
                uniteRecherche.setResponsable(responsable);
                if(uniteRecherche.getIdUnite() == 0)
                    return uniteRechercheRepository.save(uniteRecherche);
                return uniteRechercheRepository.save(uniteRecherche1);
            }
            return null;
        }

        return null;
    }

    @Override
    public UniteRecherche findUniteRechercheByLibeleCourt(String lc) {
        return uniteRechercheRepository.findUniteRechercheByLibeleCourt(lc);
    }

    @Transactional
    @Override
    public UniteRecherche deleteUniteRecherche(int id) {
        UniteRecherche uniteRecherche = uniteRechercheRepository.findUniteRechercheByIdUnite(id);
        if(uniteRecherche!=null){
            log.info("unite {} existe", uniteRecherche);
            uniteRechercheRepository.delete(uniteRecherche);
            return uniteRecherche;
        }
        return null;
    }
}
