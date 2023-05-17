package fr.diginamic.entites;

import java.lang.reflect.Array;

public class TestPersonne {

    public static  void main(String[] args){
        Personne pers1 = new Personne();
        pers1.prenom = "marc";
        pers1.nom = "charle";
        pers1.adresse.numeroRue = 2;
        pers1.adresse.codePostal = 44000;
        pers1.adresse.pays = "France";
        pers1.adresse.ville = "Nantes";
        pers1.adresse.libelleRue = "rue de la maison";

        Personne pers2 = new Personne();
        pers2.prenom = "dona";
        pers2.nom = "dubois";
        pers2.adresse.numeroRue = 5;
        pers2.adresse.codePostal = 44000;
        pers2.adresse.pays = "France";
        pers2.adresse.ville = "Nantes";
        pers2.adresse.libelleRue = "rue de biarritz";

        System.out.println(pers1);
    }
}
