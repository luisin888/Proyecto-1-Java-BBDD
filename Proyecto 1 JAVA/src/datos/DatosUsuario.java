package datos;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dao.ConexionDB;
import dao.DAOException;
import modelo.Pelicula;
import modelo.Usuario;

public class DatosUsuario implements iDatosUsuario {

	private Connection con = new ConexionDB().getConnection();
	
	public void addUsuario(Usuario u) throws SQLException {
		try(Statement stmt = con.createStatement()){
			String query = "INSERT INTO usuarios VALUES ('" + u.getNombreCompleto() +"',"
					+ "'" + u.getFechaNacimiento() + "'," + "'" + u.getCiudad()+"')";
			System.out.println(query);
			if(stmt.executeUpdate(query)!=1) {
				throw new DAOException("Error adding films");
			}
		}catch(DAOException e ) {
			 
		}
	}
	
	public void addUsuario() throws SQLException {

	}
	public Usuario encontrarUsuario(int id) throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM usuario WHERE ID=" + id;
			ResultSet rs = stmt.executeQuery(query);
			if (!rs.next()) {
				return null;
			}
			return (new Usuario(rs.getString("nombrecompleto"), rs.getDate("fecha_nac"),
					rs.getString("ciudad_residencia")));
		} catch (SQLException se) {
			throw new DAOException("Error finding film in DAO", se);
		}
	}
	
	public void eliminarUsuario(int id) throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		Usuario u = encontrarUsuario(id);
		if (u == null) {
			throw new DAOException("usuario id: " + id + " does not exist to delete.");
		}
		try (Statement stmt = con.createStatement()) {
			String query = "DELETE FROM usuario WHERE ID=" + id;
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error deleting usuario");
			}
		} catch (SQLException se) {
			throw new DAOException("Error deleting film in DAO", se);
		}
	}
	
	
	
	
}
