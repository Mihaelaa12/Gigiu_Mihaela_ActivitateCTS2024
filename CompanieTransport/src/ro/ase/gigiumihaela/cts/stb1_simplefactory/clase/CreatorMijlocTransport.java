package ro.ase.gigiumihaela.cts.stb1_simplefactory.clase;

import ro.ase.gigiumihaela.cts.stb1_simplefactory.intefete.MijlocTransport;
import ro.ase.gigiumihaela.cts.stb1_simplefactory.intefete.TipMijlocTransport;

public class CreatorMijlocTransport {
    public MijlocTransport creaza(TipMijlocTransport tip) {
        switch (tip) {
            case Autobuz -> {
                return new Autobuz();
            }

            case Tramvai -> {
                return new Tramvai();
            }

            case Troleibuz -> {
                return new Troleibuz();
            }

            default -> {
                return null;
            }
        }
    }
}