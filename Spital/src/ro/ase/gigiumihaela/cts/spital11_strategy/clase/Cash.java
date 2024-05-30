package ro.ase.gigiumihaela.cts.spital11_strategy.clase;

import ro.ase.gigiumihaela.cts.spital11_strategy.interfete.ModalitatePlata;

public class Cash implements ModalitatePlata {
    /**
     * @param suma
     */
    @Override
    public void efectueazaPlata(double suma) {
        System.out.printf("Plateste suma de %5.2f RON in numerar.\n", suma);
    }
}