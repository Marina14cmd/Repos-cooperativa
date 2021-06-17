package TPEspecial.filtros;

import TPEspecial.Comida;
import TPEspecial.filtros.Filtro;

public class FiltroOr extends Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroOr(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public boolean cumple (Comida elem) {
        return f1.cumple(elem)|| f2.cumple(elem);
    }
}
