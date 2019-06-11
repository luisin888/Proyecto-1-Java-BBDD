package datos;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dao.ConexionDB;
import modelo.Pelicula;
import utilidades.LeerTeclado;

public class DatosPelicula implements iDatosPelicula{

	//private List<Pelicula> peliculas = new ArrayList<>();

	private List<Pelicula> peliculas = new ArrayList<>();
	private static final Logger logger = LogManager.getLogger("Servicios");

	
    private Connection con = null;

    DatosPelicula() {

        con = new ConexionDB().getConnection();
    }
	
	public void addPelicula(Pelicula p) {
		try(Statement stmt = con.createStatement()){
			String query = "INSERT INTO PELICULAS VALUES (" + p.getNombre() +","
			+
		}
	}

	//public void addPelicula() {
		 //Pelicula p = new Pelicula();
	        //p.crearPelicula();
	        //addPelicula(p);
	//}
	
	@SuppressWarnings("null")
	public int encontrarPelicula(Pelicula p) {
	try {
	
	int encontrado =-1;
		for(int i=0;i<peliculas.size();i++) {
			Pelicula pelicula = peliculas.get(i);
			System.out.println("--" + pelicula.getNombre());
			if(pelicula.equals(p)) {
				System.out.println("+++ Encontrado!!");
				encontrado = i;
			}
		}
		return encontrado; } catch (Exception e) {
		
			logger.info("la película NO se ha dado de alta ");
			System.out.println("No se ha podido realizar el alta de la película");
						
		}
	
	return (Integer) null;
	 
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
	public void modificarPelicula() {
		System.out.println("-- Pido datos del objeto a modificar");
        String nombre = LeerTeclado.leerLinea("Introduzca el nombre:");
        Pelicula pelicula = new Pelicula(nombre);
        
        int pos = encontrarPelicula(pelicula);
        if (pos == -1) {
            //no encontrado
            System.out.println("-- No encontrado");
        } else {
            //encontrado
            System.out.println("-- encontrado");
             this.modificarPelicula(peliculas.get(pos));
        }
        
	}
	
	public void modificarPelicula(Pelicula p) {
		System.out.println("--Modificacion de datos");
		int seleccion = LeerTeclado.leerInt("¿Que dato desea modificar (1)nombre, (2)Año");
		if(seleccion==1) {
			p.setNombre(LeerTeclado.leerLinea("Introduzca el nuevo nombre"));
		}else if(seleccion ==2) {
			p.setAnioEstreno(LeerTeclado.leerInt("Indique el nuevo año"));
		}
	}
	
	public void listado() {
		StringBuilder sb = new StringBuilder();
		for(Pelicula p : peliculas) {
			sb.append(p.toString()+"\n");
		}
		System.out.println(sb.toString());
	}
	
}
