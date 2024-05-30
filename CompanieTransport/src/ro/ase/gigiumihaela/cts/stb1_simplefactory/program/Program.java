package ro.ase.gigiumihaela.cts.stb1_simplefactory.program;

import ro.ase.gigiumihaela.cts.stb1_simplefactory.clase.CreatorMijlocTransport;
import ro.ase.gigiumihaela.cts.stb1_simplefactory.intefete.TipMijlocTransport;

public class Program {
    public static void main(String[] args) {
        for(TipMijlocTransport tip : TipMijlocTransport.values()) {
            new CreatorMijlocTransport().creaza(tip).proneste();
        }
    }
}