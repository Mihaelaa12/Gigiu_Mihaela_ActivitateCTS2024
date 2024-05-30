package ro.ase.gigiumihaela.cts.banca2_factory.clase;

import ro.ase.gigiumihaela.cts.banca2_factory.interfete.Credit;
import ro.ase.gigiumihaela.cts.banca2_factory.interfete.CrediteFactory;

public class CreditPersoaneJuridiceFactory implements CrediteFactory {
    @Override
    public Credit acordaCredit(int valoare) {
        return new CreditPersoaneJuridice(valoare);
    }
}