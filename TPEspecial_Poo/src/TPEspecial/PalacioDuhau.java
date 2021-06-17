package TPEspecial;

import TPEspecial.filtros.*;

import java.util.ArrayList;

public class PalacioDuhau {
    public static void main(String[] args) {

        Cocina cocina = new Cocina();

        Filtro lacteo= new FiltroTipo("lacteo");
        Filtro calorias = new FiltroCaloriasMenor(250);
        Filtro menorCincuenta= new FiltroTiempoMenor(50);
        Filtro menorQuince= new FiltroTiempoMenor(15);
        Filtro alHorno= new FiltroPreparacion("al horno");
        Filtro ensalada= new FiltroTipo("ensalada");
        Filtro salado= new FiltroTipo("salado");
        Filtro timeAndCalorias = new FiltroAnd(calorias,menorCincuenta);

        Calculador miercoles = new CalculadorPorcentaje(55);
        cocina.setCalculador(miercoles);

        EstacionTrabajo lacteos = new EstacionTrabajo("Lacteos",lacteo);
        EstacionTrabajo panaderia = new EstacionTrabajo("Panaderia",timeAndCalorias);
        EstacionTrabajo pasta = new EstacionTrabajo("pasta",salado);

        cocina.agregarEstacion(lacteos);
        cocina.agregarEstacion(panaderia);
        cocina.agregarEstacion(pasta);

        ComidaCompleja lasagna = new ComidaCompleja("lasagna", "pasta", "al horno");
        ComidaSimple relleno = new ComidaSimple("relleno", "carne", "sarten" , 200, 40, 170);
        ComidaSimple salsa = new ComidaSimple("salsa", "lacteo", "olla" , 250, 40, 180);
        ComidaSimple masa = new ComidaSimple("masa", "Panaderia", "-" , 250, 40, 180);
        lasagna.agregarComida(relleno);
        lasagna.agregarComida(salsa);
        lasagna.agregarComida(masa);

        ComidaCompleja alfajor = new ComidaCompleja("alfajor","postre","al horno");
        ComidaSimple tapas = new ComidaSimple("tapas", "panaderia", "horno" , 500, 50, 470);
        ComidaSimple ganache = new ComidaSimple("ganache", "pasteleria", "-" , 250, 30, 70);
        alfajor.agregarComida(tapas);
        alfajor.agregarComida(ganache);


        Pedido primero = new Pedido("Mario",1);
        primero.agregarAPedido(lasagna);
        primero.agregarAPedido(alfajor);

        cocina.precioPedido()

        System.out.println(primero.toString());

    }
}
