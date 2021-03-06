package sn.codeart.msa.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

public class StructureBean {
    private int idStructure;
    private String libeleCourt;
    private String libeleLong;
    private String adresse;
    private String email;
    private String url;
    private String descriptif;
    private String objectif;
    private String mission;
    private String identifiant;
    private String secretaire;
    private String secretaireadmin;
    private String comitepilotage;
    private String comitesp;

    public StructureBean() {
    }

    public int getIdStructure() {
        return idStructure;
    }

    public void setIdStructure(int idStructure) {
        this.idStructure = idStructure;
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

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getSecretaire() {
        return secretaire;
    }

    public void setSecretaire(String secretaire) {
        this.secretaire = secretaire;
    }

    public String getSecretaireadmin() {
        return secretaireadmin;
    }

    public void setSecretaireadmin(String secretaireadmin) {
        this.secretaireadmin = secretaireadmin;
    }

    public String getComitepilotage() {
        return comitepilotage;
    }

    public void setComitepilotage(String comitepilotage) {
        this.comitepilotage = comitepilotage;
    }

    public String getComitesp() {
        return comitesp;
    }

    public void setComitesp(String comitesp) {
        this.comitesp = comitesp;
    }

}
