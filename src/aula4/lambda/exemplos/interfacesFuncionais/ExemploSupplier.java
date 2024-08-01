package aula4.lambda.exemplos.interfacesFuncionais;

import java.util.Optional;
import java.util.Random;

public class ExemploSupplier {

	public static void main(String[] args) {

//		String login = null;
		String login = "Guilherme";

		
		// Supplier não recebe argumento e retorna um resultado
		String usuario = Optional.ofNullable(login).orElseGet(() -> geraIdentidade());
		System.out.println("Olá " + usuario);
	}

	static String geraIdentidade() {
		return "Guest-" + new Random().nextInt(10000);
	}
}
