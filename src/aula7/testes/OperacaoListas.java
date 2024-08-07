package aula7.testes;

import java.util.List;
import java.util.Objects;

public class OperacaoListas {

	public static int somarTodos(List<Integer> numeros) {
		return numeros.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).sum();
	}

	public static double calcularMediaDosMaiores(List<Integer> numeros) {
		return numeros.stream().filter(Objects::nonNull).filter(n -> n > 50).mapToInt(Integer::intValue).average()
				.orElse(0);
	}

	public static long coletarQuantidadeDeNumerosVinteECinco(List<Integer> numeros) {
		return numeros.stream().filter(Objects::nonNull).filter(num -> num == 25).count();
	}
}
