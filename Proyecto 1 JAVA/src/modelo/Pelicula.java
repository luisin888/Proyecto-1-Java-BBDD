package modelo;

import java.util.Date;

import utilidades.LeerTeclado;

public class Pelicula {
	private String nombre;
	private int anioEstreno;
	private Categorias categoria;
	//private int prueba;
	
	public Pelicula() {
		super();
	}
	public Pelicula(String nombre) {
		this.nombre=nombre;
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
        int num=0;
		this.nombre = LeerTeclado.leerLinea("Introduzca el nombre:");
        this.anioEstreno = LeerTeclado.leerInt("Introduzca el año");
        num=LeerTeclado.leerInt("Categoría: Policiaca(1) - Romantica(2) - Aventura (3) - Comedia (4) - Animación (5) - Thriller (6()");
        if(num==1) {
        	this.categoria=categoria.POLICIACA;
        }else if(num==2) {
        	this.categoria=categoria.ROMANTICA;
        }else if(num==3) {
        	this.categoria=categoria.AVENTURA;
        }else if(num==4) {
        	this.categoria=categoria.ANIMACION;
        }else if(num==5) {
        	this.categoria=categoria.COMEDIA;
        }else if(num==6) {
        	this.categoria=categoria.THRILLER;
        }
        this.categoria = categoria.getCategorias();
    }

}
