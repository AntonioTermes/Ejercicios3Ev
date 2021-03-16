package ej_1;

public class Multimedia {
	
	private String titulo;
	private String Autor;
	private String formato;
	private double duracion;
	
	public Multimedia(String titulo, String autor, String formato, double duracion) {
		
		this.titulo = titulo;
		this.Autor = autor;
		this.formato = formato;
		this.duracion = duracion;
		
	}
	
	public Multimedia() {
		
	}

	public String getTitulo() {
		
		return titulo;
		
	}

	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
		
	}

	public String getAutor() {
		
		return Autor;
		
	}

	public void setAutor(String autor) {
		
		Autor = autor;
		
	}

	public String getFormato() {
		
		return formato;
		
	}

	public void setFormato(String formato) {
		
		this.formato = formato;
		
	}

	public double getDuracion() {
		
		return duracion;
		
	}

	public void setDuracion(double duracion) {
		
		this.duracion = duracion;
		
	}

	public boolean equals(Multimedia m) {
		
		if (this.titulo.equals(m.getTitulo()) && this.Autor.equals(m.getAutor())) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public String toString() {
		
		return "titulo=" + titulo + ", Autor=" + Autor + ", formato=" + formato + ", duracion=" + duracion;
		
	}
	
}
