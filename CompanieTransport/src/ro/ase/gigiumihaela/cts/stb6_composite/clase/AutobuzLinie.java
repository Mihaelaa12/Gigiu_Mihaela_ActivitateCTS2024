package ro.ase.gigiumihaela.cts.stb6_composite.clase;

import ro.ase.gigiumihaela.cts.stb6_composite.interfete.Autobuz;
import ro.ase.gigiumihaela.cts.stb6_composite.interfete.Identitate;

public class AutobuzLinie implements Autobuz, Identitate {
    private final String producator;
    private final String model;
    private final Integer capacitate;

    public AutobuzLinie(String producator, String model, Integer capacitate) {
        this.producator = producator;
        this.model = model;
        this.capacitate = capacitate;
    }

    /**
     * @param index
     * @return
     */
    @Override
    public Autobuz get(Integer index) {
        return null;
    }

    /**
     * @param autobuz
     */
    @Override
    public void adauga(Autobuz autobuz) {

    }

    /**
     * @param autobuz
     */
    @Override
    public void elimina(Autobuz autobuz) {

    }

    @Override
    public String toString() {
        return String.format("%s (%s) %d locuri.\n", this.producator, this.model, this.capacitate);
    }

    /**
     *
     */
    @Override
    public void testare() {

    }

    /**
     * @return
     */
    @Override
    public String getProducator() {
        return this.producator;
    }

    /**
     * @return
     */
    @Override
    public String getModel() {
        return this.model;
    }

    /**
     * @return
     */
    @Override
    public Integer getCapacitate() {
        return this.capacitate;
    }
}
