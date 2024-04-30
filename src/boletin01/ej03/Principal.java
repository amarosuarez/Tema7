package boletin01.ej03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {

		// Constante que contiene el texto
		final String TEXTO = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

		// Variable que almacena el número de apariciones de una letra
		int apariciones = 1;

		// Variable que almacena los caracteres de el texto
		char[] textoArray = TEXTO.toLowerCase().toCharArray();

		// Mapa que almacena las letras y el número de sus apariciones
		Map<Character, Integer> frecuencia = new HashMap<>();

		// Bucle para recorrer el array e inserta el caracter en la lista si es una letra
		for (char c : textoArray) {
			// Comprobamos que es una letra
			if (Character.isLetter(c)) {
				// Comprobamos si la clave está en el mapa
				if (frecuencia.containsKey(c)) {
					// Aumentamos en uno la aparición
					apariciones = frecuencia.get(c) + 1;
				}
				
				// Añadimos la frecuencia a la clave en el mapa
				frecuencia.put(c, apariciones);
			}
		}

		// Imprimimos la letra y sus apariciones
		frecuencia.forEach((k,v) -> System.out.println("Letra: " + k + " -> " + v + "\tapariciones"));
		
	}

}
