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
    public abstract String getType();

    @Override
    public String toString() {
        return "Operation{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                '}';
    }
}
