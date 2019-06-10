package modelo;

import java.util.Date;

import utilidades.LeerTeclado;

public class Pelicula {
	private String nombre;
	private int anioEstreno;
	private Categorias categoria;
	//private int prueba;
	
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
	public Categorias getCategoria() {
		return categoria;
	}
	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", anioEstreno=" + anioEstreno + ", categoria=" + categoria + "]";
	}
	public void crearPelicula() {
        this.nombre = LeerTeclado.leerLinea("Introduzca el nombre:");
        this.anioEstreno = LeerTeclado.leerInt("Introduzca el año");
    }

}
