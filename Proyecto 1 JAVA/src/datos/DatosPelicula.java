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
import dao.DAOException;
import modelo.Categorias;
import modelo.Pelicula;
import utilidades.LeerTeclado;

public class DatosPelicula implements iDatosPelicula{

	//private List<Pelicula> peliculas = new ArrayList<>();
	
    private Connection con = null;

    DatosPelicula() {

        con = new ConexionDB().getConnection();
    }
	
	public void addPelicula(Pelicula p) throws SQLException {
		try(Statement stmt = con.createStatement()){
			String query = "INSERT INTO PELICULAS VALUES (" + p.getNombre() +","
					+ "'" + p.getAnioEstreno() + "'," + "'" + p.getCategoria();
			if(stmt.executeUpdate(query)!=1) {
				throw new DAOException("Error adding films");
			}
		}catch(SQLException se ) {
			 throw new DAOException("Error adding film in DAO", se);
		}
	}
	
	public Pelicula encontrarPelicula(int id)throws DAOException {
		try(Statement stmt = con.createStatement()){
			String query = "SELECT * FROM PELICULAS WHERE ID="+ id;
			ResultSet rs = stmt.executeQuery(query);
			if(!rs.next()) {
				return null;
			}
			int valor = rs.getInt("categoria");
			Categorias cat = Categorias.parseCategoria(valor);
			return (new Pelicula(rs.getString("nombrepeli"), rs.getInt("anno"),
					cat));
		}catch(SQLException se) {
			throw new DAOException("Error finding film in DAO", se);
		}
	}
						

	public void eliminarPelicula(int id)throws DAOException {
		Pelicula p = encontrarPelicula(id);
		if(p==null) {
			throw new DAOException("Film id: " + id + " does not exist to delete.");
		}
		try(Statement stmt = con.createStatement()){
			String query = "DELETE FROM PELICULAS WHERE ID=" + id;
			if(stmt.executeUpdate(query)!=1) {
				throw new DAOException("Error deleting film");
			}
		}catch(SQLException se) {
			throw new DAOException("Error deleting film in DAO", se);
		}
	}
	
	public void modificarPelicula(Pelicula p)throws DAOException {
		try(Statement stmt = con.createStatement()){
			String query = "UPDATE PELICULAS"
					+ "SET nombrepeli='" + p.getNombre() + "',"
					+ "SET anno" + p.getAnioEstreno() + "',"
					+ "SET categoria" + p.getCategoria();
			if(stmt.executeUpdate(query)!=1) {
				 throw new DAOException("Error updating film");
			}
		}catch(SQLException se) {
			throw new DAOException("Error updating film in DAO", se);
		}
        
	}
	
	public void listado() {

	}
}
