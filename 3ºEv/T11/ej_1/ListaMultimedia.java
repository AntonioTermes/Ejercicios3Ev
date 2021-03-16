package ej_1;

import java.util.ArrayList;

public class ListaMultimedia {

	private ArrayList<Multimedia> lista;

	public ListaMultimedia() {
		
		this.lista = new ArrayList<Multimedia>();
		
	}
	
	public void agregar(Multimedia m) {
		
		lista.add(m);
		
	}
	
	public int tam() {
		
		return lista.size();
		
	}
	
	public Multimedia getpos(int a) {
		
		return lista.get(a);
		
	}
	
	public double sumarTiempo() {
		
		double sumador = 0;
		for (int i = 0; i < lista.size(); i++) {
			
			sumador += lista.get(i).getDuracion();
			
		}
		
		return sumador;
		
	}
	
	public int contarGen(String t) {
		
		int contador = 0;
		
		for (int i = 0; i < lista.size(); i++) {
		
			if(lista.get(i) instanceof Disco){
				
				Disco disk = (Disco)lista.get(i);
				
					if(disk.getGenero().equals(t)){
					contador++;
					
				}
			
			}
			
		}
		
		return contador;
		
	}
	
	public int noActriz() {
		
		int Oklahomie = 0;
		
		for (int i = 0; i < lista.size(); i++) {
			
			if(lista.get(i) instanceof Pelicula) {
				
				Pelicula StLouis = (Pelicula)lista.get(i);
				
				if(StLouis.getActrizPrincipal() == null) {
					
					Oklahomie++;
					
				}
				
			}
			
		}
		
		return Oklahomie;
		
	}

	public String toString() {
		
		return "lista =" + lista;
		
	}
	
}
