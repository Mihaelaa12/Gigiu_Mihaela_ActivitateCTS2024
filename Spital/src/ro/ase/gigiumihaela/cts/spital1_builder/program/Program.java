package ro.ase.gigiumihaela.cts.spital1_builder.program;

import ro.ase.gigiumihaela.cts.spital1_builder.clase.FacilitateBuilder;
import ro.ase.gigiumihaela.cts.spital1_builder.clase.Pacient;
import ro.ase.gigiumihaela.cts.spital1_builder.interfete.ConstruireFacilitate;

public class Program {
    public static void main(String[] args) {
        ConstruireFacilitate facilitateBuilder = new FacilitateBuilder();
        facilitateBuilder.includeMicDejun();
        facilitateBuilder.includePatRabatabil();
        facilitateBuilder.includeSlapi();

        Pacient pacient = new Pacient("Danut", 46, facilitateBuilder.getFacilitate());
        System.out.println(pacient);
    }
}