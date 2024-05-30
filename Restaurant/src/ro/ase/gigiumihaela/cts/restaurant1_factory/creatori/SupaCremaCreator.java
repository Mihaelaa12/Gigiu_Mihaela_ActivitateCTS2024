package ro.ase.gigiumihaela.cts.restaurant1_factory.creatori;

import ro.ase.gigiumihaela.cts.restaurant1_factory.clase.SupaCrema;
import ro.ase.gigiumihaela.cts.restaurant1_factory.interfete.Supa;
import ro.ase.gigiumihaela.cts.restaurant1_factory.interfete.SupaCreator;

public class SupaCremaCreator extends SupaCreator {
    @Override
    public Supa prepara() {
        return new SupaCrema();
    }
}
