package control;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import datos.DatosPelicula;
import datos.DatosUsuario;
import modelo.Pelicula;

/**
 * 
 * @author Luis Nombre de clase: LeerTeclado Descripcion: metodo Main con el que
 *         se inicia el programa Fecha: 11/06/2019
 * @version: v1.0
 *
 */
public class Main {
	final Logger logger = LogManager.getLogger("Mensaje");

	public static void main(String[] args) {
		//MovieFlixx movie = new MovieFlixx();
		//movie.seleccionarOpcion();
		
		Pelicula p = new Pelicula();
		p.crearPelicula();
		DatosPelicula d = new DatosPelicula();
		try {
			d.addPelicula(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
