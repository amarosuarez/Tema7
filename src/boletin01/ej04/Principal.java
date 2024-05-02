package boletin01.ej04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variable donde se almacenará el nombre introducido por el usuario
		String nombre = "";
		
		// Lista donde se guardarán los nombres no repetidos
		List<String> listaNombres = new ArrayList<>();
		
		// Creamos el objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		while (listaNombres.size() < 5) {
			// Le pedimos el nombre al usuario
			System.out.println("Introduzca el nombre");
			nombre = sc.nextLine();
			
			// Añadimos el nombre
			if (!listaNombres.contains(nombre)) {
				listaNombres.add(nombre);
			}
		}
		
		// Invertimos la lista
		Collections.reverse(listaNombres);
		
		// Mostramos la lista
		for (String n : listaNombres) {
			System.out.println(n);
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
