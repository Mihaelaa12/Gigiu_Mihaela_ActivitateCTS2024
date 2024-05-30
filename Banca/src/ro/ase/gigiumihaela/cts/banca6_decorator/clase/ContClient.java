package ro.ase.gigiumihaela.cts.banca6_decorator.clase;

import ro.ase.gigiumihaela.cts.banca6_decorator.interfete.ContBancar;

public class ContClient implements ContBancar {

    public ContClient(String numarCont) {
        this.numarCont = numarCont;
    }

    private String numarCont;

    @Override
    public String getNumarCont() {
        return this.numarCont;
    }

    @Override
    public void plataCard() {
        System.out.printf("Plata cu cardul %s.\n", this.getNumarCont());
    }

    @Override
    public void plataOnline() {
        System.out.printf("Plata online cu cardul %s.\n", this.getNumarCont());
    }
}