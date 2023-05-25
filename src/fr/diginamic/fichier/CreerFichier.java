package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        //chemin du fichier
        Path pathFile= Paths.get("C:/Users/km84/Downloads/traite.csv");
        // recuperation en liste de string
        List<String> lines= Files.readAllLines(pathFile, StandardCharsets.UTF_8);

        // Recevoir le fichier
        File f = new File("C:/Users/km84/OneDrive/Bureau/cvscopy/newfile.csv");

        // Créer un nouveau fichier
        // Vérifier s'il n'existe pas

        if (f.createNewFile())
            System.out.println("File created");
        else
            System.out.println("File already exists");
        Path pathCible= Paths.get("C:/Users/km84/OneDrive/Bureau/cvscopy/newfile.csv");

        List<String> linesread = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            linesread.add(i + " = " + lines.get(i));
                System.out.println(linesread.get(i));
        }
        Files.write(pathCible , linesread,StandardCharsets.UTF_8);
    }
}
