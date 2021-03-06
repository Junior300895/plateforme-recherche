package sn.codeart.msa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Thematique {
    @Id
    @GeneratedValue
    private int idThematique;
    private String libeleCourt;
    private String libeleLong;

    @JsonIgnore
    @ManyToMany(mappedBy = "thematiques", fetch = FetchType.LAZY)
    Set<Chercheur> chercheurs;

    public Thematique() {
    }

    public int getIdThematique() {
        return idThematique;
    }

    public void setIdThematique(int idThematique) {
        this.idThematique = idThematique;
    }

    public String getLibeleCourt() {
        return libeleCourt;
    }

    public void setLibeleCourt(String libeleCourt) {
        this.libeleCourt = libeleCourt;
    }

    public String getLibeleLong() {
        return libeleLong;
    }

    public void setLibeleLong(String libeleLong) {
        this.libeleLong = libeleLong;
    }

    public Set<Chercheur> getChercheurs() {
        return chercheurs;
    }

    public void setChercheurs(Set<Chercheur> chercheurs) {
        this.chercheurs = chercheurs;
    }

    @Override
    public String toString() {
        return "Thematique{" +
                "idThematique=" + idThematique +
                ", libeleCourt='" + libeleCourt + '\'' +
                ", libeleLong='" + libeleLong + '\'' +
                ", chercheurs=" + chercheurs +
                '}';
    }
}
