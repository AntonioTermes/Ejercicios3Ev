package ej_2;

import java.util.ArrayList;

public class ListaDoujins {
	
	private ArrayList <HDoujin> lista;

	public ListaDoujins() {

		this.lista = new ArrayList<HDoujin>();
		
	}
	
	public void agregar(HDoujin metamorphosis) {
		
		lista.add(metamorphosis);
		
	}

	public int cuentaPrestados() {
		
		int contador = 0;
		
		for (int i = 0; i < lista.size(); i++) {
			
			if(((Libro) lista.get(i)).prestado()) {
				
				contador++;
				
			}
			
		}
		
		return contador;
		
	}
	
	public int publicacionesAnterioresA(int a) {
		
		int contador = 0;
		
		for (int i = 0; i < lista.size(); i++) {
			
			if (lista.get(i).getYear() < a) {
				
				contador++;
				
			}
			
		}
		
		return contador;
		
	}

	public String toString() {
		
		return "ListaDoujins [lista=" + lista + "]";
		
	}
	
}
