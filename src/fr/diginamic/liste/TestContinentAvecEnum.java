package fr.diginamic.liste;

import java.util.ArrayList;

/**
 * Créez une classe exécutable TestContinentAvecEnum
 * o Créez une liste de villes avec tous les paramètres attendus dont le continent :
 * ▪ New York
 * ▪ Paris
 * ▪ Pékin
 * ▪ Moscou
 * ▪ Berlin
 * ▪ Sydney
 * ▪ Sao Paulo
 * ▪ Dakar
 */

public class TestContinentAvecEnum {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville(" New York", 343000, Continent.AMERIQUE));
        villes.add(new Ville("Paris", 47800, Continent.EUROPE));
        villes.add(new Ville("Moscou", 53400, Continent.ASIE));
        villes.add(new Ville("Berlin", 484000, Continent.EUROPE));
        villes.add(new Ville("Sydney", 9700, Continent.ANTARCTIQUE));
        villes.add(new Ville("Sao Paulo", 77200, Continent.AMERIQUE));
        villes.add(new Ville("Dakar", 850700, Continent.AFRIQUE));

        //Réalisez une boucle qui affiche l’ensemble des villes avec leur continent
        //respectif

        for (Ville ville: villes){
            System.out.println(ville);
        }
    }
}
