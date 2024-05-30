package ro.ase.gigiumihaela.cts.banca5_decorator.clase;

import ro.ase.gigiumihaela.cts.banca5_decorator.interfete.SoftwareLeasing;

public class SoftwareExistent implements SoftwareLeasing {
    private final int valoare;

    public SoftwareExistent(int valoare) {
        this.valoare = valoare;
    }

    @Override
    public int getValoare() {
        return this.valoare;
    }

    @Override
    public void acorda() {
        System.out.println("Acorda credite folosind vechiul software.");
    }
}