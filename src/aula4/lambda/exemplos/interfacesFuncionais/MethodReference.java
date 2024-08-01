package aula4.lambda.exemplos.interfacesFuncionais;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {

		List<String> items = new ArrayList<String>();
		items.add("Computador");
		items.add("Telefone");
		items.add("Mesa");
		items.add("Teclado");

		// Funcao de instancia
		String filtro = "Mesa";
		items.removeIf(filtro::equals);

		// Metodo estatico
		items.forEach(MethodReference::imprimir);
	}

	// METODO ESTATICO
	static void imprimir(String dado) {
		System.out.println(dado);
	}

}
