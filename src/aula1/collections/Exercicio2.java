package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		List<Integer> listaDeNumeros = new ArrayList<Integer>();

		for (int i = 1; i <= 50; i++) {
			listaDeNumeros.add(gerarNumero());
		}
		
		Collections.sort(listaDeNumeros);
		Collections.reverse(listaDeNumeros);

		for (Integer numero : listaDeNumeros) {
			System.out.print(numero + " ");
		}

	}

	public static int gerarNumero() {
		Random gerador = new Random();

		return gerador.nextInt(100);
	}

}
