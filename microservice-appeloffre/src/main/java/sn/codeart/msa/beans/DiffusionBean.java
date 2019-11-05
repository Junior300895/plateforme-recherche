package sn.codeart.msa.beans;

public class DiffusionBean {
    private int idAppeloffre;
    private int idThematique;

    public DiffusionBean() {
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
        return "DiffusionBean{" +
                "idAppeloffre=" + idAppeloffre +
                ", idThematique=" + idThematique +
                '}';
    }
}
