package sn.codeart.msa.model;

import sn.codeart.msa.beans.ChercheurBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Diplome {
    @Id
    @GeneratedValue
    private int idDiplome;
    private String libeleCourt;
    private String libeleLong;

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

    @Override
    public String toString() {
        return "Diplome{" +
                "idDiplome=" + idDiplome +
                ", libeleCourt='" + libeleCourt + '\'' +
                ", libeleLong='" + libeleLong + '\'' +
                '}';
    }
}
