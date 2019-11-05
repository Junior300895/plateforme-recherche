package sn.codeart.msa.model;

import sn.codeart.msa.beans.ChercheurBean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;
import java.util.List;

@Entity
@IdClass(DiffusionId.class)
public class Diffusion {
    @Id
    private int idAppeloffre;
    @Id
    private int idChercheur;

    public Diffusion() {
    }

    public int getIdAppeloffre() {
        return idAppeloffre;
    }

    public void setIdAppeloffre(int idAppeloffre) {
        this.idAppeloffre = idAppeloffre;
    }

    public int getIdChercheur() {
        return idChercheur;
    }

    public void setIdChercheur(int idChercheur) {
        this.idChercheur = idChercheur;
    }
}
