package ve.com.peliculas.servicio;

import ve.com.peliculas.Datos.AccesoDatosImpl;
import ve.com.peliculas.Datos.IAccesoDatos;
import ve.com.peliculas.excepciones.AccesoDatosEx;
import ve.com.peliculas.excepciones.LecturaDatosEx;
import ve.com.peliculas.Domain.Pelicula;

public class CatalogoPeliculasImp implements ICatalogoPeliculas {

//Se define un atributo: 
    private final IAccesoDatos datos;

    //Constructor para inicializar variable de datos:
    public CatalogoPeliculasImp() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error en acceso datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            for (var pelicula : peliculas);
            System.out.println("pelicula = " + peliculas);

        } catch (LecturaDatosEx ex) {
            System.out.println("Error en listar datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error en acceso datos");
            ex.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else {
                datos.crear(NOMBRE_RECURSO);
            }

        } catch (AccesoDatosEx ex) {
            System.out.println("Error en iniciar catalogo peliculas");
            ex.printStackTrace(System.out);
        }
    }
}
