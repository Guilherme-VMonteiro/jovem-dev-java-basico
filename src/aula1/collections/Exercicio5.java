package aula1.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio5 {

	public static void main(String[] args) {
		Set<Integer> conjuntoA = new HashSet<Integer>();
		Set<Integer> conjuntoB = new HashSet<Integer>();
		Random geradorDeNumeros = new Random();

		for (int i = 1; i <= 10; i++) {
			conjuntoA.add(geradorDeNumeros.nextInt(31));
			conjuntoB.add(geradorDeNumeros.nextInt(31));
		}

		for (Integer integer : conjuntoA) {
			if (conjuntoB.contains(integer)) {
				System.out.print(integer + " ");
			}
		}
	}
}
