package sn.codeart.msa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Grade {
    @Id
    @GeneratedValue
    private int idGrade;
    private String libeleCourt;
    private String libeleLong;
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "grade")
    private List<Chercheur> chercheurs;

    public Grade() {
    }

    public int getIdGrade() {
        return idGrade;
    }

    public void setIdGrade(int idGrade) {
        this.idGrade = idGrade;
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
        return "Grade{" +
                "idGrade=" + idGrade +
                ", libeleCourt='" + libeleCourt + '\'' +
                ", libeleLong='" + libeleLong + '\'' +
            //    ", chercheurs=" + chercheurs +
                '}';
    }
}
