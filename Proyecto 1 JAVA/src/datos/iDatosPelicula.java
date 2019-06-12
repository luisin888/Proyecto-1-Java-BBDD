package datos;

/**
 * @autor Raul
 * Nombre de la clase: DatosPelicula
 * Descripcion: Clase DatosPelicula donde hacemos los métodos para
 * 				añadir pelicula, modificar peliculas, eliminar peliculas y listar peliculas
 * Fecha: 11/06/2019
 * 
 * @version v1.0
 */
import java.sql.SQLException;

import dao.DAOException;
import modelo.Pelicula;

public interface iDatosPelicula {

	public void addPelicula(Pelicula p) throws SQLException;

	public void addPelicula() throws SQLException;

	public Pelicula encontrarPelicula(int id) throws DAOException;

	public void eliminarPelicula(int id) throws DAOException;

	public void eliminarPelicula() throws DAOException;

	public void modificarPelicula(int id) throws DAOException;

	public void modificarPelicula() throws DAOException;

	public void listado() throws SQLException;

}
