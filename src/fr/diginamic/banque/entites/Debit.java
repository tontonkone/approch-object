package fr.diginamic.banque.entites;

public class Debit extends Operation{
    Debit(String date, double montant) {
        super(date, montant);
    }

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return "Debit operation = " + super.toString();
    }
}
