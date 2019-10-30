package sn.codeart.msa.model;

import sn.codeart.msa.beans.DiplomeBean;
import sn.codeart.msa.beans.ThematiqueBean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Chercheur {
    @Id @GeneratedValue
    private int idChercheur;

//    @Column(unique = true)
//    private int id_structure;
    private int id_fonction;
//    @Column(unique = true)
//    private int id_ur;
    private int id_grade;
    private int id_statut;

    private String prenom;
    private String nom;
    private Date ne_le;
    private String lieu_de_naissance;
    @Column(unique = true)
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

    public int getId_fonction() {
        return id_fonction;
    }

    public void setId_fonction(int id_fonction) {
        this.id_fonction = id_fonction;
    }

    public int getId_grade() {
        return id_grade;
    }

    public void setId_grade(int id_grade) {
        this.id_grade = id_grade;
    }

    public int getId_statut() {
        return id_statut;
    }

    public void setId_statut(int id_statut) {
        this.id_statut = id_statut;
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

    @Override
    public String toString() {
        return "Chercheur{" +
                "idChercheur=" + idChercheur +
                ", id_fonction=" + id_fonction +
                ", id_grade=" + id_grade +
                ", id_statut=" + id_statut +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", ne_le=" + ne_le +
                ", lieu_de_naissance='" + lieu_de_naissance + '\'' +
                ", email='" + email + '\'' +
                ", url_page_person='" + url_page_person + '\'' +
                ", civilité='" + civilité + '\'' +
                ", nationalité='" + nationalité + '\'' +
                ", tel_perso='" + tel_perso + '\'' +
                ", adresse_perso='" + adresse_perso + '\'' +
                ", tel_pro='" + tel_pro + '\'' +
                ", adresse_pro='" + adresse_pro + '\'' +
                ", boite_postal='" + boite_postal + '\'' +
                '}';
    }
}
