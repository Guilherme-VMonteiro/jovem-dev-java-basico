package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();
		gerarNumeros(numeros);

		System.out.println("Média dos maiores que 50: " + String.format("%.2f",
				numeros.stream().filter(n -> n > 50).mapToInt(Integer::intValue).average().getAsDouble()));

	}

	static void gerarNumeros(List<Integer> lista) {
		Random gerador = new Random();

		while (lista.size() < 50) {
			lista.add(gerador.nextInt(100) + 1);
		}
	}
}
