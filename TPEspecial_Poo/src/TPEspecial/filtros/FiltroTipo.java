package TPEspecial.filtros;

import TPEspecial.Comida;
import TPEspecial.filtros.Filtro;

public class FiltroTipo extends Filtro {

    private String tipo;

    public FiltroTipo (String tipo) {this.tipo = tipo;}

    public boolean cumple (Comida comida) {return comida.getTipo_comida().equals(tipo);}
}
