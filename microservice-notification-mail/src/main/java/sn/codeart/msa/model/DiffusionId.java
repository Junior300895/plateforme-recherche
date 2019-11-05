package sn.codeart.msa.model;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DiffusionId implements Serializable {
    @Id
    private int idAppeloffre;
    @Id
    private int idChercheur;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiffusionId that = (DiffusionId) o;
        return idAppeloffre == that.idAppeloffre &&
                idChercheur == that.idChercheur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAppeloffre, idChercheur);
    }
}
