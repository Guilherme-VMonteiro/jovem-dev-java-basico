package aula2.poo.desafio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		List<Carro> listaDeCarros = new ArrayList<>();
		boolean continuar = true;

		do {
			String modelo = JOptionPane
					.showInputDialog("Insira o modelo do carro:\nDigite 'fim' para para de inserir.");

			if (verificaFim(modelo)) {
				String ano = JOptionPane.showInputDialog("Insira o ano do carro:");

				if (verificaInputs(modelo, ano)) {
					adicionaCarro(modelo, Integer.parseInt(ano), listaDeCarros);
				} else {
					JOptionPane.showMessageDialog(null, "Dados inválidos, tente novamente!");
				}
			} else {
				continuar = false;
			}

		} while (continuar);

		if (listaDeCarros.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhum carro inserido!");
		} else {
			JOptionPane.showMessageDialog(null, listarCarros(listaDeCarros));
		}
	}

	static String listarCarros(List<Carro> listaDeCarros) {
		String retorno = "Carros inseridos: \n\n";

		Comparator<Carro> comparador = new Comparator<Carro>() {

			@Override
			public int compare(Carro carro1, Carro carro2) {

				if (carro1.ano >= carro2.ano) {
					return 1;
				}

				return -1;
			}
		};

		listaDeCarros.sort(comparador);

		for (Carro carro : listaDeCarros) {
			retorno += "Modeo: " + carro.modelo + " - Ano: " + carro.ano + "\n";
		}

		return retorno;
	}

	static void adicionaCarro(String modelo, int ano, List<Carro> listaDeCarros) {
		Carro novoCarro = new Carro();
		novoCarro.modelo = modelo;
		novoCarro.ano = ano;

		listaDeCarros.add(novoCarro);
	}

	static boolean verificaInputs(String modelo, String ano) {
		return !modelo.isEmpty() && !ano.isEmpty() && verificaFim(modelo) && ano.matches("[0-9]+");
	}

	static boolean verificaFim(String string) {
		return !string.equalsIgnoreCase("fim");
	}

}
