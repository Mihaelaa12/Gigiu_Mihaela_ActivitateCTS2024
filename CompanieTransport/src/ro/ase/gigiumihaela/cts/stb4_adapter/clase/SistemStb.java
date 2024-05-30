package ro.ase.gigiumihaela.cts.stb4_adapter.clase;

import ro.ase.gigiumihaela.cts.stb4_adapter.interfete.SistemPlataStb;

public class SistemStb implements SistemPlataStb {
    @Override
    public void achizitioneaza(TipBiletStb tipBilet) {
        System.out.printf("Achizitioneaza bilet %s.\n", tipBilet.name());
    }
}