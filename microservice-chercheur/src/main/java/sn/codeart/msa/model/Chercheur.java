package sn.codeart.msa.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Chercheur {
    @Id
    @GeneratedValue
    private int idChercheur;
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idFonction", nullable = true)
    private Fonction fonction;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idGrade", nullable = true)
    private Grade grade;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idStatut", nullable = true)
    private Statut statut;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "chercheur_thematique",
            joinColumns = @JoinColumn(name = "idChercheur"),
            inverseJoinColumns = @JoinColumn(name = "idThematique"))
    private List<Thematique> thematiques;

    @OneToMany(mappedBy = "chercheur", fetch = FetchType.LAZY)
    private List<ChercheurDiplome> diplomes;

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

    public Fonction getFonction() {
        return fonction;
    }

    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Statut getStatut() {
        return statut;
    }

    public void setStatut(Statut statut) {
        this.statut = statut;
    }

    public List<Thematique> getThematiques() {
        return thematiques;
    }

    public void setThematiques(List<Thematique> thematiques) {
        this.thematiques = thematiques;
    }

    public List<ChercheurDiplome> getDiplomes() {
        return diplomes;
    }

    public void setDiplomes(List<ChercheurDiplome> diplomes) {
        this.diplomes = diplomes;
    }

    @Override
    public String toString() {
        return "Chercheur{" +
                "idChercheur=" + idChercheur +
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
                ", fonction=" + fonction +
                ", grade=" + grade +
                ", statut=" + statut +
                ", thematiques=" + thematiques +
                ", diplomes=" + diplomes +
                '}';
    }
}
