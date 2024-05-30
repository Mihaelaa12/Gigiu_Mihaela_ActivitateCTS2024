package ro.ase.gigiumihaela.cts.spital11_strategy.clase;

import ro.ase.gigiumihaela.cts.spital11_strategy.interfete.ModalitatePlata;

public class Card implements ModalitatePlata {
    /**
     * @param suma
     */
    @Override
    public void efectueazaPlata(double suma) {
        System.out.printf("Plaste suma de %5.2f RON cu cardul bancar.\n", suma);
    }
}