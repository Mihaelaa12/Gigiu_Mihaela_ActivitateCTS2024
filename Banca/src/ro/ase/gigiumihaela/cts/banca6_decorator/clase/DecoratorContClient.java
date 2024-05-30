package ro.ase.gigiumihaela.cts.banca6_decorator.clase;

import ro.ase.gigiumihaela.cts.banca6_decorator.interfete.ContBancar;
import ro.ase.gigiumihaela.cts.banca6_decorator.interfete.DecoratorContBancar;

public class DecoratorContClient extends DecoratorContBancar {
    public DecoratorContClient(ContBancar contBancar) {
        super(contBancar);
    }

    @Override
    public void plataContactLess() {
        System.out.printf("Plata contact less din contul %s.\n", this.contBancar.getNumarCont());
    }
}