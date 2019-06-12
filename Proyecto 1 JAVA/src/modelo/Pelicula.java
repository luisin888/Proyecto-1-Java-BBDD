package modelo;

import utilidades.LeerTeclado;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Andrea Nombre de clase: ConexionDB Descripcion: Conexi�n con base de
 *         datos Fecha: 10/06/2019
 * @version: v1.0
 *
 */

public class Pelicula {
	private String nombre;
	private int anioEstreno;
	private int categoria;

	public Pelicula() {
		super();
		final Logger logger = LogManager.getLogger("Mensaje");
	}

	public Pelicula(String nombre, int anioEstreno, int categoria) {
		final Logger logger = LogManager.getLogger("Mensaje");
		this.nombre = nombre;
		this.anioEstreno = anioEstreno;
		this.categoria = categoria;
	}

	public String getNombre() {
		final Logger logger = LogManager.getLogger("Mensaje");
		return nombre;
	}

	public void setNombre(String nombre) {
		final Logger logger = LogManager.getLogger("Mensaje");
		this.nombre = nombre;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(int anioEstreno) {
		final Logger logger = LogManager.getLogger("Mensaje");
		this.anioEstreno = anioEstreno;
	}

	public int getCategoria() {
		final Logger logger = LogManager.getLogger("Mensaje");
		return categoria;
	}

	public void setCategoria(int categoria) {
		final Logger logger = LogManager.getLogger("Mensaje");
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		final Logger logger = LogManager.getLogger("Mensaje");
		return "Pelicula [nombre=" + nombre + ", anioEstreno=" + anioEstreno + ", categoria=" + categoria + "]";
	}

	public void crearPelicula() {
		final Logger logger = LogManager.getLogger("Mensaje");
		int num = 0;
		this.nombre = LeerTeclado.leerLinea("Introduzca el nombre:");
		this.anioEstreno = LeerTeclado.leerInt("Introduzca el a�o");
		this.categoria = LeerTeclado.leerInt(
				"Categor�a: Policiaca(1) - Romantica(2) - Aventura (3) - Comedia (4) - Animaci�n (5) - Thriller (6)");
	}
}
