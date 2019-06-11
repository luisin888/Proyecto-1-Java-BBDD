package control;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Luis Nombre de clase: LeerTeclado Descripcion: metodo Main con el que
 *         se inicia el programa Fecha: 11/06/2019
 * @version: v1.0
 *
 */
public class Main {
	final Logger logger = LogManager.getLogger("Mensaje");

	public static void main(String[] args) {
		MovieFlixx movie = new MovieFlixx();
		movie.seleccionarOpcion();
	}

}
