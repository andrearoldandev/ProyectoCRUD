package modelo;

public abstract class PersonajeRE {
	protected String nombrePersonaje;
	protected int vida;
	protected int fuerza;
	
	//CONSTRUCTOR
	public PersonajeRE() {
		
	}
	
	//GETTERS Y SETTERS
	//GETTERS
	public String getNombrePersonaje() {
		return this.nombrePersonaje;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public int getFuerza() {
		return this.fuerza;
	}
	
	//SETTERS
	public void setNombrePersonaje(String nombrePersonaje) {
		this.nombrePersonaje = nombrePersonaje;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	
	
}


