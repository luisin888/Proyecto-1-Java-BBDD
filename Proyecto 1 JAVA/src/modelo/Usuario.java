package modelo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utilidades.LeerTeclado;

/**
 * 
 * @author Andrea Nombre de clase: ConexionDB Descripcion: Conexi�n con base de
 *         datos Fecha: 10/06/2019
 * @version: v1.0
 *
 */

public class Usuario {

	private String nombreCompleto;
	private String fechaNacimiento;
	private String ciudad;

	public Usuario() {
		super();
		final Logger logger = LogManager.getLogger("Mensaje");
	}

	public Usuario(String nombreCompleto) {
		final Logger logger = LogManager.getLogger("Mensaje");
		this.nombreCompleto = nombreCompleto;
	}

	public Usuario(String nombreCompleto, String fechaNacimiento, String ciudad) {
		final Logger logger = LogManager.getLogger("Mensaje");
		this.nombreCompleto = nombreCompleto;
		this.ciudad = ciudad;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombreCompleto() {
		final Logger logger = LogManager.getLogger("Mensaje");
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		final Logger logger = LogManager.getLogger("Mensaje");
		this.nombreCompleto = nombreCompleto;
	}

	public String getFechaNacimiento() {
		final Logger logger = LogManager.getLogger("Mensaje");
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		final Logger logger = LogManager.getLogger("Mensaje");
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCiudad() {
		final Logger logger = LogManager.getLogger("Mensaje");
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		final Logger logger = LogManager.getLogger("Mensaje");
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		final Logger logger = LogManager.getLogger("Mensaje");
		return "Usuario [nombreCompleto=" + nombreCompleto + ", fechaNacimiento=" + fechaNacimiento + ", ciudad="
				+ ciudad + "]";
	}

	public void crearUsuario() {
		final Logger logger = LogManager.getLogger("Mensaje");
		this.nombreCompleto = LeerTeclado.leerLinea("Introduzca el nombre:");
		this.fechaNacimiento = LeerTeclado.leerLinea("Dime Fecha Nacimiento: DD/MM/YYYY");
		this.ciudad = LeerTeclado.leerLinea("Introduce Ciudad Residencia");
	}
}
