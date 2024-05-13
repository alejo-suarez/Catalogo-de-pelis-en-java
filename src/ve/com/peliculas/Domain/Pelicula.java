package ve.com.peliculas.Domain;

public class Pelicula {
    private String nombre;

//Constructor Vacio:
    public Pelicula(){
    }
    
    //Constructor vacio para inicalizar:
    public Pelicula(String nombre){
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
        return this.nombre;
    }
    
}
