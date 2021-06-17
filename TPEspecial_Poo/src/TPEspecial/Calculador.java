package TPEspecial;

import TPEspecial.filtros.Filtro;

public abstract class Calculador {

    protected Filtro filtro;

    public Calculador (Filtro filtro) {
        this.filtro = filtro;
    }

    public abstract double calcularMonto (Comida comida, Filtro filtro);
}
