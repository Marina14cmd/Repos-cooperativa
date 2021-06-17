package TPEspecial.filtros;

import TPEspecial.Comida;
import TPEspecial.filtros.Filtro;

public class FiltroNot extends Filtro {
    private Filtro f1;

    public FiltroNot(Filtro f1) {
        this.f1= f1;
    }
    @Override
    public boolean cumple(Comida a) {

        return ! f1.cumple(a);
    }
}
