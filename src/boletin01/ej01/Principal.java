package boletin01.ej01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		// Creamos una lista de tipo arrayList que ordenará los números del 1 al 10 de
		// forma ordenada
		List<Integer> listaOrdenada = new ArrayList<>();

		// Insertamos los números en la lista
		for (int i = 1; i <= 10; i++) {
			listaOrdenada.add(i);
		}

		// Imprimimos la lista ordenada
		System.out.println(listaOrdenada);

		// Desordenamos la lista
		Collections.shuffle(listaOrdenada);

		// Imprimimos la lista desordenada
		System.out.println(listaOrdenada);

	}

}
