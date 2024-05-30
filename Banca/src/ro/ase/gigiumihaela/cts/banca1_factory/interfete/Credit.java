package ro.ase.gigiumihaela.cts.banca1_factory.interfete;

public abstract class Credit {
    protected int suma;

    public abstract void acorda();

    public Credit(int suma) {
        this.suma = suma;
    }
}