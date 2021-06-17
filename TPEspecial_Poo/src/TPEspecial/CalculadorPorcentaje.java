package TPEspecial;

import TPEspecial.filtros.Filtro;

public class CalculadorPorcentaje extends Calculador{

    int porcentaje;

    public CalculadorPorcentaje(Filtro filtro, int porcentaje) {
        super(filtro);
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularMonto () {
        double retorno = 0;
        if (filtro.cumple()) {
            retorno += (comida.getPrecio() * porcentaje/100);
        }
        return retorno;
    }
}
