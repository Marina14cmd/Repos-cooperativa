package TPEspecial;

import TPEspecial.filtros.Filtro;

import java.util.ArrayList;
import java.util.Objects;

public class EstacionTrabajo {

    private String nombre;
    private ArrayList<Comida> aceptadas;
    private Filtro especialidad;

    public EstacionTrabajo (String nombre, Filtro filtro) {
        this.nombre=nombre;
        this.especialidad = filtro;
        this.aceptadas = new ArrayList<Comida>();
    }

    public void devolverAceptadas () {
        for (int i =0; i<aceptadas.size();i++) {
            aceptadas.get(i).toString();
        }
    }

    public boolean aceptarComida(Comida comida) {
        boolean retorno=true;

        if (especialidad == null)
            aceptadas.add(comida);
        else if (!especialidad.cumple(comida))
            retorno=false;
        else
            aceptadas.add(comida);
        return retorno;
    }

    public ArrayList<Comida> getComidas () {
        ArrayList<Comida> retorno = new ArrayList<Comida>();
        Comida comida = null;
        for (int i=0; i <aceptadas.size();i++) {
            comida = aceptadas.get(i);
            retorno.add(comida);
        }
        return retorno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EstacionTrabajo)) return false;
        EstacionTrabajo that = (EstacionTrabajo) o;
        return Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getEspecialidad(), that.getEspecialidad());
    }

    public Filtro getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Filtro especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarComida(Comida c) {
        this.aceptadas.add(c);
    }

    public void eliminarComida(Comida c) {
        this.aceptadas.remove(c);
    }
}
