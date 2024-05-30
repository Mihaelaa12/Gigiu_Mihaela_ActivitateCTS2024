package ro.ase.gigiumihaela.cts.spital1_builder.clase;

import ro.ase.gigiumihaela.cts.spital1_builder.interfete.ConstruireFacilitate;
import ro.ase.gigiumihaela.cts.spital1_builder.interfete.Facilitate;

public class FacilitateBuilder implements ConstruireFacilitate {
    private final Facilitate facilitate;

    @Override
    public void includeMicDejun() {
        this.facilitate.micDejun();
    }

    @Override
    public void includePatRabatabil() {
        this.facilitate.patRabatabil();
    }

    @Override
    public void includeSlapi() {
        this.facilitate.slapi();
    }

    @Override
    public Facilitate getFacilitate() {
        return this.facilitate;
    }

    public FacilitateBuilder() {
        this.facilitate = new FacilitatePacient();
    }
}