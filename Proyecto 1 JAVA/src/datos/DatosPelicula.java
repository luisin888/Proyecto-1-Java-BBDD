package datos;


import modelo.Pelicula;

public class DatosPelicula implements iDatosPelicula{

	public void addPelicula(Pelicula p) {
	
	}

	public void addPelicula() {
		 Pelicula p = new Pelicula();
	        p.crearPelicula();
	        addPelicula(p);
	}

	
	
}
