package datos;

import java.sql.SQLException;

import dao.DAOException;
import modelo.Usuario;

/**
 * @autor David
 * Nombre de la clase: iDatosUsuario
 * Descripcion: Clase DatosUsuario donde hacemos los métodos para
 * 				añadir usuario, modificar usuarios, eliminar usuarios y listar usuarios
 * Fecha: 11/06/2019
 * 
 * @version v1.0
 */

public interface iDatosUsuario {
	
	public void addUsuario(Usuario u) throws SQLException;
	public void addUsuario() throws SQLException;

	public Usuario encontrarUsuario(int id) throws DAOException;

	public void eliminarUsuario(int id) throws DAOException;
	public void eliminarUsuario() throws DAOException;

	public void modificarUsuario(Usuario u) throws DAOException;
	public void modificarUsuario() throws DAOException;

	public void listadoUsuario() throws SQLException;

}
