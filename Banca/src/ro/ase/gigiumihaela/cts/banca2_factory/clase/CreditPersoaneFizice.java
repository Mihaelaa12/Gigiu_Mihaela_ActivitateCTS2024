package ro.ase.gigiumihaela.cts.banca2_factory.clase;

import ro.ase.gigiumihaela.cts.banca2_factory.interfete.Credit;

public class CreditPersoaneFizice extends Credit {

    public CreditPersoaneFizice(int valoare) {
        super(valoare);
    }

    @Override
    public void aproba() {
        System.out.printf("Aproba credit persoane fizice in valoare de %d RON.\n", this.valoare);
    }
}