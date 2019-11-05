package sn.codeart.msa.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "appeloffre_thematique")
@IdClass(AppelOffreThematiqueId.class)
public class AppeloffreThematique {
    @Id
    private int idAppeloffre;
    @Id
    private int idThematique;

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
                "idAppeloffre=" + idAppeloffre +
                ", idThematique=" + idThematique +
                '}';
    }
}
