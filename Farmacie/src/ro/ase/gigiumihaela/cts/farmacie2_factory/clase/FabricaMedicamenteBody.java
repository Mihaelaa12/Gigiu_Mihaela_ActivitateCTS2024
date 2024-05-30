package ro.ase.gigiumihaela.cts.farmacie2_factory.clase;

import ro.ase.gigiumihaela.cts.farmacie2_factory.interfete.Medicament;
import ro.ase.gigiumihaela.cts.farmacie2_factory.interfete.FabricaMedicamente;

public class FabricaMedicamenteBody implements FabricaMedicamente {
    @Override
    public Medicament creazaMedicament(double pret, String denumire) {
        return new MedicamentBody(pret, denumire);
    }
}