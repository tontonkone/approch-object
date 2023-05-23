package fr.diginamic.list;

import java.util.ArrayList;
import java.util.Iterator;

public class CreationListe {

    public static void main(String[] args) {
        ArrayList<Integer> collec = new ArrayList<>();

        Iterator<Integer> iterator = collec.iterator();
        for (int i = 0; i <= 100; i++) {
           collec.add(i);

        }
        System.out.println(collec);
    }
}
