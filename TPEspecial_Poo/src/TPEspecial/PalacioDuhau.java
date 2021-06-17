package TPEspecial;

import TPEspecial.filtros.*;

public class PalacioDuhau {
    public static void main(String[] args) {

        Cocina cocina = new Cocina();

        Filtro lacteo= new FiltroTipo("lacteo");
        Filtro calorias = new FiltroCaloriasMayor(500);
        Filtro menorCincuenta= new FiltroTiempoMenor(50);
        Filtro menorQuince= new FiltroTiempoMenor(15);
        Filtro alHorno= new FiltroPreparacion("al horno");
        Filtro timeAndHorno = new FiltroAnd(alHorno,menorQuince);
        Filtro ensalada= new FiltroTipo("ensalada");
        Filtro notEnsalada= new FiltroNot(ensalada);
        Filtro salado= new FiltroTipo("salado");
        Filtro notTimeAndHorno = new FiltroNot(timeAndHorno);
        Filtro timeAndCalorias = new FiltroAnd(calorias,menorCincuenta);

        Calculador miercoles = new CalculadorPorcentaje(-20);
        Calculador tiempoAlHorno = new CalculadorPrecioFijo(50,130,timeAndHorno);
        Calculador criterioEnsalada = new CalculadorPrecioFijo(10,50,ensalada);
        Calculador caloriasQuinientos = new CalculadorPrecioFijo(100,0,calorias);
        Calculador propina = new CalculadorPorcentaje(55);

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


    }
}
