package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

import java.util.Arrays;

public class TestBanque {

    public static void main(String[] args){

        Compte[] tab = new Compte[2];

        tab[0] = new Compte(25,300);
        tab[1] = new CompteTaux(20,30,7);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(Arrays.toString(new Compte[]{tab[i]}));
        }
    }
}
