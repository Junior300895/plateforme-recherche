package sn.codeart.msa.model;

import javax.persistence.*;

@Entity
public class ChercheurPublication {
    @Id @GeneratedValue
    private int idChercheurPub;
//    private int idChercheur;
//    private int idPublication;
    private int rangChercheur;
    private String nomChercheur;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Chercheur")
    private Chercheur chercheur;

    public ChercheurPublication() {
    }

    public int getIdChercheurPub() {
        return idChercheurPub;
    }

    public void setIdChercheurPub(int idChercheurPub) {
        this.idChercheurPub = idChercheurPub;
    }

//    public int getIdChercheur() {
//        return idChercheur;
//    }
//
//    public void setIdChercheur(int idChercheur) {
//        this.idChercheur = idChercheur;
//    }
//
//    public int getIdPublication() {
//        return idPublication;
//    }
//
//    public void setIdPublication(int idPublication) {
//        this.idPublication = idPublication;
//    }

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
}
