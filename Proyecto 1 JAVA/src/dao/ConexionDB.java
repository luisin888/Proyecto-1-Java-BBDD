package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Raúl 
 * Nombre de clase: ConexionDB 
 * Descripcion: Conexión con base de datos
 * Fecha: 10/06/2019 
 * @version: v1.0
 *
 */

public class ConexionDB {
	// BBDD
	final Logger logger = LogManager.getLogger("Mensaje");
	Connection connection = null;
	String BD = "peliculas";
	String driverClassName = "com.mysql.jdbc.Driver";
	String driverUrl = "jdbc:mysql://10.90.36.117:3306/" + BD;
	String user = "grupo1";
	String password = "root";

	public ConexionDB() {
		final Logger logger = LogManager.getLogger("Mensaje");
		try {
			Class.forName(driverClassName);
			connection = DriverManager.getConnection(driverUrl, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("No se encuentra el driver");
		} catch (SQLException E) {
			System.out.println("Excepcion SQL: " + E.getMessage());
			System.out.println("Estado SQL: " + E.getSQLState());
			System.out.println("CÃ³digo del Error: " + E.getErrorCode());
		} catch (Exception E) {
			System.out.println("Otro problema: " + E);
		}
	}

	public Connection getConnection() {
		final Logger logger = LogManager.getLogger("Mensaje");
		return connection;
	}

	public void desconectar() {
		final Logger logger = LogManager.getLogger("Mensaje");
		try {
			connection.close();
			connection = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
