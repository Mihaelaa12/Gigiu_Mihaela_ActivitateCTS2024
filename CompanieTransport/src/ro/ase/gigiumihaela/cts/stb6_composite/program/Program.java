package ro.ase.gigiumihaela.cts.stb6_composite.program;

import ro.ase.gigiumihaela.cts.stb6_composite.clase.AutobuzLinie;
import ro.ase.gigiumihaela.cts.stb6_composite.clase.GrupuriMici;
import ro.ase.gigiumihaela.cts.stb6_composite.interfete.Autobuz;

public class Program {
    public static void main(String[] args) {
        Autobuz autobuz1 = new AutobuzLinie("Opel", "VX2500", 60),
            autobuz2 = new AutobuzLinie("Opel", "VX2501", 70),
             autobuz3 = new AutobuzLinie("Mercedes", "VX2500", 50);

        Autobuz grup1 = new GrupuriMici("Grupuri mici"),
                grup2 = new GrupuriMici("Grupuri medii"),
                grup3 = new GrupuriMici("Grupuri mari");

        grup1.adauga(autobuz1);
        grup1.adauga(autobuz2);

        grup2.adauga(autobuz3);
        grup2.adauga(grup3);

        grup1.adauga(grup2);
        grup1.testare();

        System.out.println(grup1.get(0));
        grup2.elimina(grup2.get(0));

        grup2.testare();
    }
}