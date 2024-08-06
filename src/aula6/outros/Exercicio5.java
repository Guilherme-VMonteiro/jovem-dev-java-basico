package aula6.outros;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {

		try {

			String numero = JOptionPane.showInputDialog("Insira o tamanho do raio da circunferência:");

			if (numero.equals("")) {
				throw new NumberFormatException();
			}

			BigDecimal circunferencia = BigDecimal.valueOf(Integer.parseInt(numero));

			System.out.println(circunferencia.multiply(BigDecimal.valueOf(Math.PI)).multiply(BigDecimal.valueOf(2))
					.divide(BigDecimal.valueOf(1), 4, RoundingMode.HALF_EVEN));

		} catch (NullPointerException e) {
			// Sair
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "O número deve ser um inteiro válido!");
		}

	}

}
