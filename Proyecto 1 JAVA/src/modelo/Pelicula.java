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
<<<<<<< HEAD
	private Categorias categoria;
	// private int prueba;

=======
	private int categoria;
	//private int prueba;
	
>>>>>>> branch 'master' of https://github.com/luisin888/Proyecto-1-Java-BBDD.git
	public Pelicula() {
		super();
		final Logger logger = LogManager.getLogger("Mensaje");
	}
<<<<<<< HEAD

	public Pelicula(String nombre) {
		final Logger logger = LogManager.getLogger("Mensaje");
=======
	public Pelicula(String nombre,int anioEstreno,int categoria) {
		this.nombre=nombre;
		this.anioEstreno=anioEstreno;
		this.categoria=categoria;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
>>>>>>> branch 'master' of https://github.com/luisin888/Proyecto-1-Java-BBDD.git
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
<<<<<<< HEAD

	public Categorias getCategoria() {
		final Logger logger = LogManager.getLogger("Mensaje");
=======
	public int getCategoria() {
>>>>>>> branch 'master' of https://github.com/luisin888/Proyecto-1-Java-BBDD.git
		return categoria;
	}
<<<<<<< HEAD

	public void setCategoria(Categorias categoria) {
		final Logger logger = LogManager.getLogger("Mensaje");
=======
	public void setCategoria(int categoria) {
>>>>>>> branch 'master' of https://github.com/luisin888/Proyecto-1-Java-BBDD.git
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
<<<<<<< HEAD
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
=======
        this.anioEstreno = LeerTeclado.leerInt("Introduzca el año");
        this.categoria =LeerTeclado.leerInt("Categoría: Policiaca(1) - Romantica(2) - Aventura (3) - Comedia (4) - Animación (5) - Thriller (6()");  
    }
>>>>>>> branch 'master' of https://github.com/luisin888/Proyecto-1-Java-BBDD.git


}
