package fr.diginamic.testenumeration;

public enum Saison {
     PRINTEMPS("Printemps",1),
    ETE("ete",2),
    AUTOMNE("automne",3),
    HIVER("hiver",4);


    private String nom;

    private int nb;
    private Saison(String nom,int nb) {
        this.nom = nom;
        this.nb = nb;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public static Saison findSaison(Saison[] tab, String nom){
        for(Saison se: tab){
            if(se.getNom().equals(nom)) return se;
        }
        return null;
    }
}
