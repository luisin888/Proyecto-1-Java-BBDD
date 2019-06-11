package servicios;

import modelo.Pelicula;

public interface iServiciosPelicula {
	public void addPelicula(Pelicula p);
	public void addPelicula();
	
	public void eliminarPelicula();
	public void eliminarPelicula(Pelicula e);
	
	public void modificarPelicula();
	public void modificarPelicula(Pelicula e);
	
	public void listado();
}
