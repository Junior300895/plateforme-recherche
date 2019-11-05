package sn.codeart.msa.model;

import sn.codeart.msa.beans.ThematiqueBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.Set;

@Entity
public class Appeloffre {
    @Id
    @GeneratedValue
    private int idAppeloffre;
    private String intitule;
    private Date date_parution;
    private Date date_limite_depot;
    private Date date_annonce_projet;
    private Date date_debut_travaux;
    private String description_projet;
    private Double montant;
    private String emetteur;

    public Appeloffre() {
    }

    public int getIdAppeloffre() {
        return idAppeloffre;
    }

    public void setIdAppeloffre(int idAppeloffre) {
        this.idAppeloffre = idAppeloffre;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Date getDate_parution() {
        return date_parution;
    }

    public void setDate_parution(Date date_parution) {
        this.date_parution = date_parution;
    }

    public Date getDate_limite_depot() {
        return date_limite_depot;
    }

    public void setDate_limite_depot(Date date_limite_depot) {
        this.date_limite_depot = date_limite_depot;
    }

    public Date getDate_annonce_projet() {
        return date_annonce_projet;
    }

    public void setDate_annonce_projet(Date date_annonce_projet) {
        this.date_annonce_projet = date_annonce_projet;
    }

    public Date getDate_debut_travaux() {
        return date_debut_travaux;
    }

    public void setDate_debut_travaux(Date date_debut_travaux) {
        this.date_debut_travaux = date_debut_travaux;
    }

    public String getDescription_projet() {
        return description_projet;
    }

    public void setDescription_projet(String description_projet) {
        this.description_projet = description_projet;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(String emetteur) {
        this.emetteur = emetteur;
    }
}
