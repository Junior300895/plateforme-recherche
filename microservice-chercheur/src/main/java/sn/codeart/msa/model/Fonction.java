package sn.codeart.msa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Fonction {
    @Id
    @GeneratedValue
    private int idFonction;
    private String libeleCourt;
    private String libeleLong;
    
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fonction")
    private List<ChercheurFonction> chercheurFonctions;

    public Fonction() {
    }

    public int getIdFonction() {
        return idFonction;
    }

    public void setIdFonction(int idFonction) {
        this.idFonction = idFonction;
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


    public List<ChercheurFonction> getChercheurFonctions() {
		return chercheurFonctions;
	}

	public void setChercheurFonctions(List<ChercheurFonction> chercheurFonctions) {
		this.chercheurFonctions = chercheurFonctions;
	}

	@Override
	public String toString() {
		return "Fonction [idFonction=" + idFonction + ", libeleCourt=" + libeleCourt + ", libeleLong=" + libeleLong
				+ ", chercheurFonctions=" + chercheurFonctions + "]";
	}

}
