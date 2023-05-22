package fr.diginamic.banque.entites;

public class TestOperation {
    public static void main(String[] args) {
        Credit credit = new Credit("10/07/2023",300);
        Credit credit1 = new Credit("20/03/2023",20);
        Credit credit2 = new Credit("12/07/2023",800);
        Credit credit3 = new Credit("03/07/2023",100);
        Debit debit = new Debit("03/06/2023",10);
        Debit debit1 = new Debit("03/03/2023",300);
        Debit debit2 = new Debit("03/05/2023",1000);
        Debit debit3 = new Debit("07/09/2023",123);
        Operation[] tab = {credit,credit1,credit2,credit3,debit,debit1,debit2,debit3};

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }
}
