package TPEspecial.filtros;

import TPEspecial.Comida;
import TPEspecial.filtros.Filtro;

public class FiltroPrecioMenor extends Filtro {
    private double precio;

    public FiltroPrecioMenor(double precio) {this.precio = precio;}

    public boolean cumple (Comida comida) {return comida.getPrecio() <= precio;}
}
