package gui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Luis 
 * Nombre de clase: Menu 
 * Descripcion: Menu 
 * Principal donde elegiremos una opcion 
 * Fecha: 11/06/2019 
 * @version: v1.0
 *
 */

public class Menu {

	public static void mostrarMenu() {
		final Logger logger = LogManager.getLogger("Mensaje");
		System.out.println(" ");
		System.out.println(" BIENVENIDO A MOVIEFLIX");
		System.out.println(" ");
		System.out.println("************************************************");
		System.out.println("*  *** Escoge una opcion: ***");
		System.out.println("*    1.-Dar de Alta un Usuario");
		System.out.println("*    2.-Modificar Usuario");
		System.out.println("*    3.-Dar de Baja a un Usuario");
		System.out.println("*    4.-Listar TODOS los Usuarios");
		System.out.println("*    5.-Añadir Pelicula Nueva");
		System.out.println("*    6.-Listar TODAS las Peliculas");
		System.out.println("*    7.-Listar Peliculas Por Categoria");
		System.out.println("*    8.-Listar Peliculas Mas Vistas");
		System.out.println("*    9.-Listar Peliculas Mejor Valoradas");
		System.out.println("*    10.-Listar Peliculas Vistas Por el Usuario");
		System.out.println("*    11.-Borrar una Pelicula");
		System.out.println("*    12.-Modificar una Pelicula");

		System.out.println();
		System.out.println("*    0.-CERRAR PROGRAMA");
		System.out.println("************************************************");
		System.out.println(" ");

	}
}
