package aula2.poo.exercicio7;

public class Principal {

	public static void main(String[] args) {

		NotaFiscal primeiraNotaFiscal = new NotaFiscal();
		primeiraNotaFiscal.emitente = "Farmacia 1";
		primeiraNotaFiscal.calculaValor(400, 20);
		primeiraNotaFiscal.calculaValor(200, 10);

		NotaFiscal segundaNotaFiscal = new NotaFiscal();
		segundaNotaFiscal.emitente = "Farmacia 2";
		segundaNotaFiscal.calculaValor(80, 5);
		segundaNotaFiscal.calculaValor(100, 15);
		
		System.out.println(primeiraNotaFiscal.getValor());
		System.out.println(segundaNotaFiscal.getValor());
	}
}