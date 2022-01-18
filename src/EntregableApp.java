
public class EntregableApp {

	public static void main(String[] args) {
		
		//Creamos 2 arrays, una de series y una de videojuegos
		Serie[] aS = new Serie[5];
		Videojuego[] aV = new Videojuego[5];
		
		//Llenamos la array
		Serie s1 = new Serie();
		Serie s2 = new Serie("Titulo1", "Juan");
		Serie s3 = new Serie("Titulo2", "Javi");
		Serie s4 = new Serie("Titulo3", 6, "Aventura", "Andres");
		Serie s5 = new Serie("Titulo4", 10, "Accion", "Francisco");
		
		aS[0] = s1;
		aS[1] = s2;
		aS[2] = s3;
		aS[3] = s4;
		aS[4] = s5;
		
		Videojuego v1 = new Videojuego();
		Videojuego v2 = new Videojuego("Titulo1", 3);
		Videojuego v3 = new Videojuego("Titulo2", 20);
		Videojuego v4 = new Videojuego("Titulo3", 400, true, "MMO", "Compañia1");
		Videojuego v5 = new Videojuego("Titulo4", 70, false, "Mundo abierto", "Compañia2");
		
		aV[0] = v1;
		aV[1] = v2;
		aV[2] = v3;
		aV[3] = v4;
		aV[4] = v5;
		
		//Comprovamos la función "Entregar"
		System.out.println("Antes de entregar");
		System.out.println(v1.isEntregado()); 
		System.out.println(v3.isEntregado());
		System.out.println(s2.isEntregado());
		System.out.println(v4.isEntregado());
		
		v1.entregar();
		v3.entregar();
		s2.entregar();
		s4.entregar();
		
		System.out.println("\nDespues de entregar");
		System.out.println(v1.isEntregado()); 
		System.out.println(v3.isEntregado());
		System.out.println(s2.isEntregado());
		System.out.println(v4.isEntregado());
		
		//Comprovamos la funcion "Devolver"
		System.out.println("\nAntes de devolver");
		System.out.println(v1.isEntregado()); 
		System.out.println(v2.isEntregado());
		System.out.println(v3.isEntregado());
		System.out.println(v4.isEntregado());
		System.out.println(v5.isEntregado());
		System.out.println(s1.isEntregado()); 
		System.out.println(s2.isEntregado());
		System.out.println(s3.isEntregado());
		System.out.println(s4.isEntregado());
		System.out.println(s5.isEntregado());
		
		v1.devolver();
		v2.devolver();
		v3.devolver();
		v4.devolver();
		v5.devolver();
		s1.devolver();
		s2.devolver();
		s3.devolver();
		s4.devolver();
		s5.devolver();
		
		System.out.println("\nDespués de devolver");
		System.out.println(v1.isEntregado()); 
		System.out.println(v2.isEntregado());
		System.out.println(v3.isEntregado());
		System.out.println(v4.isEntregado());
		System.out.println(v5.isEntregado());
		System.out.println(s1.isEntregado()); 
		System.out.println(s2.isEntregado());
		System.out.println(s3.isEntregado());
		System.out.println(s4.isEntregado());
		System.out.println(s5.isEntregado());
		
		//Imprimimos la serie y el videojuego más largo
		obtenerSerieMax(aS);
		obtenerVJMax(aV);
		
	}
	
	public static void obtenerSerieMax(Serie[] a) {
		
		Serie max = new Serie("", 0, "", "");
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i].getTemporadas()>max.getTemporadas()) {
				max = a[i];
			}
			
		}
		
		System.out.println("La serie con más temporadas és: "+max.toString());
		
	}
	
	public static void obtenerVJMax(Videojuego[] a) {
		
		Videojuego max = new Videojuego("", 0, false, "", "");
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i].getHorasEst()>max.getHorasEst()) {
				max = a[i];
			}
			
		}
		
		System.out.println("El videojuego con más horas estimadas és: "+max.toString());
		
	}
	
}
