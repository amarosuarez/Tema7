package boletin01.ej02;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// Variable donde se almacenará el número generado
		int num;

		// Lista donde se almacenarán los números generados
		Set<Integer> listaNum = new LinkedHashSet<>();

		// Creamos un objeto random
		Random rand = new Random();

		// Generamos diez números aleatorios que no sean repetidos
		while (listaNum.size() < 10) {
			// Generamos el número aleatorio mientras esté en la lista
			num = rand.nextInt(20) + 1;

			// Añadimos el número aleatorio a la lista
			listaNum.add(num);
		}

		// Imprimimos la lista de números
		System.out.println(listaNum);
	}

}
