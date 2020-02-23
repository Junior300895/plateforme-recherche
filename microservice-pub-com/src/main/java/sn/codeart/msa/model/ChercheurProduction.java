package sn.codeart.msa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class ChercheurProduction {
    @Id @GeneratedValue
    private int id;
    private int rangChercheur;
    private boolean miseEnLignePar;
//    private String nomChercheur;
//    private String emailChercheur;
//    private int idChercheur;
    @Embedded
    private Chercheur chercheur;

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

    public int getRangChercheur() {
        return rangChercheur;
    }

    public void setRangChercheur(int rangChercheur) {
        this.rangChercheur = rangChercheur;
    }

    public boolean isMiseEnLignePar() {
        return miseEnLignePar;
    }

    public void setMiseEnLignePar(boolean miseEnLignePar) {
        this.miseEnLignePar = miseEnLignePar;
    }

    public Chercheur getChercheur() {
        return chercheur;
    }

    public void setChercheur(Chercheur chercheur) {
        this.chercheur = chercheur;
    }

    public Production getProduction() {
        return production;
    }

    public void setProduction(Production production) {
        this.production = production;
    }
}
