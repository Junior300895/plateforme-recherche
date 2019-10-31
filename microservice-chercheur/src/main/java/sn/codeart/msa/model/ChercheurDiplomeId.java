package sn.codeart.msa.model;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ChercheurDiplomeId implements Serializable {
    @Id
    private int idChercheur;
    @Id
    private int idDiplome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChercheurDiplomeId that = (ChercheurDiplomeId) o;
        return idChercheur == that.idChercheur &&
                idDiplome == that.idDiplome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idChercheur, idDiplome);
    }
}
