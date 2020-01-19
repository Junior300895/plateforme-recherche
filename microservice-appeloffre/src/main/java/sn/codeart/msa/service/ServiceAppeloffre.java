package sn.codeart.msa.service;

import org.springframework.stereotype.Service;
import sn.codeart.msa.beans.ThematiqueBean;
import sn.codeart.msa.model.Appeloffre;

import java.util.List;

public interface ServiceAppeloffre {
    Appeloffre findAppeloffreById_appeloffre(int idAO);
    List<Appeloffre> findAllAppeloffre();
    Appeloffre saveAppeloffre(Appeloffre appeloffre, String thematiqueLibeleCourt);
}
