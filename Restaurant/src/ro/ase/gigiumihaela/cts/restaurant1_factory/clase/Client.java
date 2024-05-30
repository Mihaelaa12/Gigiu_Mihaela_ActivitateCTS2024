package ro.ase.gigiumihaela.cts.restaurant1_factory.clase;

import ro.ase.gigiumihaela.cts.restaurant1_factory.interfete.Supa;
import ro.ase.gigiumihaela.cts.restaurant1_factory.interfete.SupaCreator;

public class Client {
    private final SupaCreator supaCreator;

    public Client(SupaCreator supaCreator) {
        this.supaCreator = supaCreator;
    }

    public Supa prepara() {
        return this.supaCreator.prepara();
    }
}
