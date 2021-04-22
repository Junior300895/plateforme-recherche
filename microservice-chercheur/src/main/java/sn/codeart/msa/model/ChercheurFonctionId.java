package sn.codeart.msa.model;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ChercheurFonctionId implements Serializable {
    @Id
    private int idChercheur;
    @Id
    private int idFonction;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChercheurFonctionId that = (ChercheurFonctionId) o;
        return idChercheur == that.idChercheur &&
        		idFonction == that.idFonction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idChercheur, idFonction);
    }
}
