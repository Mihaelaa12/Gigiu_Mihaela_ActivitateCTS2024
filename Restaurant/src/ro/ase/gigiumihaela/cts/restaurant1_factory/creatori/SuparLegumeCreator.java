package ro.ase.gigiumihaela.cts.restaurant1_factory.creatori;

import ro.ase.gigiumihaela.cts.restaurant1_factory.clase.SupaLegume;
import ro.ase.gigiumihaela.cts.restaurant1_factory.interfete.Supa;
import ro.ase.gigiumihaela.cts.restaurant1_factory.interfete.SupaCreator;

public class SuparLegumeCreator extends SupaCreator {
    @Override
    public Supa prepara() {
        return new SupaLegume();
    }
}
