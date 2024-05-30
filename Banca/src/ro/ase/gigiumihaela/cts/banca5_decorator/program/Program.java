package ro.ase.gigiumihaela.cts.banca5_decorator.program;

import ro.ase.gigiumihaela.cts.banca5_decorator.clase.SoftwareExistent;
import ro.ase.gigiumihaela.cts.banca5_decorator.interfete.SoftwareLeasing;
import ro.ase.gigiumihaela.cts.banca5_decorator.clase.SoftwareNou;

public class Program {
    public static void main(String[] args) {
        SoftwareLeasing oldApp = new SoftwareExistent(10000);
        oldApp.acorda();

        SoftwareNou newApp = new SoftwareNou(oldApp, 100000);
        newApp.acorda();
        newApp.prioritizeazaCredit();

        newApp = new SoftwareNou(oldApp, 45000);
        newApp.acorda();
        newApp.prioritizeazaCredit();
    }
}