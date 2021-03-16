package ej_1;

public class Pelicula extends Multimedia {
	
	private String ActorPrincipal;
	private String ActrizPrincipal;
	
	public Pelicula(String titulo, String autor, String formato, double duracion, String actorPrincipal, String actrizPrincipal) throws Exception {
		
		super(titulo, autor, formato, duracion);
		ActorPrincipal = actorPrincipal;
		ActrizPrincipal = actrizPrincipal;
		
		if (actorPrincipal == null && actrizPrincipal == null) {
			
			throw new Exception("DobleNullException");
			
		}
		
	}

	public String getActorPrincipal() {
		
		return ActorPrincipal;
		
	}

	public void setActorPrincipal(String actorPrincipal) {
		
		ActorPrincipal = actorPrincipal;
		
	}

	public String getActrizPrincipal() {
		
		return ActrizPrincipal;
		
	}

	public void setActrizPrincipal(String actrizPrincipal) {
		
		ActrizPrincipal = actrizPrincipal;
		
	}

	public String toString() {
		
		return super.toString() + "ActorPrincipal=" + ActorPrincipal + ", ActrizPrincipal=" + ActrizPrincipal;
		
	}

	
	
}