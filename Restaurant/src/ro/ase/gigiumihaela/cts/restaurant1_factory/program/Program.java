package ro.ase.gigiumihaela.cts.restaurant1_factory.program;

import ro.ase.gigiumihaela.cts.restaurant1_factory.clase.Client;
import ro.ase.gigiumihaela.cts.restaurant1_factory.clase.TipSupa;
import ro.ase.gigiumihaela.cts.restaurant1_factory.creatori.*;

public class Program {
    public static void main(String[] args) {
        for (TipSupa tipSupa : TipSupa.values()) {
            switch (tipSupa) {
                case SupaVita -> new Client(new SupaVitaCreator()).prepara().serveste();
                case SupaCiuperci -> new Client(new SuparCiuperciCreator()).prepara().serveste();
                case SupaLegume -> new Client(new SuparLegumeCreator()).prepara().serveste();
                case SupaRosii -> new Client(new SupaRosiiCreator()).prepara().serveste();
                case SupaCrema -> new Client(new SupaCremaCreator()).prepara().serveste();
            }
        }
    }
}