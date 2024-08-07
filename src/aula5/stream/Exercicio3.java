package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();
		gerarNumeros(numeros);

		System.out.println("Quantidade de números '25': " + coletarQuantidadeDeNumerosVinteECinco(numeros));
	}
	
	static long coletarQuantidadeDeNumerosVinteECinco(List<Integer> numeros) {
		return numeros.stream().filter(Objects::nonNull).filter(num -> num == 25).count();
	}

	static void gerarNumeros(List<Integer> lista) {
		Random gerador = new Random();

		while (lista.size() < 50) {
			lista.add(gerador.nextInt(100) + 1);
		}
	}
}
