package ro.ase.gigiumihaela.cts.stb4_adapter.adaptor;

import ro.ase.gigiumihaela.cts.stb4_adapter.clase.SistemMetrorex;
import ro.ase.gigiumihaela.cts.stb4_adapter.clase.SistemStb;
import ro.ase.gigiumihaela.cts.stb4_adapter.clase.TipBiletMetrou;
import ro.ase.gigiumihaela.cts.stb4_adapter.clase.TipBiletStb;
import ro.ase.gigiumihaela.cts.stb4_adapter.interfete.SistemPlataMetrorex;
import ro.ase.gigiumihaela.cts.stb4_adapter.interfete.SistemPlataStb;

public class AdaptorSistemPlata extends SistemMetrorex implements SistemPlataStb {
    private final SistemPlataMetrorex sistemPlataMetrorex;

    public AdaptorSistemPlata(SistemPlataMetrorex sistemPlataMetrorex) {
        this.sistemPlataMetrorex = sistemPlataMetrorex;
    }

    @Override
    public void achizitioneazaTichet(TipBiletMetrou tipBilet) {
        System.out.println("Sistem de plata adaptat");
        this.sistemPlataMetrorex.achizitioneazaTichet(tipBilet);
    }

    @Override
    public void achizitioneaza(TipBiletStb tipBilet) {
        SistemPlataStb sistemPlataStb = new SistemStb();
        sistemPlataStb.achizitioneaza(tipBilet);
    }
}