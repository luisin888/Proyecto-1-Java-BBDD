package servicios;

import java.sql.SQLException;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import dao.DAOException;
import datos.DatosPelicula;
import servicios.iServiciosPelicula;
import modelo.Pelicula;

/**
 * 
 * @author Raul Nombre de clase: ConexionDB Descripcion: Conexi�n con base de
 *         datos Fecha: 10/06/2019
 * @version: v1.0
 *
 */

public class ServiciosPelicula implements iServiciosPelicula {

	private DatosPelicula datos = new DatosPelicula();

	public void addPelicula(Pelicula p) throws SQLException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Añadiendo pelicula...");
		datos.addPelicula(p);
	}

	public void addPelicula() throws SQLException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Añadiendo pelicula(sobrecarga)...");
		datos.addPelicula();
	}

	public void listado() throws SQLException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Listando peliculas...");
		datos.listado();
	}

	public void eliminarPelicula(int id) throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Eliminando pelicula...");
		datos.eliminarPelicula(id);
	}

	public void eliminarPelicula() throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Eliminando pelicula(sobrecarga)...");
		datos.eliminarPelicula();
	}

	public void modificarPelicula(int id) throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Modificando pelicula...");
		datos.modificarPelicula(id);
	}

	public void modificarPelicula() throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Modificando pelicula(sobrecarga)...");
		datos.modificarPelicula();
	}

}
