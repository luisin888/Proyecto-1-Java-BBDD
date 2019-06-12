package dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Raul 
 * Nombre de clase: Menu 
 * Descripcion: Menu 
 * Principal donde elegiremos una opcion 
 * Fecha: 11/06/2019 
 * @author Ra�l Nombre de clase: Menu Descripcion: Menu Principal donde
 *         elegiremos una opcion Fecha: 11/06/2019
 * @version: v1.0
 *
 */

public class DAOException extends Exception {

	private static final long serialVersionUID = 1L;

	public DAOException() {
		super();
		final Logger logger = LogManager.getLogger("Mensaje");
	}

	public DAOException(String message) {
		super(message);
		final Logger logger = LogManager.getLogger("Mensaje");
	}

	public DAOException(Throwable cause) {
		super(cause);
		final Logger logger = LogManager.getLogger("Mensaje");
		// Lllamar a la BBDD
		// Llama a Bob ESponja

	}

	public DAOException(String message, Throwable cause) {
		super(message, cause);
		final Logger logger = LogManager.getLogger("Mensaje");
	}
}