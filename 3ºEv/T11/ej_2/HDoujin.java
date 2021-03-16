package ej_2;

public class HDoujin {
	
	private int codigo;
	private String Titulo;
	private int year;
	
	public HDoujin(int codigo, String titulo, int year) {
		
		this.codigo = codigo;
		Titulo = titulo;
		this.year = year;
		
	}
	
	public int getCodigo() {
		
		return codigo;
		
	}
	
	public void setCodigo(int codigo) {
		
		this.codigo = codigo;
		
	}
	
	public String getTitulo() {
		
		return Titulo;
		
	}
	
	public void setTitulo(String titulo) {
		
		Titulo = titulo;
		
	}
	
	public int getYear() {
		
		return year;
		
	}
	
	public void setYear(int year) {
		
		this.year = year;
		
	}

	public String toString() {
		
		return "HDoujin [codigo=" + codigo + ", Titulo=" + Titulo + ", year=" + year + " ";
		
	}

}
