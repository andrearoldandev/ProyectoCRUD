package modelo;
/**
 * @author Andrea Roldán Agüero
 */
	import java.util.ListIterator;
import java.util.Scanner;
public class Humano extends PersonajeRE{
//ATRIBUTOS
	protected String arma;
	protected String sexo;
	
	//CONSTRUCTOR
	public Humano() {
		super();
	}
	
	
	//GETTERS Y SETTERS
	//GETTERS
	public String getArma() {
		return this.arma;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	//SETTERS
	public void setArma(String arma) {
		this.arma = arma;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//FUNCIONES CREAR HUMANOS 
	//1. NOMBRE
	public void nombrePersonaje() {
		//CREAMOS UN VALIDADOR Y UN SCANNER
		Scanner teclado = new Scanner(System.in);
		boolean isValidNombre = false;
		
		do {
			try {
				System.out.println("Inserta el nombre del Personaje Humano");
				
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
	public void vidaPersonaje() {
		Scanner teclado = new Scanner(System.in);
		boolean isValidVida = false;
		
		do {
			try {
				System.out.println("Inserta la vida que tendrá el Personaje Humano (Entre 0 y 100)");
				
				//CREAMOS LAS VARIABLES Y LAS PASAMOS POR EL SETTER
				int vida = teclado.nextInt();
				teclado.nextLine();
				
				if(vida > 100) {
					throw new Exception("Has superado el límite de vida");
				}else if(vida < 0) {
					throw new Exception("El personaje no puede estar muerto");
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
	public void fuerzaPersonaje() {
		Scanner teclado = new Scanner(System.in);
		boolean isValidFuerza = false;
		
		do {
			try {
				System.out.println("Inserta la fuerza que tendrá el Personaje Humano (Entre 0 y 100)");
				
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
	
	//4. ARMA DEL PERSONAJE
	public void armaPersonaje() {
		Scanner teclado = new Scanner(System.in);
		boolean isValidArma = false;
		
		do {
			try {
				System.out.println("Inserta el arma del Personaje");
				
				//CREAMOS LAS VARIABLES
				String armaPersonaje = teclado.nextLine();
				String armaPersonajeTrimeado = armaPersonaje.trim();
				
				//CONDICIONES
				if(armaPersonajeTrimeado.isEmpty()) {
					throw new Exception("Tienes que introducir un arma, aunque sean unos puños");
				}
				this.setArma(armaPersonajeTrimeado);
				isValidArma = true;
			}catch(Exception e) {
				System.out.println("Error, Arma introducida no válida");
				teclado.nextLine();
			}
		}while(isValidArma == false);
	}
	
	//4. SEXO DEL PERSONAJE
		public void sexoPersonaje() {
			Scanner teclado = new Scanner(System.in);
			boolean isValidSexo = false;
			
			do {
				try {
					System.out.println("Inserta el sexo del Personaje");
					
					//CREAMOS LAS VARIABLES
					String sexoPersonaje = teclado.nextLine();
					String sexoPersonajeTrimeado = sexoPersonaje.trim();
					
					//CONDICIONES
					if(sexoPersonajeTrimeado.isEmpty()) {
						throw new Exception("Tienes que introducir uno de los dos sexos");
					}
					this.setSexo(sexoPersonajeTrimeado);
					isValidSexo = true;
				}catch(Exception e) {
					System.out.println("Error, Sexo introducida no válido");
					teclado.nextLine();
				}
			}while(isValidSexo == false);
		}
	
		
	
	//METODO TOSTRING
		public String toString() {
			String resultado = "";
			resultado += "########################################################\n";
			resultado += "\n";
			resultado += "Nombre del Personaje: " + this.nombrePersonaje + "\n";
			resultado += "Vida del Personaje: " + this.vida + "\n";
			resultado += "Fuerza del Personaje: " + this.fuerza + "\n";
			resultado += "El Arma del Personaje es: " + this.arma + "\n";
			resultado += "El Sexo del Personaje es: " + this.sexo + "\n";
			resultado += "\n";
			resultado += "########################################################\n";
			return resultado;
		}
		
}
