package main;
/**
 * @author Andrea Roldán Agüero
 */
	import java.util.Scanner;
	import modelo.Humano;
	import modelo.Enemigo;
	import modelo.PersonajeRE;
	import java.util.ArrayList;
	import java.util.ListIterator;
public class Main {

	public static void main(String[] args) {
		//CREAMOS LAS VARIABLES
		boolean isActive = true;
		int menu;
		int personaje;
		int mostrar;
		int borrar;
		int mostrar1;
		int actualizar;
		Scanner teclado = new Scanner(System.in);
		
		//CREAMOS LOS ARRAY LIST
		ArrayList <Humano> misHumanos = new ArrayList <Humano>();
		ArrayList <Enemigo> misEnemigos = new ArrayList <Enemigo>();
		
		
		//CREAMOS EL MENÚ
		System.out.println("########################################################\n");
		System.out.println("~~~ BIENVENIDO A LA BASE DE DATOS DE RESIDENT EVIL ~~~\n");
		System.out.println("########################################################\n");
		
		do {
			System.out.println("\t- Inserta 0 para SALIR");
			System.out.println("\t- Inserta 1 para AÑADIR un Personaje");
			System.out.println("\t- Inserta 2 para MOSTRAR todos los Personajes");
			System.out.println("\t- Inserta 3 para BORRAR un Personaje");
			System.out.println("\t- Inserta 4 para MOSTRAR solo un Personaje");
			System.out.println("\t- Inserta 5 para ACTUALIZAR un Personaje\n");
			System.out.println("########################################################\n");
			
			try {
				menu = teclado.nextInt();
				teclado.nextLine();
				
				switch(menu) {
				case 0:
					isActive = false;
				break;
				case 1:
					mostrarMensajes(" AÑADIR un Personaje");
					
						personaje = teclado.nextInt();
						teclado.nextLine();
						
					switch(personaje) {
						case 1:
							System.out.println("########################################################\n");
							System.out.println("~~~ Vamos a crear un Humano ~~~\n");
							System.out.println("########################################################\n");
							
							//CREAMOS EL OBJETO BASE
							Humano humanoActual = new Humano();
							
							//FUNCION NOMBRE DEL PERSONAJE
							humanoActual.nombrePersonaje();
							
							//FUNCION VIDA DEL PERSONAJE
							humanoActual.vidaPersonaje();
							
							//FUNCION FUERZA DEL PERSONAJE
							humanoActual.fuerzaPersonaje();
							
							//FUNCION ARMA DEL PERSONAJE
							humanoActual.armaPersonaje();
							
							//FUNCION SEXO DEL PERSONAJE
							humanoActual.sexoPersonaje();
							
							//GUARDAMOS LOS DATOS EN EL ARRAY
							misHumanos.add(humanoActual);
							
							//MENSAJE DE DATOS CORRECTOS
							System.out.println("########################################################\n");
							System.out.println("~~~ Tu personaje ha sido añadido correctamente ~~~\n");
							System.out.println("########################################################\n");
						break;
						case 2:
							System.out.println("########################################################\n");
							System.out.println("~~~ Vamos a crear un Enemigo ~~~\n");
							System.out.println("########################################################\n");
							
							//CREAMOS EL OBJETO BASE
							Enemigo enemigoActual = new Enemigo();
							
							//FUNCION NOMBRE PERSONAJE
							enemigoActual.nombrePersonajeEnemigo();
							
							//FUNCION VIDA DEL PERSONAJE
							enemigoActual.vidaPersonajeEnemigo();
							
							//FUNCION FUERZA DEL PERSONAJE
							enemigoActual.fuerzaPersonajeEnemigo();
							
							//FUNCION ATAQUE PERSONAJE
							enemigoActual.ataquePersonaje();
							
							//GUARDAMOS LOS DATOS EN EL ARRAY
							misEnemigos.add(enemigoActual);
							
							//MENSAJE DE DATOS CORRECTOS
							System.out.println("########################################################\n");
							System.out.println("~~~ Tu personaje ha sido añadido correctamente ~~~\n");
							System.out.println("########################################################\n");
						break;
						default:
							System.out.println("########################################################\n");
							System.out.println("Ninguna selección es válida");
							System.out.println("########################################################\n");
						break;
					}
					break;
				case 2:
					//PEDIMOS QUE PERSONAJES QUIERE VER
					mostrarMensajes(" VISUALIZAR todos los Personajes");
					
					mostrar = teclado.nextInt();
					teclado.nextLine();
					
					switch(mostrar) {
						case 1:
							//CREAMOS EL ITERADOR
							ListIterator <Humano> itHumano = misHumanos.listIterator();
							
							//BUCLE
							while(itHumano.hasNext()) {
								Humano humano = itHumano.next();
								
								System.out.println(humano.toString());
							}
						break;
						case 2:
							//CREAMOS EL ITERADOR
							ListIterator <Enemigo> itEnemigo = misEnemigos.listIterator();
							
							//BUCLE
							while(itEnemigo.hasNext()) {
								Enemigo enemigo = itEnemigo.next();
								
								System.out.println(enemigo.toString());
							}
						break;
					}
				break;
				case 3:
					//PREGUNTAMOS AL USUARIO
					mostrarMensajes(" BORRAR un Personaje");
					
					borrar = teclado.nextInt();
					teclado.nextLine();
					
					switch(borrar) {
						case 1:
							System.out.println("########################################################\n");
							System.out.println("~~~ Has elegido BORRAR a un Personaje Humano ~~~\n");
							System.out.println("\t- Vamos a borrar un Personaje Humano");
							System.out.println("\t- Inserta la posición que quieras borrar\n");
							System.out.println("########################################################\n");
							int posicionABorrarHumano = teclado.nextInt();
							teclado.nextLine();
							
							//RECUPERAMOS EL HUMANO CON UN GET
							Humano humanoABorrar = misHumanos.get(posicionABorrarHumano);
							
							//BORRAMOS LA POSICION QUE NOS DICE EL USUARIO
							misHumanos.remove(posicionABorrarHumano);
							
							//DAMOS UN MENSAJE CON EL HUMANO SELECCIONADO
							System.out.println("~~~ Se ha borrado el personaje humano " + humanoABorrar.getNombrePersonaje() + " ~~~");
						break;
						case 2:
							System.out.println("########################################################\n");
							System.out.println("~~~ Has elegido BORRAR un Personaje Enemigo ~~~\n");
							System.out.println("\t- Vamos a borrar un Personaje Enemigo");
							System.out.println("\t- Inserta la posición que quieras borrar\n");
							System.out.println("########################################################\n");
							int posicionABorrarEnemigo = teclado.nextInt();
							teclado.nextLine();
							
							//RECUPERAMOS EL HUMANO CON UN GET
							Enemigo enemigoABorrar = misEnemigos.get(posicionABorrarEnemigo);
							
							//BORRAMOS LA POSICION QUE NOS DICE EL USUARIO
							misEnemigos.remove(posicionABorrarEnemigo);
							
							//DAMOS UN MENSAJE CON EL HUMANO SELECCIONADO
							System.out.println("########################################################\n");
							System.out.println("~~~ Se ha borrado el personaje enemigo " + enemigoABorrar.getNombrePersonaje() + " ~~~\n");
							System.out.println("########################################################\n");
						break;
					}
				break;	
				case 4:
					mostrarMensajes(" MOSTRAR un Personaje");

					mostrar1 = teclado.nextInt();
					teclado.nextLine();
					
					switch(mostrar1) {
						case 1:
							System.out.println("~~~ Inserta una posición para visualizar un Humano ~~~");
							int posicionHumanoVisualizar = teclado.nextInt();
							teclado.nextLine();
							
							//GUARDAMOS LA POSICION PARA PODERLA MOSTRAR
							Humano humanoAVisualizar = misHumanos.get(posicionHumanoVisualizar);
							
							//LO MOSTRAMOS
							System.out.println(humanoAVisualizar.toString());
						break;
						case 2:
							System.out.println("~~~ Inserta una posición para visualizar un Enemigo ~~~");
							int posicionEnemigoVisualizar = teclado.nextInt();
							teclado.nextLine();
							
							//GUARDAMOS LA POSICION PARA PODERLA MOSTRAR
							Enemigo enemigoAVisualizar = misEnemigos.get(posicionEnemigoVisualizar);
							
							//LO MOSTRAMOS
							System.out.println(enemigoAVisualizar.toString());
						break;
					}
				break;
				case 5:
					mostrarMensajes(" ACTUALIZAR un Personaje");

					actualizar = teclado.nextInt();
					teclado.nextLine();
					
					switch(actualizar) {
						case 1:
							System.out.println("~~~ Has elegido actualizar un Personaje Humano ~~~\n");
							System.out.println("Introduce la posicion del Personaje Humano a actualizar");
							int posicionHumanoActualizar = teclado.nextInt();
							teclado.nextLine();
							
							//RECUPERAMOS EL OBJETO
							Humano humanoAActualizar = misHumanos.get(posicionHumanoActualizar);
							
							//MOSTRAMOS INFO DE LA POSICION SELECCIONADA
							System.out.println("~~~ Se va a actualizar el siguiente Humano ~~~\n");
							System.out.println(humanoAActualizar.toString());
							
							//PEDIMOS AL USUARIO LOS NUEVOS DATOS
							//1. NOMBRE
							System.out.println("Inserta el nuevo nombre del Humano");
							String nombreHumanoActualizar = teclado.nextLine();
							
							humanoAActualizar.setNombrePersonaje(nombreHumanoActualizar);
							
							//2. VIDA
							System.out.println("Inserta la nueva vida del Humano");
							int vidaHumanoActualizar = teclado.nextInt();
							teclado.nextLine();
							
							humanoAActualizar.setVida(vidaHumanoActualizar);
							
							//3. FUERZA
							System.out.println("Inserta la nueva fuerza del Humano");
							int fuerzaHumanoActualizar = teclado.nextInt();
							teclado.nextLine();
							
							humanoAActualizar.setFuerza(fuerzaHumanoActualizar);
							
							//4. ARMA
							System.out.println("Inserta el nuevo arma del Humano");
							String armaHumanoActualizar = teclado.nextLine();
							
							humanoAActualizar.setArma(armaHumanoActualizar);
							
							//5. SEXO
							System.out.println("Inserta el nuevo sexo del Humano");
							String sexoHumanoActualizar = teclado.nextLine();
							
							humanoAActualizar.setSexo(sexoHumanoActualizar);
							
							//MOSTRAMOS MENSAJE DE EXITO
							System.out.println("########################################################\n");
							System.out.println("Humano actualizado con éxito\n");
							System.out.println("########################################################\n");
						break;
						case 2:
							System.out.println("~~~ Has elegido actualizar un Personaje Enemigo ~~~\n");
							System.out.println("Introduce la posicion del Personaje Enemigo a actualizar");
							int posicionEnemigoActualizar = teclado.nextInt();
							teclado.nextLine();
							
							//RECUPERAMOS EL OBJETO
							Enemigo enemigoAActualizar = misEnemigos.get(posicionEnemigoActualizar);
							
							//MOSTRAMOS INFO DE LA POSICION SELECCIONADA
							System.out.println("~~~ Se va a actualizar el siguiente Enemigo ~~~\n");
							System.out.println(enemigoAActualizar.toString());
							
							//PEDIMOS AL USUARIO LOS NUEVOS DATOS
							//1. NOMBRE
							System.out.println("Inserta el nuevo nombre del Enemigo");
							String nombreEnemigoActualizar = teclado.nextLine();
							
							enemigoAActualizar.setNombrePersonaje(nombreEnemigoActualizar);
							
							//2. VIDA
							System.out.println("Inserta la nueva vida del Enemigo");
							int vidaEnemigoActualizar = teclado.nextInt();
							teclado.nextLine();
							
							enemigoAActualizar.setVida(vidaEnemigoActualizar);
							
							//3. FUERZA
							System.out.println("Inserta la nueva fuerza del Enemigo");
							int fuerzaEnemigoActualizar = teclado.nextInt();
							teclado.nextLine();
							
							enemigoAActualizar.setFuerza(fuerzaEnemigoActualizar);
							
							//4. ATAQUE
							System.out.println("Inserta el nuevo ataque del Enemigo");
							String ataqueEnemigoActualizar = teclado.nextLine();
							
							enemigoAActualizar.setAtaque(ataqueEnemigoActualizar);
							
							//MOSTRAMOS MENSAJE DE EXITO
							System.out.println("########################################################\n");
							System.out.println("~~~ Enemigo actualizado con éxito ~~~\n");
							System.out.println("########################################################\n");
						break;
						default:
							System.out.println("########################################################\n");
							System.out.println("Ninguna selección es válida\n");
							System.out.println("########################################################\n");
					}
				break;
				}
			}catch(Exception e) {
				System.out.println("########################################################\n");
				System.out.println("~~~ Ha ocurrido un error ~~~\n");
				System.out.println("########################################################\n");
				teclado.nextLine();
			}
		}while(isActive == true);

		//FINALIZACIÓN DEL PROGRAMA CRUD
		System.out.println("########################################################\n");
		System.out.println("FIN DEL PROGRAMA\n");
		System.out.println("########################################################\n");
		teclado.close();
	}
	
	//METODO PARA MOSTRAR LOS MENSAJES DEL MENÚ
	public static void mostrarMensajes(String mensaje) {
		System.out.println("########################################################\n");
		System.out.println("~~~ Has elegido" + mensaje + " ~~~\n");
		System.out.println("\t- Si quieres que sea un HUMANO pulsa 1.");
		System.out.println("\t- Si quieres que sea un ENEMIGO pulsa 2.\n");
		System.out.println("########################################################\n");
	}

}
