package ej_2;

public class Revista extends HDoujin {
	
	private int numero;

	public Revista(int codigo, String titulo, int year, int numero) {
		
		super(codigo, titulo, year);
		this.numero = numero;
		
	}

	public String toString() {
	
		return super.toString() + " numero=" + numero + "]";
	
	}
	
}
