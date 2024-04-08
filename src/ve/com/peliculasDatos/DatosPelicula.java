package ve.com.peliculasDatos;

import java.io.*;

public class DatosPelicula {
    
//Metodo para crear nombres de peliculas:
    public static void crearDatos(String nombreArchivo) throws FileNotFoundException {
        var datos = new File(nombreArchivo);
        PrintWriter salida = new PrintWriter(datos);
        salida.close();
        System.out.println("se ha creado el registro de la pelicula");
    }

//Metodo para ingresar datos al archivo:
    public static void escribirDatos(String nombreArchivo, String contenido) throws FileNotFoundException {
        var datos = new File(nombreArchivo);
        PrintWriter salida = new PrintWriter(datos);
        salida.println(contenido);
        salida.close();
        System.out.println("Se ha escrito en el registro de la Pelicula");
    }

//Metodo para que no sobreescriba los datos ya ingresados:
    public static void anexarDatos(String nombreArchivo, String contenido) throws FileNotFoundException, IOException {
        var datos = new File(nombreArchivo);
        PrintWriter salida = new PrintWriter(new FileWriter(datos, true));
        salida.println(contenido);
        salida.close();
        System.out.println("Se ha agregado otro registro de la Pelicula");
    }

//Metodo para leer todos los nombres de las peliculas en el archivo:
    public static void leerDatos(String nombreArchivo) throws FileNotFoundException, IOException {
        var datos = new File(nombreArchivo);
        var entrada = new BufferedReader(new FileReader(datos));
        var lectura = entrada.readLine();
        while (lectura != null) {
            System.out.println("lectura = " + lectura);
            lectura = entrada.readLine();
        }
        entrada.close();
    }
    
//Metodo para eliminar nombres de peliculas en el archivo:
    public static void eliminarDatos(String nombreArchivo) {
        var datos = new File(nombreArchivo);
        boolean status = datos.delete();
        if (!status) {
            System.out.println("No se pudo eliminar el nombre.");
        } else {
            System.out.println("Se ha eliminado el nombre de la pelicula");
        }
    }
        
//Metodo para buscar nombres de peliculas en el archivo:

    public static void buscarDatos(String nombreArchivo) {
      if (nombreArchivo.isEmpty()){
          System.out.println("No hay datos que buscar... " );
        }else {
          System.out.println("/n escriba la pelicula a buscar: ");
         // nombreArchivo = new leer.next();
      }  
        
    }
}

