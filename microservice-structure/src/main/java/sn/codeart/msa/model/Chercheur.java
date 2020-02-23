package sn.codeart.msa.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class Chercheur implements Serializable {
    private int idChercheur;
    private String prenom;
    private String nom;
    private Date ne_le;
    private String lieu_de_naissance;
    private String email;
    private String url_page_person;
    private String civilité;
    private String nationalité;
    private String tel_perso;
    private String adresse_perso;
    private String tel_pro;
    private String adresse_pro;
    private String boite_postal;

    public Chercheur() {
    }

    public int getIdChercheur() {
        return idChercheur;
    }

    public void setIdChercheur(int idChercheur) {
        this.idChercheur = idChercheur;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getNe_le() {
        return ne_le;
    }

    public void setNe_le(Date ne_le) {
        this.ne_le = ne_le;
    }

    public String getLieu_de_naissance() {
        return lieu_de_naissance;
    }

    public void setLieu_de_naissance(String lieu_de_naissance) {
        this.lieu_de_naissance = lieu_de_naissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl_page_person() {
        return url_page_person;
    }

    public void setUrl_page_person(String url_page_person) {
        this.url_page_person = url_page_person;
    }

    public String getCivilité() {
        return civilité;
    }

    public void setCivilité(String civilité) {
        this.civilité = civilité;
    }

    public String getNationalité() {
        return nationalité;
    }

    public void setNationalité(String nationalité) {
        this.nationalité = nationalité;
    }

    public String getTel_perso() {
        return tel_perso;
    }

    public void setTel_perso(String tel_perso) {
        this.tel_perso = tel_perso;
    }

    public String getAdresse_perso() {
        return adresse_perso;
    }

    public void setAdresse_perso(String adresse_perso) {
        this.adresse_perso = adresse_perso;
    }

    public String getTel_pro() {
        return tel_pro;
    }

    public void setTel_pro(String tel_pro) {
        this.tel_pro = tel_pro;
    }

    public String getAdresse_pro() {
        return adresse_pro;
    }

    public void setAdresse_pro(String adresse_pro) {
        this.adresse_pro = adresse_pro;
    }

    public String getBoite_postal() {
        return boite_postal;
    }

    public void setBoite_postal(String boite_postal) {
        this.boite_postal = boite_postal;
    }

}
