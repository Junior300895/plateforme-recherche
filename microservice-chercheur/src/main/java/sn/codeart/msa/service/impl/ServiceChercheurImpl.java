package sn.codeart.msa.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.codeart.msa.beans.StructureBean;
import sn.codeart.msa.beans.UniteRechercheBean;
import sn.codeart.msa.dao.*;
import sn.codeart.msa.model.*;
import sn.codeart.msa.proxies.MicroserviceStructureProxy;
import sn.codeart.msa.service.ServiceChercheur;

import java.util.Arrays;
import java.util.List;

@Service
public class ServiceChercheurImpl implements ServiceChercheur {
    private final Logger log = LoggerFactory.getLogger(ServiceChercheur.class);


    @Autowired
    private FonctionRepository fonctionRepository;
    @Autowired
    private GradeRepository gradeRepository;
    @Autowired
    private StatutRepository statutRepository;
    @Autowired
    private ThematiqueRepository thematiqueRepository;
    @Autowired
    private MicroserviceStructureProxy structureProxy;
    @Autowired
    private ChercheurRepository chercheurRepository;

    @Override
    public Chercheur saveCherheur(
            Chercheur chercheur, String lcThematique, String lcFonction,
            String lcGrade, String lcStatut, String lcStructure, String lcUniterecherche) {
        Fonction fonction = fonctionRepository.findFonctionByLibeleCourt(lcFonction);
        Grade grade = gradeRepository.findGradeByLibeleCourt(lcGrade);
        Statut statut = statutRepository.findStatutByLibeleCourt(lcStatut);
        Thematique thematique = thematiqueRepository.findThematiqueByLibeleCourt(lcThematique);
        StructureBean structureBean = structureProxy.findStructureByLc(lcStructure);
        UniteRechercheBean uniteRechercheBean = structureProxy.findUniteByLc(lcUniterecherche);

        chercheur.setFonction(fonction);
        chercheur.setGrade(grade);
        chercheur.setStatut(statut);
        chercheur.setThematiques(Arrays.asList(thematique));
        chercheur.setIdStructure(structureBean.getIdStructure());
        chercheur.setIdUniteRecherche(uniteRechercheBean.getIdUnite());

        return chercheurRepository.save(chercheur);
    }

    @Override
    public Chercheur deleteChercheur(String email) {
        Chercheur chercheur = chercheurRepository.findChercheurByEmail(email);
        if (chercheur != null) {
            log.info("chercheur {} exist", email);
            chercheurRepository.delete(chercheur);
            return chercheur;
        }
        return null;
    }

    @Override
    public Thematique saveThematique(String libele) {
        Thematique thematique = new Thematique();
        thematique.setLibeleCourt(libele);
        return thematiqueRepository.save(thematique);
    }

    @Override
    public Fonction saveFonction(String libele) {
        Fonction fonction = new Fonction();
        fonction.setLibeleCourt(libele);
        return fonctionRepository.save(fonction);
    }

    @Override
    public Grade saveGrade(String libele) {
        Grade grade = new Grade();
        grade.setLibeleCourt(libele);
        return gradeRepository.save(grade);
    }

    @Override
    public Statut saveStatut(String libele) {
        Statut statut = new Statut();
        statut.setLibeleCourt(libele);
        return statutRepository.save(statut);
    }

    @Override
    public Thematique deleteThematique(String libele) {
        Thematique thematique = thematiqueRepository.findThematiqueByLibeleCourt(libele);
        if (thematique != null) {
            log.info("thematique {} exist", thematique);
            thematiqueRepository.delete(thematique);
            return thematique;
        }
        return null;
    }

    @Override
    public Fonction deleteFonction(String libele) {
        Fonction fonction = fonctionRepository.findFonctionByLibeleCourt(libele);
        if (fonction != null) {
            log.info("thematique {} exist", fonction);
            fonctionRepository.delete(fonction);
            return fonction;
        }
        return null;
    }

    @Override
    public Grade deleteGrade(String libele) {
        Grade grade = gradeRepository.findGradeByLibeleCourt(libele);
        if (grade != null) {
            log.info("thematique {} exist", grade);
            gradeRepository.delete(grade);
            return grade;
        }
        return null;
    }

    @Override
    public Statut deleteStatut(String libele) {
        Statut statut = statutRepository.findStatutByLibeleCourt(libele);
        if (statut != null) {
            log.info("thematique {} exist", statut);
            statutRepository.delete(statut);
            return statut;
        }
        return null;
    }

    @Override
    public Thematique updateThematique(int id, String libele) {
        Thematique thematique = thematiqueRepository.findThematiqueByIdThematique(id);
        if (thematique != null) {
            log.info("thematique delete {} exist", thematique);
            thematique.setLibeleCourt(libele);
            return thematiqueRepository.save(thematique);
        }
        return null;
    }

    @Override
    public Fonction updateFonction(int id, String libele) {
        Fonction fonction = fonctionRepository.findFonctionByIdFonction(id);
        if (fonction != null) {
            log.info("thematique delete {} exist", fonction);
            fonction.setLibeleCourt(libele);
            return fonctionRepository.save(fonction);
        }
        return null;
    }

    @Override
    public Grade updateGrade(int id, String libele) {
        Grade grade = gradeRepository.findGradeByIdGrade(id);
        if (grade != null) {
            log.info("thematique delete {} exist", grade);
            grade.setLibeleCourt(libele);
            return gradeRepository.save(grade);
        }
        return null;
    }

    @Override
    public Statut updateStatut(int id, String libele) {
        Statut statut = statutRepository.findStatutByIdStatut(id);
        if (statut != null) {
            log.info("thematique delete {} exist", statut);
            statut.setLibeleCourt(libele);
            return statutRepository.save(statut);
        }
        return null;
    }
}
