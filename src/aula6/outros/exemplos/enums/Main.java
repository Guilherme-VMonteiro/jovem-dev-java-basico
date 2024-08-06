package aula6.outros.exemplos.enums;

public class Main {

	public static void main(String[] args) {

		System.out.println("\nATRIBUTOS VIA METODOS: \n");

		System.out.println(ExemploEnum.CARTAO_CREDITO.getCodigo());
		System.out.println(ExemploEnum.CARTAO_CREDITO.getDescricao());

		System.out.println("\nTODOS OS VALORES: \n");

		for (ExemploEnum formas : ExemploEnum.values()) {
			System.out.println(formas.getDescricao());
		}

		System.out.println("\nCOMPARANDO ENUMS: \n");
		System.out.println("SWITCH: \n");

		ExemploEnum metodoPagamento = ExemploEnum.PIX;

		switch (metodoPagamento) {
		case CARTAO_CREDITO: {
			System.out.println("Cartao de credito, 10% taxa");
			break;
		}
		case PIX: {
			System.out.println("PIX, 10% DESCONTO");
			break;
		}
		default:
			System.out.println("Compra efetuada!");
			break;
		}

		System.out.println("\nIF: \n");

		if (metodoPagamento == ExemploEnum.PIX) {
			System.out.println("PIX, 10% DESCONTO");
		}

		System.out.println("\nMETODOS EM ENUMS: \n");
		System.out.println("\nANTIGAMENTE: \n");
//		for (ExemploEnum forma : ExemploEnum.values()) {
//			System.out.println("DESCONTO: " + forma.getDesconto(100));
//		}
		
		System.out.println("\nATUALMENTE: \n");
		for (ExemploEnum forma : ExemploEnum.values()) {
		System.out.println("DESCONTO: " + forma.getDesconto().apply(100d));
	}
	}
}
