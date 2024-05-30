package ro.ase.gigiumihaela.cts.stb6_composite.clase;

import ro.ase.gigiumihaela.cts.stb6_composite.interfete.Autobuz;

import java.util.ArrayList;
import java.util.List;

public class GrupuriMici implements Autobuz {
    private final List<Autobuz> elemente = new ArrayList<>();
    private final String denumire;

    public GrupuriMici(String denumire) {
        this.denumire = denumire;
    }

    /**
     * @param index
     * @return
     */
    @Override
    public Autobuz get(Integer index) {
        return 0 <= index && index <= this.elemente.size() ? this.elemente.get(index) : null;
    }

    /**
     * @param autobuz
     */
    @Override
    public void adauga(Autobuz autobuz) {
        if(autobuz != null) {
            this.elemente.add(autobuz);
        }
    }

    /**
     * @param autobuz
     */
    @Override
    public void elimina(Autobuz autobuz) {
        if(autobuz != null && this.elemente.contains(autobuz)) {
            this.elemente.remove(autobuz);
        }
    }

    /**
     *
     */
    @Override
    public void testare() {
        System.out.printf("Testare %s.\n", this.toString());
    }

    /**
     * @return
     */

    /**
     * @return
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.denumire);
        sb.append(" locuri");
        sb.append("\n").append("Elemente componente.\n");
        for(Autobuz autobuz : this.elemente) {
            sb.append(autobuz).append("\n");
        }

        return sb.toString();
    }
}
