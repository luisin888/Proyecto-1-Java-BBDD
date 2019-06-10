package control;
import utilidades.LeerTeclado;
public class MovieFlixx {
	
	
	
	public int getLeerOpcion() {
		return leerOpcion;
	}
	public void setLeerOpcion(int leerOpcion) {
		this.leerOpcion = leerOpcion;
	}
	public int leerOpcion(){
		LeerTeclado leer=new LeerTeclado();
		int opc=leer.leerInt();
		return opc;
		}
}
