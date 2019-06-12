package utilidades;

import java.util.Scanner;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Luis Nombre de clase: LeerTeclado Descripcion: Metodos para leer toda
 *         clase de datos por Teclado Fecha: 11/06/2019
 * @version: v1.0
 *
 */

public class LeerTeclado {

	public static String leerLinea() {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		return new Scanner(System.in).nextLine();
	}

	public static String leerLinea(String mensaje) {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		System.out.println(mensaje);
		return leerLinea();
	}

	public static int leerInt() {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		return new Scanner(System.in).nextInt();
	}

	public static int leerInt(String mensaje) {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		System.out.println(mensaje);
		return leerInt();
	}

	public static short leerShort() {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		return new Scanner(System.in).nextShort();
	}

	public static short leerShort(String mensaje) {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		System.out.println(mensaje);
		return leerShort();
	}

	public static float leerFloat() {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		return new Scanner(System.in).nextFloat();
	}

	public static float leerFloat(String mensaje) {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		System.out.println(mensaje);
		return leerFloat();
	}

	public static long leerLong() {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		return new Scanner(System.in).nextLong();
	}

	public static long leerLong(String mensaje) {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		System.out.println(mensaje);
		return new Scanner(System.in).nextLong();
	}

	public static double leerDouble() {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		return new Scanner(System.in).nextDouble();
	}

	public static double leerDouble(String mensaje) {
		final Logger logger = LogManager.getLogger("Mensaje");
		System.out.println(mensaje);
		return new Scanner(System.in).nextDouble();
	}

	public static byte leerByte() {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		return new Scanner(System.in).nextByte();
	}

	public static byte leerByte(String mensaje) {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		System.out.println(mensaje);
		return new Scanner(System.in).nextByte();
	}

	public static String leerPalabra() {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		return new Scanner(System.in).next();
	}

	public static String leerPalabra(String mensaje) {
		final Logger logger = LogManager.getLogger("Mensaje");
		logger.log(Level.INFO,"Se va a leer un dato");
		System.out.println(mensaje);
		return new Scanner(System.in).next();
	}

}
