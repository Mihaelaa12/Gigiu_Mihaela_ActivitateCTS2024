package ro.ase.gigiumihaela.cts.spital11_strategy.program;

import ro.ase.gigiumihaela.cts.spital11_strategy.clase.Card;
import ro.ase.gigiumihaela.cts.spital11_strategy.clase.Cash;
import ro.ase.gigiumihaela.cts.spital11_strategy.clase.Pacient;
import ro.ase.gigiumihaela.cts.spital11_strategy.interfete.ModalitatePlata;

public class Program {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Gigiu Mihaela", (ModalitatePlata) new Card());
        pacient.achitaFactura(1000);

        pacient.setModaliatePlata(new Cash());
        pacient.achitaFactura(2000);
    }
}