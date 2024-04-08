package domain;

public class Peliculas {
    private String nombreArchivo;

//Constructor Vacio:
    public Peliculas(){
    }
    
    //Constructor para inicalizar:
    public Peliculas(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombre() {
        return nombreArchivo;
    }

    public void setNombre(String nombre) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "nombre=" + nombreArchivo + '}';
    }
    
}
