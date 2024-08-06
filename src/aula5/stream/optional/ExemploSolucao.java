package aula5.stream.optional;

import java.time.LocalDateTime;
import java.util.Optional;

public class ExemploSolucao {

	public static void main(String[] args) {

		String resposta = testaHora();

		Optional<String> opt = Optional.ofNullable(resposta);

		System.out.println(opt);
//		System.out.println(opt.orElse("Não achou nada!"));
//		System.out.println(opt.orElseGet(() -> LocalDateTime.now().toString()));
//		System.out.println(opt.orElseThrow(() -> new IllegalArgumentException("ERRO")));
	}

	static String testaHora() {
		if (LocalDateTime.now().getSecond() % 2 == 0) {
			return "Retornou";
		}
		return null;
	}
}
