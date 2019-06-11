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

public class DatosPelicula implements iDatosPelicula{

	//private List<Pelicula> peliculas = new ArrayList<>();
	
    private Connection con = new ConexionDB().getConnection();
    
	
	public void addPelicula(Pelicula p) throws SQLException {
		try(Statement stmt = con.createStatement()){
			String query = "INSERT INTO peliculas VALUES ('" + p.getNombre() +"',"
					+ "'" + p.getAnioEstreno() + "'," + "'" + p.getCategoria()+"')";
			System.out.println(query);
			if(stmt.executeUpdate(query)!=1) {
				throw new DAOException("Error adding films");
			}
		}catch(DAOException e ) {
			 
		}
	}
	
	public void addPelicula()throws SQLException {
		
	}
	
	public Pelicula encontrarPelicula(int id)throws DAOException {
		try(Statement stmt = con.createStatement()){
			String query = "SELECT * FROM peliculas WHERE ID="+ id;
			ResultSet rs = stmt.executeQuery(query);
			if(!rs.next()) {
				return null;
			}
			return (new Pelicula(rs.getString("nombrepeli"), rs.getInt("anno"),
					rs.getInt("categoria")));
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
			String query = "DELETE FROM peliculas WHERE ID=" + id;
			if(stmt.executeUpdate(query)!=1) {
				throw new DAOException("Error deleting film");
			}
		}catch(SQLException se) {
			throw new DAOException("Error deleting film in DAO", se);
		}
	}
	
	public void eliminarPelicula()throws DAOException {
		
	}
	
	public void modificarPelicula(Pelicula p)throws DAOException {
		try(Statement stmt = con.createStatement()){
			String query = "UPDATE peliculas"
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
	
	public void modificarPelicula()throws DAOException {
		
	}
	
	public void listado() throws SQLException {
		Statement stmt = con.createStatement();
			String query = "select nombrepeli, anno, categoria from peliculas";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.print(rs.getString("nombrepeli"));
				System.out.print(rs.getInt("anno"));
				System.out.print(rs.getString("categoria"));
			}
	}

}
