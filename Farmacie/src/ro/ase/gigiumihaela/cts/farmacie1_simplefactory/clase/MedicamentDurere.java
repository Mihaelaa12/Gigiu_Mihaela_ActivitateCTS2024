package ro.ase.gigiumihaela.cts.farmacie1_simplefactory.clase;

import ro.ase.gigiumihaela.cts.farmacie1_simplefactory.interfete.Medicament;

public class MedicamentDurere extends Medicament {
    public MedicamentDurere(double pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void fabricare() {
        System.out.printf("Fabricare medicament durere %s.\n", this.toString());
    }
}