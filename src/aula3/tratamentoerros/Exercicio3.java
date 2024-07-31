package aula3.tratamentoerros;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercicio3 {

	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {

		try {
			int valor = 10 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		try {
			String[] nomes = null;
			int tamanho = nomes.length;
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		try {
			String nome = "Guilherme";
			int caractere = nome.charAt(nome.length() + 1);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		try {

			ArrayList<Integer> numeros = new ArrayList<>();
			numeros.add(10);
			numeros.add(20);

			Iterator<Integer> iterator = numeros.iterator();
			iterator.remove();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}
}
