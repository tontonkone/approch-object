package fr.diginamic.maps;

import fr.diginamic.liste.Continent;
import fr.diginamic.liste.Ville;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MapVille {
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

        HashMap<String,Ville> mapVille = new HashMap<>();

        for (Ville v: villes){

            mapVille.put(v.getNom(), v);

        }


        Ville result = mapVille.values().iterator().next();

        for (Ville v : mapVille.values()) {


            if(v.getPop() < result.getPop()){
                result = v;
            }


        }

        mapVille.remove(result.getNom());

/*
        Ville nice = new Ville("Nice", 343000);
        Ville narbone = new Ville("Narbonne", 53400);
        Ville lyon = new Ville("Lyon", 484000);
        Ville foix = new Ville("Foix", 9700);
        Ville  pau = new Ville("Pau", 77200);
        Ville marseille = new Ville("Marseille", 850700);
        Ville tarbe = new Ville("Tarbes", 40600);


        HashMap<Integer,Ville> mapVille = new HashMap<>();

        mapVille.put(1,nice);
        mapVille.put(2,narbone.getPop());
        mapVille.put(lyon.getNom(),lyon.getPop());
        mapVille.put(foix.getNom(), foix.getPop());
        mapVille.put(pau.getNom(),pau.getPop());
        mapVille.put(marseille.getNom(),marseille.getPop());
        mapVille.put(tarbe.getNom(),tarbe.getPop());

        Iterator<Ville> keysIte = mapVille.keySet().iterator();
        while (keysIte.hasNext()){
            Ville key = keysIte.next();
            System.out.println(key);
        }
*/






    }
}
