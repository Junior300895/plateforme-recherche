package sn.codeart.msa.beans;

import sn.codeart.msa.model.Chercheur;

import java.io.Serializable;
import java.util.List;

public class ThematiqueBean {
    private int idAppeloffre;
    private int idThematique;

    public ThematiqueBean() {
    }

    public int getIdAppeloffre() {
        return idAppeloffre;
    }

    public void setIdAppeloffre(int idAppeloffre) {
        this.idAppeloffre = idAppeloffre;
    }

    public int getIdThematique() {
        return idThematique;
    }

    public void setIdThematique(int idThematique) {
        this.idThematique = idThematique;
    }

    @Override
    public String toString() {
        return "ThematiqueBean{" +
                "idAppeloffre=" + idAppeloffre +
                ", idThematique=" + idThematique +
                '}';
    }
}
