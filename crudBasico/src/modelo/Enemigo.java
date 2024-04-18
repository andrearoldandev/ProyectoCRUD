package modelo;
/**
 * @author Andrea Roldán Agüero
 */
import java.util.Scanner;

public class Enemigo extends PersonajeRE{
//ATRIBUTOS
	protected String ataque;
	
	//CONSTRUCTOR
	public Enemigo() {
		super();
		
	}
	
	//GETTERS Y SETTERS
	//GETTER
	public String getAtaque() {
		return this.ataque;
	}
	
	//SETTER
	public void setAtaque(String ataque) {
		this.ataque = ataque;
	}
	
	
	//FUNCIONES HUMANOS 
		//1. NOMBRE
		public void nombrePersonajeEnemigo() {
			//CREAMOS UN VALIDADOR Y UN SCANNER
			Scanner teclado = new Scanner(System.in);
			boolean isValidNombre = false;
			
			do {
				try {
					System.out.println("Inserta el nombre del Personaje Enemigo");
					
					//CREAMOS LA VARIABLE Y LA PASAMOS POR EL SETTER
					String nombrePersonaje = teclado.nextLine();
					String nombrePersonajeTrimeado = nombrePersonaje.trim();
					
					//CONDICIONES
					if(nombrePersonajeTrimeado.isEmpty()) {
						throw new Exception("El nombre está vacío");
					}
					this.setNombrePersonaje(nombrePersonajeTrimeado);
					isValidNombre = true;
				}catch(Exception e) {
					System.out.println("El nombre introducido no es válido");
					teclado.nextLine();
				}
			}while(isValidNombre == false);
		}
		
		//2. VIDA DEL PERSONAJE
		public void vidaPersonajeEnemigo() {
			Scanner teclado = new Scanner(System.in);
			boolean isValidVida = false;
			
			do {
				try {
					System.out.println("Inserta la vida que tendrá el Personaje Enemigo (Entre 0 y 100)");
					
					//CREAMOS LAS VARIABLES Y LAS PASAMOS POR EL SETTER
					int vida = teclado.nextInt();
					teclado.nextLine();
					
					if(vida > 100) {
						throw new Exception("Has superado el límite de vida");
					}else if(vida < 0) {
						throw new Exception("El personaje no puede estar mas muerto de lo que ya está");
					}
					
					this.setVida(vida);
					isValidVida = true;
				}catch(Exception e) {
					System.out.println("Vida introducida no válida");
					teclado.nextLine();
				}
			}while(isValidVida == false);
		}
		
		//3. FUERZA DEL PERSONAJE
		public void fuerzaPersonajeEnemigo() {
			Scanner teclado = new Scanner(System.in);
			boolean isValidFuerza = false;
			
			do {
				try {
					System.out.println("Inserta la fuerza que tendrá el Personaje Enemigo (Entre 0 y 100)");
					
					//CREAMOS LAS VARIABLES Y LAS PASAMOS POR EL SETTER
					int fuerza = teclado.nextInt();
					teclado.nextLine();
					
					if(fuerza > 100) {
						throw new Exception("Has superado el límite de fuerza");
					}else if(fuerza < 0) {
						throw new Exception("El personaje no puede no tener nada de fuerza");
					}
					
					this.setFuerza(fuerza);
					isValidFuerza = true;
				}catch(Exception e) {
					System.out.println("Fuerza introducida no válida");
					teclado.nextLine();
				}
			}while(isValidFuerza == false);
		}
		
		//4. ATAQUE		
		public void ataquePersonaje() {
			//CREAMOS UN VALIDADOR Y UN SCANNER
			Scanner teclado = new Scanner(System.in);
			boolean isValidAtaque = false;
			
			do {
				try {
					System.out.println("Inserta el ataque del Personaje Enemigo");
					
					//CREAMOS LA VARIABLE Y LA PASAMOS POR EL SETTER
					String ataquePersonaje = teclado.nextLine();
					String ataquePersonajeTrimeado = ataquePersonaje.trim();
					
					//CONDICIONES
					if(ataquePersonajeTrimeado.isEmpty()) {
						throw new Exception("El ataque está vacío");
					}
					this.setAtaque(ataquePersonajeTrimeado);
					isValidAtaque = true;
				}catch(Exception e) {
					System.out.println("El ataque introducido no es válido");
					teclado.nextLine();
				}
			}while(isValidAtaque == false);
		}
	
	//METODO TOSTRING
			public String toString() {
				String resultado = "";
				resultado += "########################################################\n";
				resultado += "\n";
				resultado += "Nombre del Personaje: " + this.nombrePersonaje + "\n";
				resultado += "Vida del Personaje: " + this.vida + "\n";
				resultado += "Fuerza del Personaje: " + this.fuerza + "\n";
				resultado += "El Ataque del Personaje es: " + this.ataque + "\n";
				resultado += "\n";
				resultado += "########################################################\n";
				return resultado;
			}
}
