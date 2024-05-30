package ro.ase.gigiumihaela.cts.farmacie1_simplefactory.clase;

import ro.ase.gigiumihaela.cts.farmacie1_simplefactory.interfete.Medicament;

public class MedicamentRaceala extends Medicament {
    public MedicamentRaceala(double pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void fabricare() {
        System.out.printf("Fabricare medicament raceala %s.\n", this.toString());
    }
}