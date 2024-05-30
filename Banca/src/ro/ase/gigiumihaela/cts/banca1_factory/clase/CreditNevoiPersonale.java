package ro.ase.gigiumihaela.cts.banca1_factory.clase;

import ro.ase.gigiumihaela.cts.banca1_factory.interfete.Credit;

public class CreditNevoiPersonale extends Credit {
    @Override
    public void acorda() {
        System.out.printf("Acord credit nevoi personale in valoare de %d RON.\n", this.suma);
    }

    public CreditNevoiPersonale(int suma) {
        super(suma);
    }
}