package fr.diginamic.entites;

import java.lang.reflect.Array;

public class TestPersonne {

    public static  void main(String[] args){
        AdressePostale add = new AdressePostale(2,"rue de la",44200,"nantes","france");
        Personne pers1 = new Personne("marse","cool",add);
        System.out.println(pers1);

    }
}
