package sn.codeart.msa.model;

import sn.codeart.msa.beans.ThematiqueBean;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Set;

public class Appeloffre {
    @Id @GeneratedValue
    private int id_appeloffre;
    private String intitule;
    private Date date_parution;
    private Date date_limite_depot;
    private Date date_annonce_projet;
    private Date date_debut_travaux;
    private String description_projet;
    private Double montant;
    private String emetteur;

    private Set<ThematiqueBean> thematiqueBeans;

}
