package ro.ase.gigiumihaela.cts.stb4_adapter.clase;

import ro.ase.gigiumihaela.cts.stb4_adapter.interfete.SistemPlataMetrorex;

public class SistemMetrorex implements SistemPlataMetrorex {
    @Override
    public void achizitioneazaTichet(TipBiletMetrou tipBilet) {
        System.out.printf("Achizitioneaza bilet %s.\n", tipBilet.name());
    }
}