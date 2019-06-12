package servicios;

import java.sql.SQLException;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import servicios.iServiciosUsuario;
import dao.DAOException;
import datos.DatosUsuario;
import modelo.Usuario;

/**
 * 
 * @author Andrea Nombre de clase: ConexionDB Descripcion: Conexi�n con base de
 *         datos Fecha: 10/06/2019
 * @version: v1.0
 *
 */

public class ServiciosUsuario implements iServiciosUsuario {

	private DatosUsuario datos = new DatosUsuario();

	public void addUsuario(Usuario u) throws SQLException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Añadiendo usuario...");
		datos.addUsuario(u);
	}

	public void addUsuario() throws SQLException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Añadiendo usuario(sobrecarga)...");
		datos.addUsuario();
	}

	public void listadoUsuario() throws SQLException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Listando usuarios...");
		datos.listadoUsuario();
	}

	public void eliminarUsuario(int id) throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Eliminando usuario...");
		datos.eliminarUsuario(id);
	}

	public void eliminarUsuario() throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Eliminando usuario(sobrecarga)...");
		datos.eliminarUsuario();
	}

	public void modificarUsuario(int id) throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Modificando usuario...");
		datos.modificarUsuario(id);
	}

	public void modificarUsuario() throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Modificando usuario (sobrecarga)...");
		datos.modificarUsuario();
	}
}
