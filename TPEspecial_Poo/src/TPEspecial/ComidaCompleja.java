package TPEspecial;

import java.util.ArrayList;

public class ComidaCompleja extends Comida {

	private ArrayList<Comida> comidas;

	public ComidaCompleja(String nombre, String tipo_comida, String modo_preparacion){
		super(nombre, tipo_comida, modo_preparacion);
		comidas = new ArrayList<Comida> ();
	}

    public int getCalorias() {
        int calorias = 0;
        Comida comida;
        for(int i =0; i < comidas.size(); i++) {
            comida = comidas.get(i);
            calorias = calorias + comida.getCalorias();
        }
        return calorias;
    }

    public int getTiempo() {
        int tiempo = 0;
        Comida comida;
        for(int i =0; i < comidas.size(); i++) {
            comida = comidas.get(i);
            tiempo = tiempo + comida.getTiempo();
        }
        return tiempo;
    }

    public double getPrecio() {
        double precio = 0;
        Comida comida;
        for(int i =0; i < comidas.size(); i++) {
            comida = comidas.get(i);
            precio = precio + comida.getPrecio();
        }
        return precio;
    }

    public void agregarComida(Comida x) {
            comidas.add(x);
    }


    public void eliminarComida(Comida x) {
        if (comidas.contains(x))
            comidas.remove(x);
    }

    @Override
	public String toString() {
		return "ComidaCompleja : \n" + "Nombre= " + nombre + "\n" +  "Tipo de comida= " + tipo_comida
				+"\n" + "Modo de preparacion= " + modo_preparacion + "\n" + "Se compone de: " + "\n" +comidas.toString();
	}
}

