package TPEspecial;

import TPEspecial.filtros.Filtro;

public class CalculadorPrecioFijo extends Calculador{

    private int precio;

    public CalculadorPrecioFijo(int precio,Filtro filtro) {
        super(filtro);
        this.precio = precio;
    }

    @Override
    public double calcularMonto(Comida comida) {
        double retorno = 0;
        if(filtro.cumple(comida)) {
            retorno += comida.getPrecio() + precio;
        }

        return retorno;
    }
}
