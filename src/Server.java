import java.util.*;

public class Server {
	
	//Actua como bases de datos
	
	private List<Cartonero> cartonerosRegistrados;
	private List<Ciudadano> ciudadanosRegistrados;
	private List<Material> materialesRegistrados;
	private List<Secretaria> secretariasRegistradas;
	
	public Server(List<Cartonero> cartonerosRegistrados, List<Ciudadano> ciudadanosRegistrados,
			List<Material> materialesRegistrados) {
		this.cartonerosRegistrados = new ArrayList<Cartonero>();
		this.ciudadanosRegistrados = new ArrayList<Ciudadano>();
		this.materialesRegistrados = new ArrayList<Material>();
	}
	
	public void registrarCartonero(Cartonero cartonero) {
		if(!cartonerosRegistrados.contains(cartonero))
			cartonerosRegistrados.add(cartonero);
	}
	
	public void registrarCiudadano(Ciudadano ciudadano) {
		if (!ciudadanosRegistrados.contains(ciudadano))
			ciudadanosRegistrados.add(ciudadano);
	}

	public void registarMateriales(Material material) {
		materialesRegistrados.add(material);
	}
	
	public void registrarSecretaria(Secretaria secretaria) {
		if(!secretariasRegistradas.contains(secretaria))
			secretariasRegistradas.add(secretaria);
	}
}
