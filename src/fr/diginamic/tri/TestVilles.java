package fr.diginamic.tri;

import fr.diginamic.liste.Continent;
import fr.diginamic.liste.Ville;
import fr.diginamic.liste.VilleNomComparator;
import fr.diginamic.liste.VillePopComparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000, Continent.EUROPE));
        villes.add(new Ville("Carcassonne", 47800, Continent.EUROPE));
        villes.add(new Ville("Narbonne", 53400, Continent.EUROPE));
        villes.add(new Ville("Lyon", 484000, Continent.EUROPE));
        villes.add(new Ville("Foix", 9700, Continent.EUROPE));
        villes.add(new Ville("Pau", 77200, Continent.EUROPE));
        villes.add(new Ville("Marseille", 850700, Continent.EUROPE));
        villes.add(new Ville("Tarbes", 40600, Continent.EUROPE));

        // Collection représente le concept de Collection : ArrayList implémente Collection
        // Cela a pour effet qu'ArrayList a une liste de méthode imposée par Collection

        Collections.sort(villes); // la méthode sort appelle votre méthode compareTo

        for (Ville v: villes) {
            System.out.println(v);
        }
        System.out.println("-----------------------------");

        Ville ville = Collections.min(villes, new VilleNomComparator());
        System.out.println(ville);

        System.out.println("-----------------------------");
        for (Ville v: villes) {
            System.out.println(v);
        }

    }
}