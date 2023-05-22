package fr.diginamic.banque.entites;

public class Compte {

    private int compteNb = 0;
    private  int compteSolde = 0;

    public  Compte(int compte,int solde){
        this.compteNb = compte;
        this.compteSolde = solde;
    }
    public static void main(String[] args){

    }

    public int getCompteNb() {
        return compteNb;
    }

    public void setCompteNb(int compteNb) {
        this.compteNb = compteNb;
    }

    public int getCompteSolde() {
        return compteSolde;
    }

    public void setCompteSolde(int compteSolde) {
        this.compteSolde = compteSolde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "compteNb=" + compteNb +
                ", compteSolde=" + compteSolde +
                '}';
    }
}
