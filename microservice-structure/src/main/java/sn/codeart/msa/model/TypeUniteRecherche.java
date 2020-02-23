package sn.codeart.msa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypeUniteRecherche {
    @Id @GeneratedValue
    private int idTypeUnite;
    private String libeleCourt;
    private String libeleLong;

    @JsonIgnore
    @OneToMany(mappedBy = "typeUniteRecherche", fetch = FetchType.LAZY)
    private List<UniteRecherche> uniteRecherches;

    public TypeUniteRecherche() {
    }

    public List<UniteRecherche> getUniteRecherches() {
        return uniteRecherches;
    }

    public void setUniteRecherches(List<UniteRecherche> uniteRecherches) {
        this.uniteRecherches = uniteRecherches;
    }

    public int getIdTypeUnite() {
        return idTypeUnite;
    }

    public void setIdTypeUnite(int idTypeUnite) {
        this.idTypeUnite = idTypeUnite;
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

    @Override
    public String toString() {
        return "TypeUniteRecherche{" +
                "idTypeUnite=" + idTypeUnite +
                ", libeleCourt='" + libeleCourt + '\'' +
                ", libeleLong='" + libeleLong + '\'' +
                '}';
    }
}
