package sn.codeart.msa.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

public class AppeloffreThematique {
    private int idThematique;
    private int idAppeloffre;

    public AppeloffreThematique() {
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
        return "AppeloffreThematique{" +
                ", idThematique=" + idThematique +
                ", idAppeloffre=" + idAppeloffre +
                '}';
    }
}
