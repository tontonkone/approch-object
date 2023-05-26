package fr.diginamic.testenumeration;

/**
 * Créez une classe TestEnumeration exécutable
 * • Utilisez une boucle pour affichez toutes les saisons.
 * • Soit la chaine de caractères suivante : String nom = « ETE » ;
 * ***  Utilisez une méthode de base des énumérations pour retrouver et afficher le
 * *** libellé de l’instance de Saison dont le nom est ETE.
 */
public class Testsaison {
    public static void main(String[] args) {

        // Utilisez une boucle pour affichez toutes les saisons.

        System.out.println("Utilisez une boucle pour affichez toutes les saisons");
        System.out.println("_______________________________________________________");

        Saison[] saisons = Saison.values();
        for (Saison saison : saisons) {

            System.out.println(saison.getNom());
        }

        Saison ete = Saison.ETE;
        System.out.println("libellé de l’instance de Saison dont le nom est ETE");
        System.out.println("_______________________________________________________");
        System.out.println(ete.getNom());

        Saison aut = Saison.findSaison(saisons, "ete");
        System.out.println(aut);

    }
}
