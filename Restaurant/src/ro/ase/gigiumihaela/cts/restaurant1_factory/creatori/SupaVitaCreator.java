package ro.ase.gigiumihaela.cts.restaurant1_factory.creatori;

import ro.ase.gigiumihaela.cts.restaurant1_factory.clase.SupaVita;
import ro.ase.gigiumihaela.cts.restaurant1_factory.interfete.Supa;
import ro.ase.gigiumihaela.cts.restaurant1_factory.interfete.SupaCreator;

public class SupaVitaCreator extends SupaCreator {
    @Override
    public Supa prepara() {
        return new SupaVita();
    }
}
