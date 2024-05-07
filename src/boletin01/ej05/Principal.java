package boletin01.ej05;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Creamos un mapa para las series
		HashMap<String, String> serie = new HashMap<>();
		
		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde se almacenará la opción elegida
		int opcion;
		
		// Variable donde se almacenará el nombre
		String nombre = "";
		
		// Variable donde se almacenará la valoración
		String valoracion = "";

		
		do {
			System.out.println("Gestion de series");
			System.out.println("1. Agregar");
			System.out.println("2. Buscar");
			System.out.println("3. Eliminar");
			System.out.println("4. Salir");
			
			// Leemos la opcion
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
			case 1:
				// Pedimos el nombre
				System.out.println("Añade una serie");
				nombre = sc.nextLine();
				
				// Pedimos la valoración
				System.out.println("Añade una valoración");
				valoracion = sc.nextLine();
				
				// Lo añadimos en el mapa
				serie.put(nombre, valoracion);
				
				System.out.println("Añadido correctamente");
				break;
				
			case 2:
				// Pedimos el nombre
				System.out.println("Añade una serie");
				nombre = sc.nextLine();
				
				// Comprobamos si la serie está en el mapa
				if (serie.containsKey(nombre)) {
					System.out.println(nombre + " - " + valoracion);
				} else {
					System.out.println("Serie no encontrada");
				}
				
				break;
				
			case 3:
				// Pedimos el nombre
				System.out.println("Añade una serie");
				nombre = sc.nextLine();
				
				// Eliminamos la serie 
				if (serie.remove(nombre) != null) {
					System.out.println("Eliminado correctamente");
				} else {
					System.out.println("No existe");
				}
				
				break;
				
			case 4:
				System.out.println("Hasta luego");
				break;
				
			default:
				System.out.println("Opción no válida");
				break;
			}
		} while (opcion != 4);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
