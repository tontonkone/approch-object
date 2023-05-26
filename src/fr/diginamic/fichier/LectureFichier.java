package fr.diginamic.fichier;

import javax.swing.plaf.SeparatorUI;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LectureFichier {

    public static void main(String[] args) throws IOException {
        Path pathFile= Paths.get("C:/Users/km84/Downloads/traite.csv");
        List<String> lines= Files.readAllLines(pathFile, StandardCharsets.UTF_8);
//[04, La Réunion, 974, 4, 97, 415, Saint-Paul, 105 482, 1 438, 106 920]

        ArrayList<Ville> villes = new ArrayList<>();

        for (int i = 1; i < 6000; i++) {
            String line = lines.get(i);

            String[] separator  = line.split(";");

            villes.add(new Ville(separator[6],separator[2],separator[1], separator[9]));
            //
            for ( Ville v: villes){

                    Integer nb = Integer.parseInt(v.getPopulation().replace(" ", ""));
                    if(nb > 25000){

                        System.out.println(v);
                    }

            }

        }

    }
}
