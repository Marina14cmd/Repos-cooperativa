package TPEspecial;

public abstract class Comida {
    protected String nombre;
    protected String tipo_comida;
    protected String modo_preparacion;

	public Comida(String nombre, String tipo_comida, String modo_preparacion) {
		this.nombre = nombre;
		this.tipo_comida = tipo_comida;
		this.modo_preparacion = modo_preparacion;
	}

    public String getNombre() {
        return nombre;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public String getModo_preparacion() {
        return modo_preparacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    public void setModo_preparacion(String modo_preparacion) {
        this.modo_preparacion = modo_preparacion;
    }

    public abstract int getCalorias();

    public abstract double getPrecio();

    public abstract int getTiempo();

    public abstract String toString();
}