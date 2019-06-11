package servicios;

import java.sql.SQLException;

import dao.DAOException;
import modelo.Pelicula;

public interface iServiciosPelicula {
	public void addPelicula(Pelicula p) throws SQLException;

	public void eliminarPelicula(int id)throws DAOException;

	public void modificarPelicula(Pelicula p)throws DAOException;
	
	public void listado();
}
