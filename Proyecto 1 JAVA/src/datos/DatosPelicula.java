package datos;

/**
 * @autor Raul
 * Nombre de la clase: DatosPelicula
 * Descripcion: Clase DatosPelicula donde hacemos los métodos para
 * 				añadir pelicula, modificar peliculas, eliminar peliculas y listar peliculas
 * Fecha: 11/06/2019
 * 
 * @version v1.0
 */

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.Statement;
//import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dao.ConexionDB;
import dao.DAOException;
import modelo.Pelicula;

public class DatosPelicula implements iDatosPelicula {

	// private List<Pelicula> peliculas = new ArrayList<>();

	private Connection con = new ConexionDB().getConnection();

	public void addPelicula(Pelicula p) throws SQLException {
		final Logger logger = LogManager.getLogger("Mensaje");
		try (Statement stmt = con.createStatement()) {
			System.out.println("eeEEEEE");
			String query = "INSERT INTO peliculas(nombrepeli,anno,categoria) VALUES ('" + p.getNombre() + "'," + "'" + p.getAnioEstreno() + "',"
					+ "'" + p.getCategoria() + "')";
			System.out.println(query);
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error adding films");
			}
		} catch (DAOException e) {

		}
	}

	public void addPelicula() throws SQLException {

	}

	public Pelicula encontrarPelicula(int id) throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM peliculas WHERE ID=" + id;
			ResultSet rs = stmt.executeQuery(query);
			if (!rs.next()) {
				return null;
			}
			return (new Pelicula(rs.getString("nombrepeli"), rs.getInt("anno"), rs.getInt("categoria")));
		} catch (SQLException se) {
			throw new DAOException("Error finding film in DAO", se);
		}
	}

	public void eliminarPelicula(int id) throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		Pelicula p = encontrarPelicula(id);
		if (p == null) {
			throw new DAOException("Film id: " + id + " does not exist to delete.");
		}
		try (Statement stmt = con.createStatement()) {
			String query = "DELETE FROM peliculas WHERE ID=" + id;
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error deleting film");
			}
		} catch (SQLException se) {
			throw new DAOException("Error deleting film in DAO", se);
		}
	}

	public void eliminarPelicula() throws DAOException {

	}

	public void modificarPelicula(Pelicula p) throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		try (Statement stmt = con.createStatement()) {
			String query = "UPDATE peliculas" + "SET nombrepeli='" + p.getNombre() + "'," + "SET anno"
					+ p.getAnioEstreno() + "'," + "SET categoria" + p.getCategoria();
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error updating film");
			}
		} catch (SQLException se) {
			throw new DAOException("Error updating film in DAO", se);
		}

	}

	public void modificarPelicula() throws DAOException {

	}

	public void listado() throws SQLException {
		final Logger logger = LogManager.getLogger("Mensaje");
		Statement stmt = con.createStatement();
		String query = "select id_pelicula, nombrepeli, anno, categoria from peliculas";
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			System.out.print(rs.getInt("id_pelicula") + ", " + rs.getString("nombrepeli") + ", " + rs.getInt("anno")
					+ ", " + rs.getString("categoria") + "\n");
		}
	}

}
