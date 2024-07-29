package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		List<Integer> listaDeNumeros = new ArrayList<Integer>();
		Random geradorDeNumeros = new Random();

		for (int i = 1; i <= 50; i++) {
			listaDeNumeros.add(geradorDeNumeros.nextInt(100));
		}

		Collections.sort(listaDeNumeros);

		for (Integer numero : listaDeNumeros) {
			System.out.print(numero + " ");
		}
	}
}
