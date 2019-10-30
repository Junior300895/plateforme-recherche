package sn.codeart.msa.model;

import sn.codeart.msa.beans.ChercheurBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Fonction {
    @Id @GeneratedValue
    private int idFonction;
    private String libeleCourt;
    private String libeleLong;

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

    @Override
    public String toString() {
        return "Fonction{" +
                "idFonction=" + idFonction +
                ", libeleCourt='" + libeleCourt + '\'' +
                ", libeleLong='" + libeleLong + '\'' +
                '}';
    }
}
