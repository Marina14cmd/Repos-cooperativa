package TPEspecial.filtros;

import TPEspecial.Comida;

public class FiltroCaloriasMayor extends Filtro{
    private int calorias;

    public FiltroCaloriasMayor(int calorias) {this.calorias = calorias;}

    public boolean cumple (Comida comida) {return comida.getCalorias() > calorias;}
}

