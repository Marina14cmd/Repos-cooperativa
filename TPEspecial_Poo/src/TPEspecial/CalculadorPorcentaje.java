package TPEspecial;

public class CalculadorPorcentaje extends Calculador{

    int porcentaje;

    public CalculadorPorcentaje( int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularMonto (Comida comida) {
        return (comida.getPrecio() * porcentaje/100);
    }
}
