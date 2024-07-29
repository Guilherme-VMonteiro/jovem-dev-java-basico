package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		List<Integer> listaDeNumeros = new ArrayList<Integer>();
		Set<Integer> conjuntoDeNumeros = new HashSet<Integer>();
		Random geradorDeNumeros = new Random();
		
		for (int i = 1; i <= 50; i++) {
			listaDeNumeros.add(geradorDeNumeros.nextInt(21));
		}
		
		Collections.sort(listaDeNumeros);
		conjuntoDeNumeros.addAll(listaDeNumeros);
		
		System.out.println(listaDeNumeros.toString());
		System.out.println(conjuntoDeNumeros.toString());
	}
}
