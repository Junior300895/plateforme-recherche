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

    @OneToMany(mappedBy = "TypeProduction", fetch = FetchType.LAZY)
    private List<Production> productions;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_SousTypeProd")
    private SousTypeProduction sousTypeProduction;

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

    public SousTypeProduction getSousTypeProduction() {
        return sousTypeProduction;
    }

    public void setSousTypeProduction(SousTypeProduction sousTypeProduction) {
        this.sousTypeProduction = sousTypeProduction;
    }
}
