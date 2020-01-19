package sn.codeart.msa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
@Entity
public class SousTypeProduction {
    @Id
    @GeneratedValue
    private int idSousTypeProduction;
    @Column(unique = true)
    private String libelecourt;
    @Column(unique = true)
    private String libelelong;

    @JsonIgnore
    @OneToMany(mappedBy = "sousTypeProduction", fetch = FetchType.LAZY)
    private List<TypeProduction> typeProductions;

    public SousTypeProduction() {
    }

    public int getIdSousTypeProduction() {
        return idSousTypeProduction;
    }

    public void setIdSousTypeProduction(int idSousTypeProduction) {
        this.idSousTypeProduction = idSousTypeProduction;
    }

    public String getLibelecourt() {
        return libelecourt;
    }

    public void setLibelecourt(String libelecourt) {
        this.libelecourt = libelecourt;
    }

    public String getLibelelong() {
        return libelelong;
    }

    public void setLibelelong(String libelelong) {
        this.libelelong = libelelong;
    }

    public List<TypeProduction> getTypeProductions() {
        return typeProductions;
    }

    public void setTypeProductions(List<TypeProduction> typeProductions) {
        this.typeProductions = typeProductions;
    }
}
