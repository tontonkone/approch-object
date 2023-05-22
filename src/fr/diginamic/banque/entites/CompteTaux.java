package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    int tauxRemu;
    public CompteTaux(int compte, int solde, int taux) {
        super(compte, solde);
        this.tauxRemu = taux;
    }

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return "taux =" +tauxRemu+
        " compte et solde =" +  super.toString();
    }
}
