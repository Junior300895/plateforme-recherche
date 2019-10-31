package sn.codeart.msa.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Statut {
    @Id @GeneratedValue
    private int idStatut;
    private String libeleCourt;
    private String libeleLong;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fonction")
    private List<Chercheur> chercheurs;

    public Statut() {
    }

    public int getIdStatut() {
        return idStatut;
    }

    public void setIdStatut(int idStatut) {
        this.idStatut = idStatut;
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
        return "Statut{" +
                "idStatut=" + idStatut +
                ", libeleCourt='" + libeleCourt + '\'' +
                ", libeleLong='" + libeleLong + '\'' +
                ", chercheurs=" + chercheurs +
                '}';
    }
}
