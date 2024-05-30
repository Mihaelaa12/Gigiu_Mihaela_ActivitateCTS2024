package ro.ase.gigiumihaela.cts.banca1_factory.clase;

import ro.ase.gigiumihaela.cts.banca1_factory.interfete.Credit;

public class CreditIpotecar extends Credit {
    public CreditIpotecar(int suma) {
        super(suma);
    }

    @Override
    public void acorda() {
        System.out.printf("Acord credit ipotecar in valoare de %d ron.\n", this.suma);
    }
}