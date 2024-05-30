package ro.ase.gigiumihaela.cts.farmacie2_factory.program;

import ro.ase.gigiumihaela.cts.farmacie2_factory.clase.FabricaMedicamenteBody;
import ro.ase.gigiumihaela.cts.farmacie2_factory.clase.FabricaMedicamenteDurere;
import ro.ase.gigiumihaela.cts.farmacie2_factory.clase.FabricaMedicamenteRaceala;
import ro.ase.gigiumihaela.cts.farmacie2_factory.interfete.Medicament;

public class Program {
    public static void main(String[] args) {
        Medicament medicament = new FabricaMedicamenteBody().creazaMedicament(10, "Medicament1");
        medicament.fabricare();

        medicament = new FabricaMedicamenteRaceala().creazaMedicament(25, "Medicament2");
        medicament.fabricare();

        medicament = new FabricaMedicamenteDurere().creazaMedicament(30.75, "Medicament3");
        medicament.fabricare();
    }
}