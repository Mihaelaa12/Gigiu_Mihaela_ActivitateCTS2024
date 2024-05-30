package ro.ase.gigiumihaela.cts.stb4_adapter.program;

import ro.ase.gigiumihaela.cts.stb4_adapter.adaptor.*;
import ro.ase.gigiumihaela.cts.stb4_adapter.clase.*;
import ro.ase.gigiumihaela.cts.stb4_adapter.interfete.*;

public class Program {
    public static void main(String[] args) {
        SistemPlataMetrorex sistemMetrorex = new SistemMetrorex();
        sistemMetrorex.achizitioneazaTichet(TipBiletMetrou.AbonamentLunar);

        SistemPlataStb sistemPlataStb = new SistemStb();
        sistemPlataStb.achizitioneaza(TipBiletStb.ToateLiniile);

        AdaptorSistemPlata sistemUnic = new AdaptorSistemPlata(sistemMetrorex);
        sistemUnic.achizitioneaza(TipBiletStb.LiniSimpla);
        sistemUnic.achizitioneazaTichet(TipBiletMetrou.CalatoriiZece);
    }
}