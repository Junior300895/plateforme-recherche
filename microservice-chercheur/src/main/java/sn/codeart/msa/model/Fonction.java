package sn.codeart.msa.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Fonction {
    @Id @GeneratedValue
    private int idFonction;
    private String libeleCourt;
    private String libeleLong;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fonction")
    private List<Chercheur> chercheurs;

    public Fonction() {
    }

    public int getIdFonction() {
        return idFonction;
    }

    public void setIdFonction(int idFonction) {
        this.idFonction = idFonction;
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

    public List<Chercheur> getChercheurs() {
        return chercheurs;
    }

    public void setChercheurs(List<Chercheur> chercheurs) {
        this.chercheurs = chercheurs;
    }

    @Override
    public String toString() {
        return "Fonction{" +
                "idFonction=" + idFonction +
                ", libeleCourt='" + libeleCourt + '\'' +
                ", libeleLong='" + libeleLong + '\'' +
                ", chercheurs=" + chercheurs +
                '}';
    }
}
