import java.time.LocalDate;
import java.util.Date;

public class Ciudadano {

	private String nombre;
	private String apellido;
	private long telefono;
	private PuntoMapa direccion;
	
	public Ciudadano(String nombre, String apellido, long telefono, PuntoMapa direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		apellido = apellido;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public PuntoMapa getDireccion() {
		return direccion;
	}

	public void setDireccion(PuntoMapa direccion) {
		this.direccion = direccion;
	}
	
	public boolean verificaRadio(CentroAcopio centroAcopio) {
		if(Math.sqrt(Math.pow(this.getDireccion().getX(), 2) + Math.pow(this.getDireccion().getY(), 2)) <= 6)
			return true;
		return false;
	}
	
	
}
