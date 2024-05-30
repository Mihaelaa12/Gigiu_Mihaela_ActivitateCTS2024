package ro.ase.gigiumihaela.cts.banca3_builder.program;

import ro.ase.gigiumihaela.cts.banca3_builder.clase.ContBancar;

public class Program {
    public static void main(String[] args) {
        var builder = new ContBancar.Builder();
        builder.setEstContSalariu(false).setAreCardAtasat(true).setAreInternetBanking(true);
        ContBancar contBancar = builder.build();
        System.out.println(contBancar);

        System.out.println(new ContBancar.Builder().setEstContSalariu(true).setAreCardAtasat(true).build());
    }
}