package TPEspecial.filtros;

import TPEspecial.Comida;
import TPEspecial.filtros.Filtro;

public class FiltroPreparacion extends Filtro {
    private String preparacion;

    public FiltroPreparacion (String preparacion) {this.preparacion = preparacion;}

    public boolean cumple (Comida comida) {return comida.getModo_preparacion().equals(preparacion);}
}
