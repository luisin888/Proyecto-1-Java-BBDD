package servicios;

import java.sql.SQLException;

import dao.DAOException;
import modelo.Usuario;

/**
 * 
 * @author David -Nombre de clase: iServiciosUsuario -Descripcion: Metodos en
 *         clase iServicio -Fecha: 11/06/2019
 * @version: v1.0
 *
 */

public interface iServiciosUsuario {

	public void addUsuario(Usuario u) throws SQLException;

	public void addUsuario() throws SQLException;

	public void eliminarUsuario(int id) throws DAOException;

	public void eliminarUsuario() throws DAOException;

	public void modificarUsuario(int id) throws DAOException;

	public void modificarUsuario() throws DAOException;

	public void listadoUsuario() throws SQLException;
}
