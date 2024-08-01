package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();

		while (numeros.size() < 50) {
			numeros.add((int) (Math.random() * 100));
		}

		numeros.forEach(System.out::println);
	}
}
