package ro.ase.gigiumihaela.cts.banca1_factory.clase;

import ro.ase.gigiumihaela.cts.banca1_factory.interfete.*;

public class CreditNevoiPersonaleFactory implements CreditFactory {
    /**
     * @param suma
     * @return
     */
    @Override
    public Credit creazaCredit(int suma) {
        return new CreditNevoiPersonale(suma);
    }
}