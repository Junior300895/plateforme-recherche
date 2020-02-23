package sn.codeart.msa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class UniteRecherche {
    @Id @GeneratedValue
    private int idUnite;
    @Column(unique = true)
    private String identifiant;
    @Column(unique = true)
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

    //@JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_TypeUniteRecherche")
    private TypeUniteRecherche typeUniteRecherche;

    //@JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Structure")
    private Structure structure;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Id_Responsable")
    private Responsable responsable;

    public UniteRecherche() {
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

    public TypeUniteRecherche getTypeUniteRecherche() {
        return typeUniteRecherche;
    }

    public void setTypeUniteRecherche(TypeUniteRecherche typeUniteRecherche) {
        this.typeUniteRecherche = typeUniteRecherche;
    }

    public Structure getStructure() {
        return structure;
    }

    public void setStructure(Structure structure) {
        this.structure = structure;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }
}
