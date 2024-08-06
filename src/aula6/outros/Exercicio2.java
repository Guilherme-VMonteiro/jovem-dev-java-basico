package aula6.outros;

public class Exercicio2 {

	public static void main(String[] args) {

		int valor1 = 6;
		int valor2 = 3;

		StringBuilder builder = new StringBuilder();
		for (Calculadora1Enum operacoes : Calculadora1Enum.values()) {
			
			System.out.println(builder
								.append(operacoes.getNomeAmigavel())
								.append(" de '")
								.append(valor1)
								.append("' e '")
								.append(valor2)
								.append("' = ")
								.append(operacoes.getCalculo().calcula(valor1, valor2))
			);
			builder.setLength(0);
		}

	}
}
