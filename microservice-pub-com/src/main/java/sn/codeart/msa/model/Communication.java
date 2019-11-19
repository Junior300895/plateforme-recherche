package sn.codeart.msa.model;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Communication {
    @Id
    @GeneratedValue
    private int idCommunication;
    private int idChercheur;
    private String libelecourt;
    private String libelelong;
    private Date datecom;
    private String auteur;
    private String lieu;
    private String evenement;
    private String adresse;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_TypeCom")
    private Typecommunication typecommunication;

    public Communication() {
    }

    public int getIdCommunication() {
        return idCommunication;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setIdCommunication(int idCommunication) {
        this.idCommunication = idCommunication;
    }

    public int getIdChercheur() {
        return idChercheur;
    }

    public void setIdChercheur(int idChercheur) {
        this.idChercheur = idChercheur;
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

    public Date getDatecom() {
        return datecom;
    }

    public void setDatecom(Date datecom) {
        this.datecom = datecom;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getEvenement() {
        return evenement;
    }

    public void setEvenement(String evenement) {
        this.evenement = evenement;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Typecommunication getTypecommunication() {
        return typecommunication;
    }

    public void setTypecommunication(Typecommunication typecommunication) {
        this.typecommunication = typecommunication;
    }

}
