package modelo;

import java.util.Date;

import utilidades.LeerTeclado;

public class Usuario {
	
		private String nombreCompleto;
		private Date fechaNacimiento;
		private String ciudad;
		
		 public Usuario () {
			 super();
		    }
		    
		    public Usuario (String nombreCompleto){
		    	this.nombreCompleto = nombreCompleto;
		    }

		    public Usuario(String nombreCompleto, String ciudad, Date fechaNacimiento) {
		    	this.nombreCompleto = nombreCompleto;
		        this.ciudad = ciudad;
		        this.fechaNacimiento = fechaNacimiento;
		    }

			public String getNombreCompleto() {
				return nombreCompleto;
			}

			public void setNombreCompleto(String nombreCompleto) {
				this.nombreCompleto = nombreCompleto;
			}

			public Date getFechaNacimiento() {
				return fechaNacimiento;
			}

			public void setFechaNacimiento(Date fechaNacimiento) {
				this.fechaNacimiento = fechaNacimiento;
			}

			public String getCiudad() {
				return ciudad;
			}

			public void setCiudad(String ciudad) {
				this.ciudad = ciudad;
			}

			@Override
			public String toString() {
				return "Usuario [nombreCompleto=" + nombreCompleto + ", fechaNacimiento=" + fechaNacimiento
						+ ", ciudad=" + ciudad + "]";
			}
		    		
}
	