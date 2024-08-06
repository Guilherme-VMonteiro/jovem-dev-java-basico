package aula5.stream.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo {

	public static void main(String[] args) {

		List<String> alunos = new ArrayList<String>();

		alunos.add("Guilherme");
		alunos.add("Guilherme");
		alunos.add("Guilherme1");
		alunos.add("Miguel");
		alunos.add("Laís");
		alunos.add("Antonio");

		// OPERACOES INTERMEDIARIAS

		// BOA PRATICA: FILTER -> LIMIT -> MAP

		System.out.println("MAP\n");
		alunos.stream().map(String::toUpperCase).forEach(System.out::println);

		System.out.println("\nFILTER\n");
		alunos.stream().filter(s -> s.length() < 8).forEach(System.out::println);

		System.out.println("\nDISTINCT\n");
		alunos.stream().distinct().forEach(System.out::println);

		System.out.println("\nSORTED\n");
		alunos.stream().sorted().forEach(System.out::println);

		System.out.println("\nLIMIT\n");
		alunos.stream().limit(2).forEach(System.out::println);

		// OPERACOES TERMINAIS

		System.out.println("\n\nFOREACH\n");
		alunos.stream().map(String::toUpperCase).forEach(System.out::println);

		System.out.println("\nCOUNT\n");
		System.out.println(alunos.stream().map(String::toUpperCase).count());

		System.out.println("\nFINDANY\n");
		System.out.println(alunos.stream().filter(s -> s.startsWith("Gui")).findAny());

		System.out.println("\nFINDFIRST\n");
		System.out.println(alunos.stream().filter(s -> s.startsWith("La")).findFirst());

		System.out.println("\nCOLLECT\n");
		alunos.stream().map(String::toUpperCase).collect(Collectors.toSet()).forEach(System.out::println);

		System.out.println("\nREDUCE\n");
		System.out.println(alunos.stream().map(String::length).reduce(0, (s1, s2) -> s1 + s2));

		// OPERACOES COM OS TIPOS ESPECIAIS DE STREAM
		// IntStream DoubleStream LongStream
		// Converter Stream normal para tipo especial -> mapToInt()

		System.out.println("\nMAX\n");
		System.out.println(alunos.stream().mapToInt(String::length).max());

		System.out.println("\nMIN\n");
		System.out.println(alunos.stream().mapToInt(String::length).min());

		System.out.println("\nAVERAGE\n");
		System.out.println(alunos.stream().mapToInt(String::length).average());

	}

}
