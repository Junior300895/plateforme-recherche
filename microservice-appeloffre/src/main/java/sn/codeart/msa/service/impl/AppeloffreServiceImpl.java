package sn.codeart.msa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.codeart.msa.dao.AppeloffreRepository;
import sn.codeart.msa.model.Appeloffre;
import sn.codeart.msa.service.AppeloffreService;
@Service
public class AppeloffreServiceImpl implements AppeloffreService {
    @Autowired
    private AppeloffreRepository appeloffreRepository;

    @Override
    public Appeloffre findAppeloffreById_appeloffre(int idAO) {
        return appeloffreRepository.findAppeloffreByIdAppeloffre(idAO);
    }
}
