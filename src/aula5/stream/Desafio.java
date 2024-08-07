package aula5.stream;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Desafio {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		gerarPessoas(pessoas);

		System.out.println(coletarPessoas(pessoas).stream().collect(Collectors.joining(", ")));
	}

	public static List<String> coletarPessoas(List<Pessoa> pessoas) {
		return pessoas.stream()
				.filter(pessoa -> "aeiouAEIOU".indexOf(pessoa.getNome().charAt(0)) != -1
						|| Year.isLeap(pessoa.getDataNascimento().getYear()))
				.sorted((pessoa1, pessoa2) -> pessoa1.getNome().compareTo(pessoa2.getNome()) * -1)
				.map(pessoa -> pessoa.getNome()).collect(Collectors.toList());
	}

	static void gerarPessoas(List<Pessoa> lista) {
		Random gerador = new Random();
		lista.add(new Pessoa("Guilherme", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Pedro", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Maria", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("João", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Matheus", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Marcos", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Vinicius", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Antoniela", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Paulo", gerarTelefone(gerador), gerarNascimento(gerador)));
		lista.add(new Pessoa("Miguel", gerarTelefone(gerador), gerarNascimento(gerador)));
	}

	static LocalDate gerarNascimento(Random random) {
		return LocalDate.of(random.nextInt((2024 - 1900) + 1) + 1900, random.nextInt(12) + 1, random.nextInt(28) + 1);
	}

	static String gerarTelefone(Random random) {
		return "(48) 9" + gerarNumeros(random) + "-" + gerarNumeros(random);
	}

	private static String gerarNumeros(Random random) {
		String retorno = "";

		for (int i = 0; i < 4; i++) {
			retorno += random.nextInt(10);
		}

		return retorno;
	}
}
