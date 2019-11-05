package sn.codeart.msa.beans;

public class AppeloffreThematique {
    private int idThematique;
    private int idAppeloffre;

    public AppeloffreThematique() {
    }

    public int getIdAppeloffre() {
        return idAppeloffre;
    }

    public void setIdAppeloffre(int idAppeloffre) {
        this.idAppeloffre = idAppeloffre;
    }

    public int getIdThematique() {
        return idThematique;
    }

    public void setIdThematique(int idThematique) {
        this.idThematique = idThematique;
    }

    @Override
    public String toString() {
        return "AppeloffreThematique{" +
                ", idThematique=" + idThematique +
                ", idAppeloffre=" + idAppeloffre +
                '}';
    }
}
