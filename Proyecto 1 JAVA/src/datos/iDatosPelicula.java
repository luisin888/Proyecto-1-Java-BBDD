package datos;

import java.sql.SQLException;

import dao.DAOException;
import modelo.Pelicula;

public interface iDatosPelicula extends AutoCloseable {

	
	public void addPelicula(Pelicula p) throws SQLException;
	
	public int  encontrarPelicula(int id)throws DAOException;
	
	public void eliminarPelicula(int id)throws DAOException;
	
	public void modificarPelicula(Pelicula p)throws DAOException;
	
	public void listado();
	
}
