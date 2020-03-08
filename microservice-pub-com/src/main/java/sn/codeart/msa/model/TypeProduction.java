package sn.codeart.msa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
@Entity
public class TypeProduction {
    @Id
    @GeneratedValue
    private int idTypeProduction;
    @Column(unique = true)
    private String libelecourt;
    @Column(unique = true)
    private String libelelong;

    private String soustype;

    @JsonIgnore
    @OneToMany(mappedBy = "typeProduction", fetch = FetchType.EAGER)
    private List<Production> productions;

    public TypeProduction() {
    }

    public int getIdTypeProduction() {
        return idTypeProduction;
    }

    public void setIdTypeProduction(int idTypeProduction) {
        this.idTypeProduction = idTypeProduction;
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

    public List<Production> getProductions() {
        return productions;
    }

    public void setProductions(List<Production> productions) {
        this.productions = productions;
    }

    public String getSoustype() {
        return soustype;
    }

    public void setSoustype(String soustype) {
        this.soustype = soustype;
    }
}
