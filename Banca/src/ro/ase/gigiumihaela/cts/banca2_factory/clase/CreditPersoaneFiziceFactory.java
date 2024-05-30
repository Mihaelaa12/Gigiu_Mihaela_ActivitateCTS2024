package ro.ase.gigiumihaela.cts.banca2_factory.clase;

import ro.ase.gigiumihaela.cts.banca2_factory.interfete.Credit;
import ro.ase.gigiumihaela.cts.banca2_factory.interfete.CrediteFactory;

public class CreditPersoaneFiziceFactory implements CrediteFactory {
    @Override
    public Credit acordaCredit(int valoare) {
        return new CreditPersoaneFizice(valoare);
    }
}