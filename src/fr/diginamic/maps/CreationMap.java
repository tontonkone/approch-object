package fr.diginamic.maps;


import java.util.HashMap;

public class CreationMap {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("Hicham ", 2000.0);
        map.put("Paul ", 1750.0);
        map.put("Yu ", 2250.0);
        map.put("Ingrid", 1750.0);

        System.out.println(map.size());

    }

}
