package fr.diginamic.fichier;

import java.util.ArrayList;

public class Ville {
    String nom,
            codeDepartement,
            region,
            population;

    public Ville(String nom, String codeDepartement, String region,String population ) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.region = region;
        this.population = population;
    }

    public static void main(String[] args) {
        ArrayList<String> listVille = new ArrayList<>();

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + this.getNom() + '\'' +
                ", codeDepartement='" + this.getCodeDepartement() + '\'' +
                ", region='" + this.getRegion() + '\'' +
                ", population='" + this.getPopulation() + '\'' +
                '}';
    }
}
