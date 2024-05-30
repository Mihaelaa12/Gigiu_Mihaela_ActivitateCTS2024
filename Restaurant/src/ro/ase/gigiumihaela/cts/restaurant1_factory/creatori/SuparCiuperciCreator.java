package ro.ase.gigiumihaela.cts.restaurant1_factory.creatori;

import ro.ase.gigiumihaela.cts.restaurant1_factory.clase.SupaCiuperci;
import ro.ase.gigiumihaela.cts.restaurant1_factory.interfete.Supa;
import ro.ase.gigiumihaela.cts.restaurant1_factory.interfete.SupaCreator;

public class SuparCiuperciCreator extends SupaCreator {
    @Override
    public Supa prepara() {
        return new SupaCiuperci();
    }
}
