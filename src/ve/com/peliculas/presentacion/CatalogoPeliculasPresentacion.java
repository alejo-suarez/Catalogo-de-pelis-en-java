package ve.com.peliculas.presentacion;

import java.util.Scanner;
import ve.com.peliculas.servicio.*;

public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImp();

        while (opcion != 0) {
            System.out.println("Escriba la opcion:  \n"
                    + "1. Inicial Catalogo de peliculas:  \n"
                    + "2. Agregar Pelicula: \n"
                    + "3. Listar Pelicula: \n"
                    + "4. Buscar Pelicula: \n"
                    + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                break;
                
                case 2:
                    System.out.println("Escriba nombre Pelicula: ");
                    var nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                break;
               
                case 3:
                    catalogo.listarPeliculas();
                break;
                
                case 4:
                    System.out.println("Diga el nombre de la pelicula a buscar:  ");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                break;
                
                case 0:
                    System.out.println("Hasta pronto...");
                    break;
                        
                default:
                    System.out.println("Debe ingresar la opción del 1 al 4");
                break;    

            }
        }
    }

}
