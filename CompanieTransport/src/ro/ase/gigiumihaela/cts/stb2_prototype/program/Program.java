package ro.ase.gigiumihaela.cts.stb2_prototype.program;

import ro.ase.gigiumihaela.cts.stb2_prototype.clase.Autobuz;
import ro.ase.gigiumihaela.cts.stb2_prototype.interfete.TipAutobuz;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Ford", "1000", TipAutobuz.Diesel);
        System.out.println("Creare autobuz pe baza celui existent.");
        Autobuz autobuzNou = (Autobuz) autobuz.clone();
        System.out.println(autobuz);

        System.out.println("Modificare autobuz nou.");
        autobuzNou.setTipAutobuz(TipAutobuz.Sprinter);
        autobuzNou.setModel("1000-X");
        System.out.println(autobuzNou);
    }
}