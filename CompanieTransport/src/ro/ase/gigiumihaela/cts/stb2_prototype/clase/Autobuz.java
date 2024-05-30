package ro.ase.gigiumihaela.cts.stb2_prototype.clase;

import ro.ase.gigiumihaela.cts.stb2_prototype.interfete.PrototypeMijlocTransport;
import ro.ase.gigiumihaela.cts.stb2_prototype.interfete.TipAutobuz;

public class Autobuz implements PrototypeMijlocTransport {
    private String producator;
    private String model;
    private TipAutobuz tipAutobuz;

    public Autobuz(String producator, String model, TipAutobuz tipAutobuz) {
        this.producator = producator;
        this.model = model;
        this.tipAutobuz = tipAutobuz;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTipAutobuz(TipAutobuz tipAutobuz) {
        this.tipAutobuz = tipAutobuz;
    }

    public Autobuz(Autobuz prototypeAutobuz) {
        this.producator = prototypeAutobuz.getProducator();
        this.model = prototypeAutobuz.getModel();
        this.tipAutobuz = prototypeAutobuz.getTipAutobuz();
    }

    public String getProducator() {
        return producator;
    }

    public String getModel() {
        return model;
    }

    public TipAutobuz getTipAutobuz() {
        return tipAutobuz;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("producator='").append(producator).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", tipAutobuz=").append(tipAutobuz);
        sb.append('}');

        return sb.toString();
    }

    /**
     * @return
     */
    @Override
    public PrototypeMijlocTransport clone() {
        return new Autobuz(this);
    }
}
