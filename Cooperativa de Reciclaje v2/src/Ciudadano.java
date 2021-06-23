import java.time.LocalDate;
import java.util.Date;

public class Ciudadano {

	private String nombre;
	private String Apellido;
	private long telefono;
	private String direccion;
	private Date franjaHoraria;
	
	public Ciudadano(String nombre, String apellido, long telefono, String direccion, Date franjaHoraria) {
		this.nombre = nombre;
		Apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.franjaHoraria = franjaHoraria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFranjaHoraria() {
		return franjaHoraria;
	}

	public void setFranjaHoraria(Date franjaHoraria) {
		this.franjaHoraria = franjaHoraria;
	}

	
	
}
