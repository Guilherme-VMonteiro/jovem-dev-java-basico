package aula5.stream.optional;

import java.time.LocalDateTime;

public class ExemploProblema {

	public static void main(String[] args) {

		String resposta = testaHora();

		if (resposta != null) {
			// PROBLEMA: NULL POINTER
			System.out.println(resposta.toUpperCase());
		} else {
			System.out.println("Não retornou nada");
		}
	}

	static String testaHora() {
		if (LocalDateTime.now().getSecond() % 2 == 0) {
			return "Retornou";
		}
		return null;
	}

}
