package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();
		gerarNumeros(numeros);

		System.out.println("Soma: " + somarTodos(numeros));
	}

	public static int somarTodos(List<Integer> numeros) {
		return numeros.stream().mapToInt(Integer::intValue).sum();
	}
	
	static void gerarNumeros(List<Integer> lista) {
		Random gerador = new Random();

		while (lista.size() < 50) {
			lista.add(gerador.nextInt(100) + 1);
		}
	}

}
