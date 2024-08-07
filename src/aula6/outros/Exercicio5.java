package aula6.outros;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {

		try {

			String numero = JOptionPane.showInputDialog("Insira o tamanho da circunferência:");

			if (numero.equals("")) {
				throw new NumberFormatException();
			}

			System.out.println(calculaRaioDaCircunferencia(Double.parseDouble(numero.replace(',', '.'))));

		} catch (NullPointerException e) {
			// Sair
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O número deve ser um inteiro válido!");
		}

	}

	public static BigDecimal calculaRaioDaCircunferencia(Double raio) {
		return BigDecimal.valueOf(raio).multiply(BigDecimal.valueOf(raio)).multiply(BigDecimal.valueOf(Math.PI))
				.setScale(4, RoundingMode.HALF_EVEN);
	}

}
