package sn.codeart.msa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "thematique_appeloffre")
public class AppeloffreThematique {
    @Id
    private int id;
    private int idThematique;
    private int idAppeloffre;

    public AppeloffreThematique() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id=" + id +
                ", idThematique=" + idThematique +
                ", idAppeloffre=" + idAppeloffre +
                '}';
    }
}
