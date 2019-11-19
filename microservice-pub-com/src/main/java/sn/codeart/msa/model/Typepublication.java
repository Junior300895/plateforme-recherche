package sn.codeart.msa.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Typepublication {
    @Id
    @GeneratedValue
    private int idTypePublication;
    private String libelecourt;
    private String libelelong;

    @OneToMany(mappedBy = "typepublication", fetch = FetchType.LAZY)
    private List<Publication> publications;

    public Typepublication() {
    }

    public int getIdTypePublication() {
        return idTypePublication;
    }

    public void setIdTypePublication(int idTypePublication) {
        this.idTypePublication = idTypePublication;
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

    public List<Publication> getPublications() {
        return publications;
    }

    public void setPublications(List<Publication> publications) {
        this.publications = publications;
    }
}
