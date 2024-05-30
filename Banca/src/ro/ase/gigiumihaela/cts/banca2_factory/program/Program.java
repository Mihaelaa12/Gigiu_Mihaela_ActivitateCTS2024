package ro.ase.gigiumihaela.cts.banca2_factory.program;

import ro.ase.gigiumihaela.cts.banca2_factory.clase.CreditPersoaneFiziceFactory;
import ro.ase.gigiumihaela.cts.banca2_factory.clase.CreditPersoaneJuridiceFactory;
import ro.ase.gigiumihaela.cts.banca2_factory.interfete.Credit;
import ro.ase.gigiumihaela.cts.banca2_factory.interfete.CrediteFactory;

public class Program {
    public static void main(String[] args) {
        CrediteFactory factory = new CreditPersoaneFiziceFactory();
        Credit credit = factory.acordaCredit(25000);
        credit.aproba();

        factory = new CreditPersoaneJuridiceFactory();
        credit = factory.acordaCredit(100000);
        credit.aproba();
    }
}