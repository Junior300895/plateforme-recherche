package sn.codeart.msa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Responsable {
    @Id @GeneratedValue
    private int id;
    //private int idChercheur;
    //private String nomChercheur;
    //private String email;
    @Embedded
    private Chercheur chercheur;

    @JsonIgnore
    @OneToMany(mappedBy = "typeUniteRecherche", fetch = FetchType.LAZY)
    private List<UniteRecherche> uniteRecherches;

    public Responsable() {
    }

    public Chercheur getChercheur() {
        return chercheur;
    }

    public void setChercheur(Chercheur chercheur) {
        this.chercheur = chercheur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<UniteRecherche> getUniteRecherches() {
        return uniteRecherches;
    }

    public void setUniteRecherches(List<UniteRecherche> uniteRecherches) {
        this.uniteRecherches = uniteRecherches;
    }

//    public String getNomChercheur() {
//        return nomChercheur;
//    }
//
//    public void setNomChercheur(String nomChercheur) {
//        this.nomChercheur = nomChercheur;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getIdChercheur() {
//        return idChercheur;
//    }
//
//    public void setIdChercheur(int idChercheur) {
//        this.idChercheur = idChercheur;
//    }
}
