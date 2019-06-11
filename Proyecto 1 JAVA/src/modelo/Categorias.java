package modelo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Andrea
 * Nombre de clase: ConexionDB 
 * Descripcion: Conexión con base de datos
 * Fecha: 10/06/2019 
 * @version: v1.0
 *
 */

public enum Categorias {
	POLICIACA(1), ROMANTICA(2), AVENTURA(3), COMEDIA(4), ANIMACION(5), THRILLER(6);
	// private int prueba;
	private final int categorias;

	// Constructor
	private Categorias(int categorias) {
		final Logger logger = LogManager.getLogger("Mensaje");
		this.categorias = categorias;
	}

	public int getCategorias() {
		final Logger logger = LogManager.getLogger("Mensaje");
		return categorias;
	}

	public static  Categorias parseCategoria(int num) {
        if(num==1) {
        	return Categorias.POLICIACA;
        }else if(num==2) {
        	return Categorias.ROMANTICA;
        }else if(num==3) {
        	return Categorias.AVENTURA;
        }else if(num==4) {
        	return Categorias.ANIMACION;
        }else if(num==5) {
        	return Categorias.COMEDIA;
        }else if(num==6) {
        	return Categorias.THRILLER;
        }
        return Categorias.AVENTURA;
    }
}
