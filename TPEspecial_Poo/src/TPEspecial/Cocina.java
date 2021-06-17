package TPEspecial;

import TPEspecial.filtros.Filtro;

import java.util.ArrayList;

public class Cocina {
    private ArrayList<EstacionTrabajo> estaciones = new ArrayList<EstacionTrabajo>();
    private EstacionTrabajo defecto;
    private Calculador calculador;


    public Cocina () {
        this.estaciones = new ArrayList<EstacionTrabajo>();
        this.defecto = new EstacionTrabajo("Defecto",null);
    }

    public EstacionTrabajo getDefecto() {
        return defecto;
    }

    public Calculador getCalculador() {
        return calculador;
    }

    public void setDefecto(EstacionTrabajo defecto) {
        this.defecto = defecto;
    }

    public void setCalculador(Calculador calculador) {
        this.calculador = calculador;
    }

    public void asignarPedidos (Pedido pedido) {
        ArrayList<Comida> comidasPedidas = new ArrayList<Comida>(pedido.devolverComidas());
        for (Comida comidasPedida : comidasPedidas) {
            boolean aceptada = false;
            for (EstacionTrabajo estaciones : estaciones) {
                if (estaciones.aceptarComida(comidasPedida)){
                    aceptada = true;
                }
            }
            if (!aceptada)
                defecto.aceptarComida(comidasPedida);
        }
    }

    public void agregarEstacion (EstacionTrabajo estacion) {
        estaciones.add(estacion);
    }

    public void eliminarEstacion (EstacionTrabajo estacion) {
        estaciones.remove(estacion);
    }
   /* public void agregarCriterioDeCobro (Filtro filtro) {
        criterioDeCobro.add(filtro);
    }*/

    public double precioPedido (Filtro filtro,Pedido pedido) {
        double retorno = 0;
        retorno += pedido.devolverCosto();
        for (int i =0;i <pedido.devolverComidas().size();i++) {
            retorno += calculador.calcularMonto(pedido.devolverComidas().get(i));
        }
        return retorno;
    }

}
