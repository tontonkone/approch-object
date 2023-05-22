package fr.diginamic.banque.entites;

public class Credit extends Operation{
    Credit(String date, double montant) {
        super(date, montant);
    }

    public static void main(String[] args) {

    }

    @Override
    public String getType() {
        return "CREDIT";
    }

    @Override
    public String toString() {
        return "Credit operation = " + super.toString() ;
    }
}
