
public class Serie implements Entregable {
	private final boolean ENTREGADO = false;
	private final int TEMPORADAS = 3;
	
	//Atributos
	private String titulo;
	private int temporadas = TEMPORADAS;
	private boolean entregado = ENTREGADO;
	private String genero;
	private String creador;

	
	//Constructores
	//Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.temporadas = TEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = "";
	}

	//Constructor con titulo y creador
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = TEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = creador;
	}

	//Constructor completo
	public Serie(String titulo, int temporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = ENTREGADO;
		this.genero = genero;
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [ENTREGADO=" + ENTREGADO + ", TEMPORADAS=" + TEMPORADAS + ", titulo=" + titulo + ", temporadas="
				+ temporadas + ", entregado=" + entregado + ", genero=" + genero + ", creador=" + creador + "]";
	}
	
	
	//Getters & Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	//Metodos de Entregable
	@Override
	public void entregar() {
		entregado=true;
		
	}

	@Override
	public void devolver() {
		entregado=false;
		
	}

	@Override
	public boolean isEntregado() {
		if (entregado) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public int compara(Object a) {
		Serie vjpar = (Serie) a;
		int diferencia = vjpar.temporadas - temporadas;
		if (diferencia >= 0) {
			return diferencia;
		}else {
			return Math.abs(diferencia);
		}
	}
	
	
}
