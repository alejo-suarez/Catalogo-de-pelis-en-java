package calculoExcepcion;

import excepciones.OperacionExcepcion;

public class CalculoExcepcion {
    public static String Excepcion(String datos) throws OperacionExcepcion{
        if (datos.isEmpty()){
            throw new OperacionExcepcion("Error: Nombre de pelicula vacio");
        }
    
        return datos;
    }
}
