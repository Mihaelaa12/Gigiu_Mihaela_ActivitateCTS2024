package ro.ase.gigiumihaela.cts.farmacie2_factory.clase;

import ro.ase.gigiumihaela.cts.farmacie2_factory.interfete.Medicament;

public class MedicamentBody extends Medicament {
    public MedicamentBody(double pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public void fabricare() {
        System.out.printf("Fabricare medicament body %s.\n", this.toString());
    }
}