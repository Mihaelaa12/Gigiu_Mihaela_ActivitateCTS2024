package ro.ase.gigiumihaela.cts.farmacie2_factory.interfete;

public abstract class Medicament {
    public abstract void fabricare();
    private double pret;
    private String denumire;

    @Override
    public String toString() {
        return String.format("%s %.2f", this.denumire, this.pret);
    }

    public Medicament(double pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }
}