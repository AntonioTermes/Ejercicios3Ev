package ej_2;

public class Libro extends HDoujin implements Prestable {
	
	private boolean prestado;

	public Libro(int codigo, String titulo, int year) {
	
		super(codigo, titulo, year);
		this.prestado = false;
		
	}

	public String toString() {
		
		return super.toString() + " prestado=" + prestado + "]";
		
	}

	public void prestar() {
	
		if(!this.prestado) {
			
			this.prestado = true;
			
		} else {
			
			System.out.println("El libro no se puede prestar.");
			
		}
		
	}

	public void devolver() {
		
		if(this.prestado) {
			
			this.prestado = false;
			
		} else {
			
			System.out.println("Este libro no está prestado");
			
		}
	
	}

	public boolean prestado() {
	
		if(this.prestado) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}

}
