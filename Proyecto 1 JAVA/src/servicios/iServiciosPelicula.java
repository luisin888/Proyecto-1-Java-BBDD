package servicios;
//hola
import java.sql.SQLException;

import dao.DAOException;
import modelo.Pelicula;

/**
 * 
 * @author Ra�l
 * Nombre de clase: ConexionDB 
 * Descripcion: Conexi�n con base de datos
 * Fecha: 10/06/2019 
 * @version: v1.0
 *
 */

public interface iServiciosPelicula {
	public void addPelicula(Pelicula p) throws SQLException;

	public void addPelicula() throws SQLException;


	public void eliminarPelicula(int id) throws DAOException;

	public void eliminarPelicula() throws DAOException;

	public void modificarPelicula(Pelicula p) throws DAOException;

	public void modificarPelicula() throws DAOException;

	public void listado();
	public void modificarPelicula(Pelicula p)throws DAOException;
	public void modificarPelicula()throws DAOException;
	
	public void listado() throws SQLException;

}
