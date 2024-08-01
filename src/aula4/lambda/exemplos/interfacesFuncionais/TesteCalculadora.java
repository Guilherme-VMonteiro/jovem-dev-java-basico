package aula4.lambda.exemplos.interfacesFuncionais;

public class TesteCalculadora {

	public static void main(String[] args) {

		FunctionalInterfaceCalculadora multiplicador = (n1, n2) -> n1 * n2;
		FunctionalInterfaceCalculadora divisor = (n1, n2) -> n1 / n2;
		FunctionalInterfaceCalculadora somador = (n1, n2) -> n1 + n2;
		FunctionalInterfaceCalculadora subtrair = (n1, n2) -> n1 - n2;
		FunctionalInterfaceCalculadora elevar = Math::pow;

		System.out.println(multiplicador.calcula(2.0, 5.0));
		System.out.println(divisor.calcula(2.0, 5.0));
		System.out.println(somador.calcula(2.0, 5.0));
		System.out.println(subtrair.calcula(2.0, 5.0));
		System.out.println(elevar.calcula(2.0, 5.0));
	}
}
