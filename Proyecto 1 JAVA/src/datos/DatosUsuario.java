package datos;

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.Statement;

import java.sql.ResultSet;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dao.ConexionDB;
import dao.DAOException;

import modelo.Usuario;
import utilidades.LeerTeclado;

public class DatosUsuario implements iDatosUsuario {

	private Connection con = new ConexionDB().getConnection();
	
	public void addUsuario(Usuario u) throws SQLException {
		try(Statement stmt = con.createStatement()){
			String query = "INSERT INTO usuarios(nombrecompleto,fecha_nac,ciudad_residencia) VALUES ('" + u.getNombreCompleto() +"',"
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
		Usuario u = new Usuario();
		try (Statement stmt = con.createStatement()) {
			String query = "SELECT * FROM usuarios WHERE id_usuario=" + id;
			ResultSet rs = stmt.executeQuery(query);
			if (rs.next()) {
				u=new Usuario(rs.getString("nombrecompleto"), rs.getString("fecha_nac"),
						rs.getString("ciudad_residencia"));
			}
			
		} catch (SQLException se) {
			throw new DAOException("Error finding film in DAO", se);
		}
		return u;
	}
	
	public void eliminarUsuario(int id) throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		Usuario u = encontrarUsuario(id);
		if (u == null) {
			throw new DAOException("usuario id: " + id + " does not exist to delete.");
		}
		try (Statement stmt = con.createStatement()) {
			String query = "DELETE FROM usuarios WHERE id_usuario=" + id;
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error deleting usuario");
			}
		} catch (SQLException se) {
			throw new DAOException("Error deleting film in DAO", se);
		}
	}
	
	public void eliminarUsuario() throws DAOException {
		int id = LeerTeclado.leerInt("Dime la Id de Usuario a Eliminar: ");
				eliminarUsuario(id);
	}
	
	public void modificarUsuario(int id) throws DAOException {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Modificando usuario en base de datos...");
		Usuario u = encontrarUsuario(id);
		u.setNombreCompleto(LeerTeclado.leerLinea("Dame el nombre"));
		u.setFechaNacimiento(LeerTeclado.leerLinea("Dame la Fecha"));
		u.setCiudad(LeerTeclado.leerLinea("Dame la ciudad"));
		try (Statement stmt = con.createStatement()) {
			logger.log(Level.INFO,u.getNombreCompleto());
			String query = "UPDATE usuarios SET nombrecompleto= '" + u.getNombreCompleto() + "'," + "fecha_nac= '"
					+ u.getFechaNacimiento() + "', ciudad_residencia= '" + u.getCiudad()+ "'" + " WHERE id_usuario=" + id;
			if (stmt.executeUpdate(query) != 1) {
				throw new DAOException("Error updating usuario");
			}
		} catch (SQLException se) {
			logger.log(Level.INFO,"catch");
			throw new DAOException("Error updating usuario in DAO", se);
		}

	}
	
	public void modificarUsuario() throws DAOException {
		int id = LeerTeclado.leerInt("Dime la Id de Usuario a Modificar: ");
		modificarUsuario(id);
	}
	
	public void listadoUsuario() throws SQLException {
		final Logger logger = LogManager.getLogger("Mensaje");
		Statement stmt = con.createStatement();
		String query = "select * from usuarios";
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			System.out.print(rs.getInt("id_usuario") + ", " + rs.getString("nombrecompleto") + ", " + rs.getDate("fecha_nac")
					+ ", " + rs.getString("ciudad_residencia") + "\n");
		}
	}
	
	
}
