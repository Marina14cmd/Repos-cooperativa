package TPEspecial;

public class ComidaSimple extends Comida{

	private int calorias;
	private int tiempo;
	private double precio;

	public ComidaSimple(String nombre, String tipo_comida, String modo_preparacion, int calorias, int tiempo, double precio) {
		super(nombre, tipo_comida, modo_preparacion);
		this.calorias = calorias;
		this.tiempo = tiempo;
		this.precio = precio;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCalorias() {
		return calorias;
	}

	public int getTiempo() {
		return tiempo;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "ComidaSimple" + "\n" +
				"nombre= " + nombre + "\n" +
				"tipo_comida= " + tipo_comida + "\n" +
				"modo_preparacion= " + modo_preparacion + "\n" +
				"calorias= " + calorias + "\n" +
				"tiempo= " + tiempo + "\n" +
				"precio= " + precio + '\n';
	}
}
