package testExcepcion;

import static calculoExcepcion.CalculoExcepcion.Excepcion;
import excepciones.OperacionExcepcion;

public class TestExcepcion {

	public static void main(String[] args) {
		String datos = "";
		try {
			datos = Excepcion(datos);
		} catch (OperacionExcepcion e) {
			System.out.println("Error en acceso de datos...");
			e.printStackTrace(System.out);
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Error en Escritura de datos...");

			//modificacion enrique 
			//Solo para el mensaje de error
			System.out.println(e.getMessage());

		} finally {
			System.out.println("Falta pelicula por cargar");
		}

		System.out.println("Datos " + datos);
	}

}
