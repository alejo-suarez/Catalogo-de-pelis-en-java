package domain;

public class Peliculas {
	private String nombre;

    //Constructor Vacio:
	public Peliculas() {
	}

	// Constructor para inicalizar:
	public Peliculas(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Peliculas{" + "nombre=" + nombre + '}';
	}

}
