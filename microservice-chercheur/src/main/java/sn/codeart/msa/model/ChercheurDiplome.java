package sn.codeart.msa.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(ChercheurDiplomeId.class)
public class ChercheurDiplome {
    @Id private int idChercheur;
    @Id private int idDiplome;
    private Date annee;
    private String mention;
    private String lieuObtention;
    @ManyToOne
    @JoinColumn(name = "idChercheur", referencedColumnName = "idChercheur", nullable = false,
            insertable = false, updatable = false)
    private Chercheur chercheur;
    @ManyToOne
    @JoinColumn(name = "idDiplome", referencedColumnName = "idDiplome", nullable = false,
            insertable = false, updatable = false)
    private Diplome diplome;

    public ChercheurDiplome() {
    }

    public int getIdChercheur() {
        return idChercheur;
    }

    public void setIdChercheur(int idChercheur) {
        this.idChercheur = idChercheur;
    }

    public int getIdDiplome() {
        return idDiplome;
    }

    public void setIdDiplome(int idDiplome) {
        this.idDiplome = idDiplome;
    }

    public Date getAnnee() {
        return annee;
    }

    public void setAnnee(Date annee) {
        this.annee = annee;
    }

    public String getMention() {
        return mention;
    }

    public void setMention(String mention) {
        this.mention = mention;
    }

    public Chercheur getChercheur() {
        return chercheur;
    }

    public void setChercheur(Chercheur chercheur) {
        this.chercheur = chercheur;
    }

    public Diplome getDiplome() {
        return diplome;
    }

    public void setDiplome(Diplome diplome) {
        this.diplome = diplome;
    }

    public String getLieuObtention() {
        return lieuObtention;
    }

    public void setLieuObtention(String lieuObtention) {
        this.lieuObtention = lieuObtention;
    }
}
