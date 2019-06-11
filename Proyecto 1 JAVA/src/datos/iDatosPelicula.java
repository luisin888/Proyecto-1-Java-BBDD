package datos;

import java.sql.SQLException;

import dao.DAOException;
import modelo.Pelicula;

public interface iDatosPelicula {

	
	public void addPelicula(Pelicula p) throws SQLException;
	
	public Pelicula  encontrarPelicula(int id)throws DAOException;
	
	public void eliminarPelicula(int id)throws DAOException;
	
	public void modificarPelicula(Pelicula p)throws DAOException;
	
	public void listado();
	
}
