package ro.ase.gigiumihaela.cts.spital1_builder.clase;

import ro.ase.gigiumihaela.cts.spital1_builder.interfete.Facilitate;

public final class Pacient {
    private final String nume;
    private final int varsta;

    private final Facilitate facilitatePacient;

    public Pacient(String nume, int varsta, Facilitate facilitatePacient) {
        this.nume = nume;
        this.varsta = varsta;
        this.facilitatePacient = facilitatePacient;
    }

    public String getNume() {
        return this.nume;
    }

    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public String toString() {
        return String.format("%s %d ani (%s)", this.getNume(), this.varsta, this.getFacilitatePacient());
    }

    public Facilitate getFacilitatePacient() {
        return this.facilitatePacient;
    }
}