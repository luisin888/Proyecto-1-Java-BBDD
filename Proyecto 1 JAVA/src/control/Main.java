package control;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import datos.DatosPelicula;
//import datos.DatosUsuario;
//import modelo.Pelicula;
import control.MovieFlixx;
import dao.DAOException;

/**
 * 
 * @author Luis Nombre de clase: LeerTeclado Descripcion: metodo Main con el que
 *         se inicia el programa Fecha: 11/06/2019
 * @version: v1.0
 *
 */
public class Main {
	final Logger logger = LogManager.getLogger("Mensaje");

	public static void main(String[] args) throws SQLException, DAOException {
		MovieFlixx movie = new MovieFlixx();
		movie.seleccionarOpcion();
	}
}
