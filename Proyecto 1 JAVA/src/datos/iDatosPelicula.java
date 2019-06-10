package datos;

import modelo.Pelicula;

public interface iDatosPelicula {

	
	public void addPelicula(Pelicula p);
	public void addPelicula();
	
	public int encontrarPelicula(Pelicula p);
	
	public void eliminarPelicula();
	public void eliminarPelicula(Pelicula p);
	
	public void modificarPelicula();
	public void modificarPelicula(Pelicula p);
	
}
