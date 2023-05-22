package fr.diginamic.utils;

public class TestMethodeStatic {

    public static void main(String[] args){
        String chaine = "12";
        int nombre = Integer.parseInt(chaine);
        int a = 10,b = 30;
        int max = Integer.max(a,b);
        int compare = Integer.compare(13,12);
        System.out.println(max);
        System.out.println(compare);

    }
}
