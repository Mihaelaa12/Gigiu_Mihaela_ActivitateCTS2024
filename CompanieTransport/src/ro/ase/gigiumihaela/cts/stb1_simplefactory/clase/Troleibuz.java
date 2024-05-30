package ro.ase.gigiumihaela.cts.stb1_simplefactory.clase;

import ro.ase.gigiumihaela.cts.stb1_simplefactory.intefete.MijlocTransport;

public class Troleibuz implements MijlocTransport {
    @Override
    public void proneste() {
        System.out.println("Porneste troleibuzul.");
    }
}