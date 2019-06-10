package servicios;

import datos.DatosPelicula;
import datos.iDatosPelicula;
import modelo.Pelicula;

public class ServiciosPelicula implements iServiciosPelicula{
	
	private iDatosPelicula datos = new DatosPelicula();
	
	public void addPelicula(Pelicula p) {
		datos.addPelicula(p);
	}
	
	public void addPelicula() {
		datos.addPelicula();
	}
	
	//Hacer Listar
	
	public void eliminarPelicula(Pelicula p) {
		datos.eliminarPelicula(p);
	}
	
	public void eliminarPelicula() {
		datos.eliminarPelicula();
		
	}
	
	public void modificarPelicula() {
		datos.modificarPelicula();
		
	}
	
	public void modificarPelicula(Pelicula p) {
		datos.modificarPelicula(p);
	}
	
	
}
