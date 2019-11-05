package sn.codeart.msa.model;

import sn.codeart.msa.beans.ChercheurBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Statut {
    @Id
    @GeneratedValue
    private int idStatut;
    private String libeleCourt;
    private String libeleLong;

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

    @Override
    public String toString() {
        return "Statut{" +
                "idStatut=" + idStatut +
                ", libeleCourt='" + libeleCourt + '\'' +
                ", libeleLong='" + libeleLong + '\'' +
                '}';
    }
}
