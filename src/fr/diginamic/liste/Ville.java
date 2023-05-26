package fr.diginamic.liste;

import java.util.Objects;

/**
 * o Créez une énumération Continent avec les 5 continents. Chaque instance de
 * continent doit avoir un libellé.
 * o Complétez la classe Ville du TP sur les listes pour lui ajouter un attribut
 * d’instance de type Continent.
 * o Complétez le constructeur afin d’ajouter le continent en paramètre
 * o Ajoutez un getter/sette
 */
public class Ville implements Comparable<Ville> {
    private String nom;
    private int pop;

    private Continent continent;

    public Ville(String nom, int pop,Continent continent) {
        this.nom = nom;
        this.pop = pop;
        this.continent = continent;
    }

    public Ville(String nom) {
        this.nom = nom;
        this.pop = pop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ville ville = (Ville) o;
        return pop == ville.pop && Objects.equals(nom, ville.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, pop);
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", pop=" + pop +
                " Continert = " + continent +
                '}';
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }


    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public int compareTo(Ville o) {
        return this.nom.compareTo(o.getNom());
    }
}
