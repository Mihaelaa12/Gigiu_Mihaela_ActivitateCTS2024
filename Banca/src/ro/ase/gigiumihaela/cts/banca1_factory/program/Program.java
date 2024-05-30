package ro.ase.gigiumihaela.cts.banca1_factory.program;

import ro.ase.gigiumihaela.cts.banca1_factory.clase.CreditIpotecarFactory;
import ro.ase.gigiumihaela.cts.banca1_factory.clase.CreditNevoiPersonaleFactory;
import ro.ase.gigiumihaela.cts.banca1_factory.interfete.CreditFactory;

public class Program {
    public static void main(String[] args) {
        CreditFactory creatorCredite = new CreditIpotecarFactory();
        creatorCredite.creazaCredit(20000).acorda();

        creatorCredite = new CreditNevoiPersonaleFactory();
        creatorCredite.creazaCredit(40000).acorda();
    }
}