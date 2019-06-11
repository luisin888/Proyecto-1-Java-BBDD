package modelo;

import utilidades.LeerTeclado;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Andrea
 * Nombre de clase: ConexionDB 
 * Descripcion: Conexión con base de datos
 * Fecha: 10/06/2019 
 * @version: v1.0
 *
 */

public class Pelicula {
	private String nombre;
	private int anioEstreno;
	private int categoria;


	public Pelicula() {
		super();
	}


	public Pelicula(String nombre, int anioEstreno, int categoria) {
		this.nombre=nombre;
		this.anioEstreno=anioEstreno;
		this.categoria=categoria;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getAnioEstreno() {
		return anioEstreno;
	}


	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}


	public int getCategoria() {
		return categoria;
	}


	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", anioEstreno=" + anioEstreno + ", categoria=" + categoria + "]";
	}


	public void crearPelicula() {
		int num = 0;
		this.nombre = LeerTeclado.leerLinea("Introduzca el nombre:");
		this.anioEstreno = LeerTeclado.leerInt("Introduzca el año");
		this.categoria= LeerTeclado.leerInt("Categoría: Policiaca(1) - Romantica(2) - Aventura (3) - Comedia (4) - Animación (5) - Thriller (6()");
	}
}
