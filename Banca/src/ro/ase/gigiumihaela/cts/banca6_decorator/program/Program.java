package ro.ase.gigiumihaela.cts.banca6_decorator.program;

import ro.ase.gigiumihaela.cts.banca6_decorator.clase.*;
import ro.ase.gigiumihaela.cts.banca6_decorator.interfete.*;

public class Program {
    public static void main(String[] args) {
        ContBancar contBancar = new ContClient("RO552200");
        contBancar.plataOnline();
        contBancar.plataCard();

        DecoratorContBancar decoratorContBancar = new DecoratorContClient(contBancar);
        decoratorContBancar.plataCard();
        decoratorContBancar.plataOnline();
        decoratorContBancar.plataContactLess();
    }
}