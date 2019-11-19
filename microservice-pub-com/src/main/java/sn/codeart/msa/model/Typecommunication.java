package sn.codeart.msa.model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Typecommunication {
    @Id
    @GeneratedValue
    private int idTypeCommunication;
    private String libelecourt;
    private String libelelong;

    @OneToMany(mappedBy = "typecommunication", fetch = FetchType.LAZY)
    private List<Communication> communications;

    public Typecommunication() {
    }

    public int getIdTypeCommunication() {
        return idTypeCommunication;
    }

    public void setIdTypeCommunication(int idTypeCommunication) {
        this.idTypeCommunication = idTypeCommunication;
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

    public List<Communication> getCommunications() {
        return communications;
    }

    public void setCommunications(List<Communication> communications) {
        this.communications = communications;
    }
}
