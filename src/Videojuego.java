
public class Videojuego {
		
	//Constantes
	private final int HORASEST = 10;
	private final boolean ENTREGADO = false;
	
	//Atributos
	private String titulo;
	private int horasEst;
	private boolean entregado;
	private String genero;
	private String compa�ia;

	//Constructores
	//Constructor por defecto
	public Videojuego() {
		
		this.titulo="";
		this.horasEst=HORASEST;
		this.entregado=ENTREGADO;
		this.genero="";
		this.compa�ia="";
		
	}
	
	//Constructor con dos valores
	public Videojuego(String titulo, int horasEst) {
		
		this.titulo = titulo;
		this.horasEst = horasEst;
		this.entregado=ENTREGADO;
		this.genero="";
		this.compa�ia="";
		
	}
	
	
	//Constructor completo
	public Videojuego(String titulo, int horasEst, boolean entregado, String genero, String compa�ia) {
		this.titulo = titulo;
		this.horasEst = horasEst;
		this.entregado = entregado;
		this.genero = genero;
		this.compa�ia = compa�ia;
	}
	
	
	//To String
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEst=" + horasEst + ", entregado=" + entregado + ", genero="
				+ genero + ", compa�ia=" + compa�ia + "]";
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

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}
		
}
