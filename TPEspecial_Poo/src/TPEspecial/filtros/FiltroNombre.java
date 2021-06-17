package TPEspecial.filtros;

import TPEspecial.Comida;
import TPEspecial.filtros.Filtro;

public class FiltroNombre extends Filtro {
    private String nombre;

    public FiltroNombre (String nombre) {this.nombre = nombre;}

    public boolean cumple (Comida comida) {return comida.getNombre().equals(nombre);}
}
