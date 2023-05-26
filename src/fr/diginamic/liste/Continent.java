package fr.diginamic.liste;


/**
 * o Créez une énumération Continent avec les 5 continents. Chaque instance de
 * continent doit avoir un libellé.
 */
public enum Continent {


    ASIE("Asie"),
    EUROPE("Europe"),
    AFRIQUE("Afrique"),
    AMERIQUE("Amerique"),
    ANTARCTIQUE("Antarctique");



    private String nom;

    Continent(String nom){
        this.nom = nom ;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
