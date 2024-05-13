package ve.com.peliculas.Datos;

import java.util.List;
import ve.com.peliculas.excepciones.*;
import ve.com.peliculas.Domain.Pelicula;

public interface IAccesoDatos {

//Se implementa el metodo existe para definir la clase existe:
    boolean existe(String nombreRecurso) throws AccesoDatosEx;

// Se implementa el metodo listar para definir la clase listar:
    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

//Se implementa el metodo escribir para definir la clase Escribir:
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

//Se define el metodo buscar para definir la clase Escribir:
    String buscar(String nombreRecurso, String buscar); //throws LecturaDatosEx;

    //Se define el metodo crear para definir la clase Crear:
    void crear(String nombreRecurso);// throws AccesoDatosEx;

    //Se define el metodo crear para definir la clase Crear:
    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
