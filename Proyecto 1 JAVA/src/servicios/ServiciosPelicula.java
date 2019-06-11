package servicios;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dao.DAOException;
import datos.DatosPelicula;
import datos.iDatosPelicula;
import servicios.iServiciosPelicula;
import modelo.Pelicula;

/**
 * 
 * @author Raúl
 * Nombre de clase: ConexionDB 
 * Descripcion: Conexión con base de datos
 * Fecha: 10/06/2019 
 * @version: v1.0
 *
 */

public class ServiciosPelicula implements iServiciosPelicula {

	private iDatosPelicula datos = new DatosPelicula();

	public void addPelicula(Pelicula p) throws SQLException {
		final Logger logger = LogManager.getLogger("Mensaje");
		datos.addPelicula(p);
	}

	public void addPelicula() throws SQLException {
		final Logger logger = LogManager.getLogger("Mensaje");
		datos.addPelicula();
	}

	public void listado() {
		final Logger logger = LogManager.getLogger("Mensaje");
		datos.listado();
	}

	public void eliminarPelicula(int id) throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		datos.eliminarPelicula(id);
	}

	public void eliminarPelicula() throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		datos.eliminarPelicula();
	}

	public void modificarPelicula(Pelicula p) throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		datos.modificarPelicula(p);
	}

	public void modificarPelicula() throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		datos.modificarPelicula();
	}

}
