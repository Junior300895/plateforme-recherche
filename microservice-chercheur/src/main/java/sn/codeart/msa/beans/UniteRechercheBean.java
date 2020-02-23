package sn.codeart.msa.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

public class UniteRechercheBean {
    private int idUnite;
    private String identifiant;
    private String libeleCourt;
    private String libeleLong;
    private String adresse;
    private String telephone;
    private String fax;
    private String email;
    private String url;
    private String descriptif;
    private String mission;
    private String objectif;

    public UniteRechercheBean() {
    }

    public int getIdUnite() {
        return idUnite;
    }

    public void setIdUnite(int idUnite) {
        this.idUnite = idUnite;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibeleCourt() {
        return libeleCourt;
    }

    public void setLibeleCourt(String libeleCourt) {
        this.libeleCourt = libeleCourt;
    }

    public String getLibeleLong() {
        return libeleLong;
    }

    public void setLibeleLong(String libeleLong) {
        this.libeleLong = libeleLong;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

}
