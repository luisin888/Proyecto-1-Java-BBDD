package control;

import dao.DAOException;
import java.sql.SQLException;
import servicios.iServiciosPelicula;
import servicios.ServiciosPelicula;
import servicios.ServiciosUsuario;
import modelo.Pelicula;
import datos.DatosPelicula;
import modelo.Usuario;
import datos.DatosUsuario;
import gui.Menu;
import utilidades.LeerTeclado;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Luis Nombre de clase: LeerTeclado Descripcion: Metodos para
 *         seleccionar opciones del men� Fecha: 11/06/2019
 * @version: v1.0
 *
 */

public class MovieFlixx {
	Usuario u = new Usuario();
	Pelicula p = new Pelicula();
	DatosUsuario du = new DatosUsuario();
	DatosPelicula d = new DatosPelicula();
	iServiciosPelicula servicios = new ServiciosPelicula();

	public MovieFlixx() {

		super();
		final Logger logger = LogManager.getLogger("Mensaje");
	}

	public void seleccionarOpcion() throws SQLException, DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		Menu m = new Menu();
		m.mostrarMenu();
		LeerTeclado leer = new LeerTeclado();

		int opc = leer.leerInt();

		while (opc >= 1 && opc <= 12) {
			switch (opc) {

			case 1:
				// AltaUsuariooo
				System.out.println("caso 1");
				
				u.crearUsuario();
				try {
					du.addUsuario(u);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 2:
				// ModificarUsuario
				System.out.println("caso 2");
				break;

			case 3:
				// DarDeBajaUsuario
				System.out.println("caso 3");
				break;

			case 4:
				// ListarUsuarios
				System.out.println("caso 4");
				
				break;
			case 5:
				// CrearPeliculasNuevas
				System.out.println("caso 5");
				p.crearPelicula();
				try {
					d.addPelicula(p);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//servicios.addPelicula(p);
				break;
			case 6:
				// ListarPeliculas
				System.out.println("caso 6");
				servicios.listado();
				break;
			case 7:
				// ListarPeliculasPorCategoria
				System.out.println("caso 7");
				break;
			case 8:
				// ListarPeliculasMasVistas
				System.out.println("caso 8");
				break;
			case 9:
				// ListasPeliculasMejorValoradas
				System.out.println("caso 9");
				break;
			case 10:
				// ListarPeliculasVistasPorElUsuario
				System.out.println("caso 10");
				break;
			case 11:
				// BorrarPeliculasss
				System.out.println("caso 11");
				servicios.eliminarPelicula();
				break;
			case 12:
				// ModificarPeliculas
				System.out.println("caso 12");
				servicios.modificarPelicula();
				break;
			default:
				break;
			}
			m.mostrarMenu();
			opc = leer.leerInt();

		}
		System.out.println("************* FIN DEL PROGRAMA *************");
	}

	public int leerOpcion() {
		final Logger logger = LogManager.getLogger("Mensaje");
		LeerTeclado leer = new LeerTeclado();
		int opc = leer.leerInt();
		return opc;

	}

}
