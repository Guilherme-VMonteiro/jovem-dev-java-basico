package aula2.poo.exercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		LocalDate dataInserida = LocalDate.parse(JOptionPane.showInputDialog("Insira uma data(dia/mes/ano):"),
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		JOptionPane.showMessageDialog(null, dataInserida.getDayOfWeek());
	}
}
