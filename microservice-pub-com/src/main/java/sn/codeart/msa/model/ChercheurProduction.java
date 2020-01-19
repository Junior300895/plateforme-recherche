package sn.codeart.msa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class ChercheurProduction {
    @Id @GeneratedValue
    private int id;
    private int rangChercheur;
    private String nomChercheur;
    private int idChercheur;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Production", nullable = false)
    private Production production;

    public ChercheurProduction() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdChercheur() {
        return idChercheur;
    }

    public void setIdChercheur(int idChercheur) {
        this.idChercheur = idChercheur;
    }

    public int getRangChercheur() {
        return rangChercheur;
    }

    public void setRangChercheur(int rangChercheur) {
        this.rangChercheur = rangChercheur;
    }

    public String getNomChercheur() {
        return nomChercheur;
    }

    public void setNomChercheur(String nomChercheur) {
        this.nomChercheur = nomChercheur;
    }
    public Production getProduction() {
        return production;
    }

    public void setProduction(Production production) {
        this.production = production;
    }
}
