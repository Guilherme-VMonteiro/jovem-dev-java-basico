package aula1.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio5 {

	public static void main(String[] args) {
		Set<Integer> conjuntoA = new HashSet<Integer>();
		Set<Integer> conjuntoB = new HashSet<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			conjuntoA.add(gerarNumero());
			conjuntoB.add(gerarNumero());
		}
		
//		System.out.println(conjuntoA.toString());
//		System.out.println(conjuntoB.toString());
		
		for (Integer integer : conjuntoA) {
			if(conjuntoB.contains(integer)) {
				System.out.print(integer + " ");
			}
		}
	}

	public static int gerarNumero() {
		Random gerador = new Random();

		return gerador.nextInt(31);
	}
}
