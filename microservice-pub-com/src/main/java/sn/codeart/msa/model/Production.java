package sn.codeart.msa.model;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Production {
    @Id
    @GeneratedValue
    private int idProduction;
    private String libelecourt;
    private String libelelong;
    private Date dateproduction;
    private String revuelieu;
    private String adresse;
    private String directeurpub;
    private String motcle;
    private Date anneepub;
    private int numvol;
    private int idThematique;
    private String nomThematique;
    private String pages;
    private String auteur;
    private String lieu;
    private String evenement;
    private String langue;
    private Date datemiseenligne;
    private Date datedebutcommunication;
    private Date datefincommunication;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_TypeProd")
    private TypeProduction TypeProduction;

    @JsonIgnore
    @OneToMany(mappedBy = "production", fetch = FetchType.LAZY)
    private List<ChercheurProduction> chercheurProductions;

    public Production() {
    }

    public int getIdPublication() {
        return idProduction;
    }

    public void setIdPublication(int idProduction) {
        this.idProduction = idProduction;
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

    public Date getDateproduction() {
        return dateproduction;
    }

    public void setDateproduction(Date dateproduction) {
        this.dateproduction = dateproduction;
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

    public int getIdThematique() {
        return idThematique;
    }

    public void setIdThematique(int idThematique) {
        this.idThematique = idThematique;
    }

    public String getNomThematique() {
        return nomThematique;
    }

    public void setNomThematique(String nomThematique) {
        this.nomThematique = nomThematique;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
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

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public Date getDatemiseenligne() {
        return datemiseenligne;
    }

    public void setDatemiseenligne(Date datemiseenligne) {
        this.datemiseenligne = datemiseenligne;
    }

    public Date getDatedebutcommunication() {
        return datedebutcommunication;
    }

    public void setDatedebutcommunication(Date datedebutcommunication) {
        this.datedebutcommunication = datedebutcommunication;
    }

    public Date getDatefincommunication() {
        return datefincommunication;
    }

    public void setDatefincommunication(Date datefincommunication) {
        this.datefincommunication = datefincommunication;
    }

    public sn.codeart.msa.model.TypeProduction getTypeProduction() {
        return TypeProduction;
    }

    public void setTypeProduction(sn.codeart.msa.model.TypeProduction typeProduction) {
        TypeProduction = typeProduction;
    }

    public List<ChercheurProduction> getChercheurProductions() {
        return chercheurProductions;
    }

    public void setChercheurProductions(List<ChercheurProduction> chercheurProductions) {
        this.chercheurProductions = chercheurProductions;
    }
}
