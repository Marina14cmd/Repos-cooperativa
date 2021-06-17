package TPEspecial;

import TPEspecial.filtros.Filtro;

public class CalculadorPorcentaje extends Calculador{

    int porcentaje;

    public CalculadorPorcentaje( int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double calcularMonto (Comida comida) {
        return (comida.getPrecio() * porcentaje/100);
    }
}
