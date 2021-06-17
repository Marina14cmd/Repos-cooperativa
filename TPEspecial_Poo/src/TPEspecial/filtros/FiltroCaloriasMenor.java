package TPEspecial.filtros;

import TPEspecial.Comida;

public class FiltroCaloriasMenor extends Filtro {
    private int calorias;

    public FiltroCaloriasMenor(int calorias) {this.calorias = calorias;}

    public boolean cumple (Comida comida) {return comida.getCalorias() <= calorias;}
}
