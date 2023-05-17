package fr.diginamic.entites;

public class Personne {
    String nom;
    String prenom;
    AdressePostale adresse ;
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nomUp(nom);
        this.prenom = prenom;
        this.adresse = adresse;
    }
    public String nomUp(String nom ){
        this.nom = nom.toUpperCase();
        return nom;
    }

    public void setNom(String nom){

        this.nomUp(nom);
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getNom(){
        return this.nomUp(this.nom);
    }
    public  String getPrenom(){
        return this.prenom;
    }

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
