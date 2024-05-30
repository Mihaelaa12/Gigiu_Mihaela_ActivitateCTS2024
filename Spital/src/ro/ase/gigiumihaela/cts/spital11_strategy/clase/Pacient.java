package ro.ase.gigiumihaela.cts.spital11_strategy.clase;

import ro.ase.gigiumihaela.cts.spital11_strategy.interfete.ModalitatePlata;

public class Pacient {
    private final String nume;
    private ModalitatePlata modaliatePlata;

    public String getNume() {
        return nume;
    }

    public ModalitatePlata getModaliatePlata() {
        return modaliatePlata;
    }

    public void setModaliatePlata(ModalitatePlata modaliatePlata) {
        this.modaliatePlata = modaliatePlata;
    }

    public Pacient(String nume, ModalitatePlata modaliatePlata) {
        this.nume = nume;
        this.modaliatePlata = modaliatePlata;
    }

    public void achitaFactura(double suma) {
        System.out.printf("%s achita factura.\n", this.nume);
        this.modaliatePlata.efectueazaPlata(suma);
    }
}