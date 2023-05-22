package fr.diginamic.banque.entites;

public abstract class  Operation {

    protected String date ;
    protected  double montant;

    Operation(String date, double montant){

        this.date = date;
        this.montant = montant;
    }

    public static void main(String[] args) {

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                '}';
    }
}
