package fr.diginamic.entites;

public class Personne {
    String nom;
    String prenom;
    AdressePostale adresse = new AdressePostale();
    public static  void main(String[] args){

    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
