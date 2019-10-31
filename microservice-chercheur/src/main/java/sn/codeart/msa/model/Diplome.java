package sn.codeart.msa.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Diplome {
    @Id @GeneratedValue
    private int idDiplome;
    private String libeleCourt;
    private String libeleLong;
    @OneToMany(mappedBy="diplome",fetch = FetchType.EAGER)
    private List<ChercheurDiplome> chercheurs;

    public Diplome() {
    }

    public int getIdDiplome() {
        return idDiplome;
    }

    public void setIdDiplome(int idDiplome) {
        this.idDiplome = idDiplome;
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

    public List<ChercheurDiplome> getChercheurs() {
        return chercheurs;
    }

    public void setChercheurs(List<ChercheurDiplome> chercheurs) {
        this.chercheurs = chercheurs;
    }

    @Override
    public String toString() {
        return "Diplome{" +
                "idDiplome=" + idDiplome +
                ", libeleCourt='" + libeleCourt + '\'' +
                ", libeleLong='" + libeleLong + '\'' +
                ", chercheurs=" + chercheurs +
                '}';
    }
}
