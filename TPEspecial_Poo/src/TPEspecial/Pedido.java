package TPEspecial;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Comida> conjuntoComidas;
    private int numeroMesa;
    private String mozo;

    public Pedido (String mozo,int mesa) {
        this.mozo = mozo;
        this.numeroMesa =mesa;
        this.conjuntoComidas = new ArrayList<Comida>();
    }

    public ArrayList<Comida> getComida() { //nose
        return conjuntoComidas;
    }

    public double devolverCosto () {
        double retorno =0;
        for (int i =0;i<conjuntoComidas.size();i++) {
            retorno += conjuntoComidas.get(i).getPrecio();
        }
        return retorno;
    }

    public void agregarAPedido (Comida comida) {
        this.conjuntoComidas.add(comida);
    }

    public ArrayList<Comida> devolverComidas () {
        ArrayList<Comida> retorno = new ArrayList<Comida>();
        Comida comida = null;
        for (int i = 0; i < conjuntoComidas.size(); i++) {
            comida = conjuntoComidas.get(i);
            retorno.add(comida);
        }
        return retorno;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getMozo() {
        return mozo;
    }

    public void setMozo(String mozo) {
        this.mozo = mozo;
    }

    @Override
    public String toString() {
        return "Pedido:" + "\n" +
                "Numero de mesa= " + numeroMesa + "\n" +
                "Mozo= " + mozo + "\n" +
                "Comidas pedidas= " +"\n" + conjuntoComidas.toString()
                ;
    }
}
