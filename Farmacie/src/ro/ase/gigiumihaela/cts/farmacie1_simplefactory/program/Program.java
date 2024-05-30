package ro.ase.gigiumihaela.cts.farmacie1_simplefactory.program;

import ro.ase.gigiumihaela.cts.farmacie1_simplefactory.clase.*;
import ro.ase.gigiumihaela.cts.farmacie1_simplefactory.interfete.Medicament;

public class Program {
    public static void main(String[] args) {
        Medicament medicament = new FabricaMedicamente().creazaMedicament(CategorieMedicamente.Body, 10, "Medicament1" );
        medicament.fabricare();

        medicament = new FabricaMedicamente().creazaMedicament(CategorieMedicamente.Raceala, 25, "Medicament2");
        medicament.fabricare();

        medicament = new FabricaMedicamente().creazaMedicament(CategorieMedicamente.Durere, 30.75, "Medicament3");
        medicament.fabricare();
    }
}