package ro.ase.gigiumihaela.cts.banca2_factory.interfete;

public abstract class Credit {
    protected int valoare;

    public Credit(int valoare) {
        this.valoare = valoare;
    }

    public abstract void aproba();

    @Override
    public String toString() {
        return "Credit{" +
                "valoare=" + valoare +
                '}';
    }
}
