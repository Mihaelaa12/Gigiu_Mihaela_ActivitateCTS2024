package ro.ase.gigiumihaela.cts.farmacie2_factory.clase;

import ro.ase.gigiumihaela.cts.farmacie2_factory.interfete.Medicament;

public class MedicamentRaceala extends Medicament {
    public MedicamentRaceala(double pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void fabricare() {
        System.out.printf("Fabricare medicament raceala %s.\n", this.toString());
    }
}