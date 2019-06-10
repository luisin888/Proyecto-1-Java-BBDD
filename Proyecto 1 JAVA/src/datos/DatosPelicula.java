package datos;


import java.util.ArrayList;
import java.util.List;

import modelo.Pelicula;
import utilidades.LeerTeclado;

public class DatosPelicula implements iDatosPelicula{

	private List<Pelicula> peliculas = new ArrayList<>();
	
	
	public void addPelicula(Pelicula p) {
		peliculas.add(p);
	}

	public void addPelicula() {
		 Pelicula p = new Pelicula();
	        p.crearPelicula();
	        addPelicula(p);
	}

	public void eliminarPelicula() {
		System.out.println("--Pido datos del objeto a eliminar");
		String nombre = LeerTeclado.leerLinea("Introduzca el nombre");
		Pelicula pelicula = new Pelicula(nombre);
		this.eliminarPelicula(pelicula);
	}
	
	
}
