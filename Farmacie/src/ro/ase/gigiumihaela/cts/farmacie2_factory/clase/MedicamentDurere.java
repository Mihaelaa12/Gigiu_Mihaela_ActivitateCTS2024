package ro.ase.gigiumihaela.cts.farmacie2_factory.clase;

import ro.ase.gigiumihaela.cts.farmacie2_factory.interfete.Medicament;

public class MedicamentDurere extends Medicament {
    public MedicamentDurere(double pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void fabricare() {
        System.out.printf("Fabricare medicament durere %s.\n", this.toString());
    }
}