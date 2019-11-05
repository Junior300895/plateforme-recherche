package sn.codeart.msa.model;

import java.io.Serializable;
import java.util.Objects;

public class AppelOffreThematiqueId implements Serializable {
    private int idAppeloffre;
    private int idThematique;

    public AppelOffreThematiqueId() {
    }

    public AppelOffreThematiqueId(int idAppeloffre, int idThematique) {
        this.idAppeloffre = idAppeloffre;
        this.idThematique = idThematique;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppelOffreThematiqueId that = (AppelOffreThematiqueId) o;
        return idAppeloffre == that.idAppeloffre &&
                idThematique == that.idThematique;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAppeloffre, idThematique);
    }
}
