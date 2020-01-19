package sn.codeart.msa.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.codeart.msa.beans.ThematiqueBean;
import sn.codeart.msa.dao.AppeloffreRepository;
import sn.codeart.msa.dao.AppeloffreThematiqueRepository;
import sn.codeart.msa.model.Appeloffre;
import sn.codeart.msa.model.AppeloffreThematique;
import sn.codeart.msa.proxies.MicroserviceChercheurProxy;
import sn.codeart.msa.service.ServiceAppeloffre;

import java.util.Date;
import java.util.List;

@Service
public class ServiceAppeloffreImpl implements ServiceAppeloffre {
    private final Logger logger = LoggerFactory.getLogger(ServiceAppeloffreImpl.class);

    @Autowired
    private AppeloffreRepository appeloffreRepository;
    @Autowired
    private AppeloffreThematiqueRepository appeloffreThematiqueRepository;
    @Autowired
    private MicroserviceChercheurProxy microserviceChercheurProxy;

    @Override
    public Appeloffre findAppeloffreById_appeloffre(int idAO) {
        return appeloffreRepository.findAppeloffreByIdAppeloffre(idAO);
    }

    @Override
    public List<Appeloffre> findAllAppeloffre() {
        return appeloffreRepository.findAll();
    }

    @Override
    public Appeloffre saveAppeloffre(Appeloffre appeloffre, String thematiqueLibeleCourt) {
        ThematiqueBean thematiqueBean = microserviceChercheurProxy.findThematiqueByLibeleCourt(thematiqueLibeleCourt);
        AppeloffreThematique appeloffreThematique = new AppeloffreThematique();
        appeloffreThematique.setIdAppeloffre(appeloffre.getIdAppeloffre());
        appeloffreThematique.setIdThematique(thematiqueBean.getIdThematique());
        appeloffreThematiqueRepository.save(appeloffreThematique);


        appeloffre.setDate_parution(new Date());
        appeloffre = appeloffreRepository.save(appeloffre);

        logger.info("### IDAO=>"+appeloffre.getIdAppeloffre()+" IDTH=>"+thematiqueBean.getIdThematique());
        return appeloffre;
    }
}
