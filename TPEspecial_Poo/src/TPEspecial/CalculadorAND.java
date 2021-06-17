package TPEspecial;

import TPEspecial.filtros.Filtro;

public class CalculadorAND extends Calculador{

    Calculador c1;
    Calculador c2;

    public CalculadorAND(String nombre,Calculador c1, Calculador c2) {
        super(nombre);
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double calcularMonto(Comida comida, Filtro filtro) {
        double retorno = 0;
        retorno += (c1.calcularMonto(comida,filtro)+c2.calcularMonto(comida,filtro));
        return retorno;
    }
}
