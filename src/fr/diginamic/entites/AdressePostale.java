package fr.diginamic.entites;

public class AdressePostale {
    int numeroRue;
    String libelleRue;
    int codePostal;
    String ville;
    String pays;
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
