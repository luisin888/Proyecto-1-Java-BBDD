package servicios;

import java.sql.SQLException;

import dao.DAOException;
import datos.DatosPelicula;
import datos.iDatosPelicula;
import servicios.iServiciosPelicula;
import modelo.Pelicula;

public class ServiciosPelicula implements iServiciosPelicula{
	
	private iDatosPelicula datos = new DatosPelicula();
	
	public void addPelicula(Pelicula p) throws SQLException {
		datos.addPelicula(p);
	}
	public void addPelicula() throws SQLException {
		datos.addPelicula();
	}
	
	public void listado(){
		datos.listado();
	}
	
	public void eliminarPelicula(int  id)throws DAOException  {
		datos.eliminarPelicula(id);
	}
	public void eliminarPelicula()throws DAOException  {
		datos.eliminarPelicula();
	}
	public void modificarPelicula(Pelicula p)throws DAOException  {
		datos.modificarPelicula(p);
	}
	public void modificarPelicula()throws DAOException  {
		datos.modificarPelicula();
	}
	
}
