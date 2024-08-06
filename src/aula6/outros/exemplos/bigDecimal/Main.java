package aula6.outros.exemplos.bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) {

		// JUSTIFICATIVA PARA O USO DE BIG DECIMAL
		System.out.println("Soma: " + 0.1 + 0.2);
		System.out.println("Potencia: " + Math.pow(100, 200));

		System.out.println("\nBIG DECIMAL:");

		BigDecimal valor1 = BigDecimal.valueOf(0.1);
		BigDecimal valor2 = BigDecimal.valueOf(0.2);

		System.out.println("Soma: " + valor1.add(valor2));

		BigDecimal base = BigDecimal.valueOf(100);

		System.out.println("Potencia: " + base.pow(200));

		System.out.println("\nBIG DECIMAL CUIDADO:");

		BigDecimal dividendo = BigDecimal.valueOf(2);
		BigDecimal divisor = BigDecimal.valueOf(3);

		System.out.println("Cuidado com dizimas: " + dividendo.divide(divisor, 10, RoundingMode.HALF_EVEN));
	}

}
