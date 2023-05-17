package fr.diginamic.entites;

public class AdressePostale {
    int numeroRue;
    String libelleRue;
    int codePostal;

    String ville;
    String pays;

    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville, String pays) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    public static  void main(String[] args){

    }

    @Override
    public String toString() {
        return "AdressePostale{" +
                "numeroRue=" + numeroRue +
                ", libelleRue='" + libelleRue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                '}';
    }
}
