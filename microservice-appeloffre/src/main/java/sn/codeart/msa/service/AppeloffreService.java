package sn.codeart.msa.service;

import org.springframework.stereotype.Service;
import sn.codeart.msa.model.Appeloffre;

public interface AppeloffreService {
    Appeloffre findAppeloffreById_appeloffre(int idAO);
}
