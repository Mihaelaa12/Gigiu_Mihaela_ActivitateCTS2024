package ro.ase.gigiumihaela.cts.farmacie1_simplefactory.interfete;

public abstract class Medicament {
    private double pret;
    private String denumire;
    public Medicament(double pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    public abstract void fabricare();

    @Override
    public String toString() {
        return String.format("%s %.2f", this.denumire, this.pret);
    }
}