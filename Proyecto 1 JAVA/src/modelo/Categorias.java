package modelo;

public enum Categorias {
	POLICIACA(1),
	ROMANTICA(2),
	AVENTURA(3),
	COMEDIA(4),
	ANIMACION(5),
	THRILLER(6);
	//private int prueba;
	private final int categorias;
	
	//Constructor
	private Categorias(int categorias) {
		this.categorias = categorias;
		}
	
	public int getCategorias() {
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
