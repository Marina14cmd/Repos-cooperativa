package TPEspecial.filtros;

import TPEspecial.Comida;
import TPEspecial.filtros.Filtro;

public class FiltroTiempoMenor extends Filtro {
    private int tiempo;

    public FiltroTiempoMenor(int tiempo) {this.tiempo = tiempo;}

    public boolean cumple (Comida comida) {return comida.getTiempo() <= tiempo;}
}
