package modelo;

public enum Categorias {
	POLICIACA(1),
	ROMANTICA(2),
	AVENTURA(3),
	COMEDIA(4),
	ANIMACION(5),
	THRILLER(6);
	
	private final int categorias;
	
	//Constructor
	private Categorias(int categorias) {
		this.categorias = categorias;
		}
	
	public int getCategorias() {
		return categorias;
	}

}
