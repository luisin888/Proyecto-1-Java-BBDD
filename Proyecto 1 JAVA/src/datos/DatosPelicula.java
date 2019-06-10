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
	
	public int encontrarPelicula(Pelicula p) {
		int encontrado =-1;
		for(int i=0;i<peliculas.size();i++) {
			Pelicula pelicula = peliculas.get(i);
			System.out.println("--" + pelicula.getNombre());
			if(pelicula.equals(p)) {
				System.out.println("+++ Encontrado!!");
				encontrado = i;
			}
		}
		return encontrado;
	}

	public void eliminarPelicula() {
		System.out.println("--Pido datos del objeto a eliminar");
		String nombre = LeerTeclado.leerLinea("Introduzca el nombre");
		Pelicula pelicula = new Pelicula(nombre);
		this.eliminarPelicula(pelicula);
	}

	public void eliminarPelicula(Pelicula p) {
		int pos = encontrarPelicula(p);
		if(pos==-1) {
			System.out.println("-- No encontrado");
		}else {
			System.out.println("-- Encontrado y eliminado");
			peliculas.remove(pos);
		}
	}
	
}
