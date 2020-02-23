package sn.codeart.msa.model;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Thematique {
    private int idThematique;
    @Column(name = "lcThematique")
    private String libeleCourt;
    @Column(name = "llThematique")
    private String libeleLong;

    public Thematique() {
    }

    public int getIdThematique() {
        return idThematique;
    }

    public void setIdThematique(int idThematique) {
        this.idThematique = idThematique;
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

}
