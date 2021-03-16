package ej_1;

public class PruebaListaMultimedia {
	
	public static void main(String[] args) throws Exception {
		
		ListaMultimedia lis = new ListaMultimedia();
		lis.agregar (new Disco ("Si", "Positividad", "mp3", 63.21, "Pop"));
		lis.agregar (new Disco ("No", "Negatividad", "Avg", 21.39, "Astolfo"));
		lis.agregar (new Disco ("Patata", "Patata", "mp3", 69.42, "Rock"));
		lis.agregar (new Pelicula("a", "a", "avg", 72.20, "AAAAAAAAAA", null));
		lis.agregar (new Pelicula("b", "c", "mp4", 60, "O", null));
		lis.agregar (new Pelicula("Es", "De", "mp4", 89.01, "TU", "TU TAMBIEN"));
		
		System.out.println(lis);
		System.out.println(lis.sumarTiempo());
		System.out.println(lis.contarGen("Rock"));
		System.out.println(lis.noActriz());
		
	}

}
