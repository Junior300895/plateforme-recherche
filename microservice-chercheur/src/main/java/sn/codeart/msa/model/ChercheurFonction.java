package sn.codeart.msa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@IdClass(ChercheurFonctionId.class)
public class ChercheurFonction {
    @Id
    private int idChercheur;
    @Id
    private int idFonction;
    private Date dateDebut;
    private String dateFin;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idChercheur", referencedColumnName = "idChercheur", nullable = false,
            insertable = false, updatable = false)
    private Chercheur chercheur;
    @ManyToOne
    @JoinColumn(name = "idFonction", referencedColumnName = "idFonction", nullable = false,
            insertable = false, updatable = false)
    private Fonction fonction;

    public ChercheurFonction() {
    }

	public int getIdChercheur() {
		return idChercheur;
	}

	public void setIdChercheur(int idChercheur) {
		this.idChercheur = idChercheur;
	}

	public int getIdFonction() {
		return idFonction;
	}

	public void setIdFonction(int idFonction) {
		this.idFonction = idFonction;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public Chercheur getChercheur() {
		return chercheur;
	}

	public void setChercheur(Chercheur chercheur) {
		this.chercheur = chercheur;
	}

	public Fonction getFonction() {
		return fonction;
	}

	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}

    
}
