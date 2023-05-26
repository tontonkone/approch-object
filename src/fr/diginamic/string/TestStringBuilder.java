package fr.diginamic.string;

public class TestStringBuilder {

    public static void main(String[] args) {
        long debut= System.currentTimeMillis();

        long nb = 1;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 100000; i++) {

/*
            builder.append("nombre").append(i);
*/
            String list = "nombre " +  i;

        }

        long fin= System.currentTimeMillis();


        System.out.println("Temps écouléen millisecondes :"+ (fin-debut));
    }
}
