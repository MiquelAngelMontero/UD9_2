
public class Videojuego {
		
	//Constantes
	private final int HORASEST = 10;
	private final boolean ENTREGADO = false;
	
	//Atributos
	private String titulo;
	private int horasEst;
	private boolean entregado;
	private String genero;
	private String compañia;

	//Constructores
	//Constructor por defecto
	public Videojuego() {
		
		this.titulo="";
		this.horasEst=HORASEST;
		this.entregado=ENTREGADO;
		this.genero="";
		this.compañia="";
		
	}
	
	//Constructor con dos valores
	public Videojuego(String titulo, int horasEst) {
		
		this.titulo = titulo;
		this.horasEst = horasEst;
		this.entregado=ENTREGADO;
		this.genero="";
		this.compañia="";
		
	}
	
	
	//Constructor completo
	public Videojuego(String titulo, int horasEst, boolean entregado, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEst = horasEst;
		this.entregado = entregado;
		this.genero = genero;
		this.compañia = compañia;
	}
	
	
	//To String
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEst=" + horasEst + ", entregado=" + entregado + ", genero="
				+ genero + ", compañia=" + compañia + "]";
	}

	
	//Getters & Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEst() {
		return horasEst;
	}

	public void setHorasEst(int horasEst) {
		this.horasEst = horasEst;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
		
}
