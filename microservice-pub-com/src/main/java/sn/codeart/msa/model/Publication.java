package sn.codeart.msa.model;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Publication {
    @Id
    @GeneratedValue
    private int idPublication;
    private int idChercheur;
    private String libelecourt;
    private String libelelong;
    private Date datepub;
    private String auteur;
    private String revuelieu;
    private String adresse;
    private String directeurpub;
    private String motcle;
    private Date anneepub;
    private int numvol;

    @ManyToOne(fetch = FetchType.LAZY,cascade= CascadeType.ALL)
    @JoinColumn(name = "Id_TypePub")
    private Typepublication typepublication;

    public Publication() {
    }

    public int getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(int idPublication) {
        this.idPublication = idPublication;
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

    public Date getDatepub() {
        return datepub;
    }

    public void setDatepub(Date datepub) {
        this.datepub = datepub;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getRevuelieu() {
        return revuelieu;
    }

    public void setRevuelieu(String revuelieu) {
        this.revuelieu = revuelieu;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDirecteurpub() {
        return directeurpub;
    }

    public void setDirecteurpub(String directeurpub) {
        this.directeurpub = directeurpub;
    }

    public String getMotcle() {
        return motcle;
    }

    public void setMotcle(String motcle) {
        this.motcle = motcle;
    }

    public Date getAnneepub() {
        return anneepub;
    }

    public void setAnneepub(Date anneepub) {
        this.anneepub = anneepub;
    }

    public int getNumvol() {
        return numvol;
    }

    public void setNumvol(int numvol) {
        this.numvol = numvol;
    }

    public Typepublication getTypepublication() {
        return typepublication;
    }

    public void setTypepublication(Typepublication typepublication) {
        this.typepublication = typepublication;
    }
}
