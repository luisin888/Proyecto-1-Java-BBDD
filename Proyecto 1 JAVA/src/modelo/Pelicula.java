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
	private Categorias categoria;
	// private int prueba;

	public Pelicula() {
		super();
		final Logger logger = LogManager.getLogger("Mensaje");
	}

	public Pelicula(String nombre) {
		final Logger logger = LogManager.getLogger("Mensaje");
		this.nombre = nombre;
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

	public Categorias getCategoria() {
		final Logger logger = LogManager.getLogger("Mensaje");
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
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
		this.anioEstreno = LeerTeclado.leerInt("Introduzca el año");
		num = LeerTeclado.leerInt(
				"Categoría: Policiaca(1) - Romantica(2) - Aventura (3) - Comedia (4) - Animación (5) - Thriller (6()");
		if (num == 1) {
			this.categoria = categoria.POLICIACA;
		} else if (num == 2) {
			this.categoria = categoria.ROMANTICA;
		} else if (num == 3) {
			this.categoria = categoria.AVENTURA;
		} else if (num == 4) {
			this.categoria = categoria.ANIMACION;
		} else if (num == 5) {
			this.categoria = categoria.COMEDIA;
		} else if (num == 6) {
			this.categoria = categoria.THRILLER;
		}
	}

}
