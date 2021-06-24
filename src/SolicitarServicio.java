
public class SolicitarServicio {

	private Categoria categoria;
	private char franjaHoraria;
	private Imagen imagen;
	
	public SolicitarServicio(char volumen, char franjaHoraria) {
		this.categoria = categoria;
		this.franjaHoraria = franjaHoraria;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public char getFranjaHoraria() {
		return franjaHoraria;
	}
	
	public void aceptaServicio(Ciudadano ciudadano, CentroAcopio centroAcopio) {
		if(ciudadano.verificaRadio(centroAcopio) == true)
			System.out.println("El pedido fue registrado");
		System.out.println("Debe llevarlo usted mismo");
	}
	
}
