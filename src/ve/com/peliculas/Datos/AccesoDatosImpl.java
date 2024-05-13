package ve.com.peliculas.Datos;

import java.io.*;
import java.util.*;
import ve.com.peliculas.excepciones.*;
import ve.com.peliculas.Domain.Pelicula;

public class AccesoDatosImpl implements IAccesoDatos {

//Metodo para busqueda secuencial de pelicula (NombreRecurso):    
    @Override
    public boolean existe(String nombreRecurso) {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }
    
//Metodo para imprimir por pantalla una lista de peliculas:
    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                var pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
                entrada.close();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepción al mostrar peliculas: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepción al mostrar peliculas: " + ex.getMessage());
        }
        return peliculas;
    }

//Metodo para ingresar datos en un .txt:
    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        var archivo = new File(nombreRecurso);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito información al archivo = " + pelicula);

        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepción al escribir peliculas: " + ex.getMessage());
        }
    }

//Metodo para buscar un nombreRecurso en el .txt:
    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        String resultado = null;
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            int indice = 1;
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula" + linea + "Encontrada en el indice= " + indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepción al buscar pelicula: " + ex.getMessage());

        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepción al buscar pelicula: " + ex.getMessage());
        }
        return resultado;

    }

//Metodo para crear archivo en un .txt:
    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File (nombreRecurso);
        try {
            var salida = new PrintWriter (new FileWriter (archivo));
            salida.close();
            System.out.println("Se ha creado el archivo.");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepción al crear archivo: " + ex.getMessage());
        }
    }

//Metodo para borrar datos del .txt:    
    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File(nombreRecurso);
        if (archivo.exists())
            archivo.delete();
        System.out.println("Se ha borrado el archivo");
    }
    

}
