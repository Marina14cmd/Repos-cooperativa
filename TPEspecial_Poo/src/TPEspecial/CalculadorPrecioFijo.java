package TPEspecial;

import TPEspecial.filtros.Filtro;

public class CalculadorPrecioFijo extends Calculador{

    private int precio1;
    private int precio2;
    private Filtro filtro;

    public CalculadorPrecioFijo(int precio1,int precio2,Filtro filtro) {
        this.precio1 = precio1;
        this.precio2 = precio2;
        this.filtro = filtro;
    }

    @Override
    public double calcularMonto(Comida comida) {
        double retorno = 0;
        if(filtro.cumple(comida))
            return comida.getPrecio() + precio1;
        else
            return comida.getPrecio() + precio2;
    }
}
