package TPEspecial;

import TPEspecial.filtros.Filtro;

public class CalculadorAND extends Calculador{

    Calculador c1;
    Calculador c2;

    public CalculadorAND(Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double calcularMonto(Comida comida) {
        double retorno = 0;
        retorno += (c1.calcularMonto(comida)+c2.calcularMonto(comida));
        return retorno;
    }
}
