package aula3.tratamentoerros;

import java.util.List;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio {

	public static void main(String[] args) {
		String nomeCliente = coletaNomeCliente();

		if (nomeCliente != null) {
			Venda venda = new Venda();
			venda.nomeCliente = nomeCliente;
			coletaItems(venda.items);
		}
	}

	private static void coletaItems(List<Item> items) {

		int quantidade = coletaQtdItems();

		for (int i = 0; i < quantidade; i++) {

			String nomeDoItem = coletaNomeItem(i);

			items.add(new Item(nomeDoItem, coletaPreco(nomeDoItem)));
		}
	}

	static String coletaNomeItem(int numeroDoItem) {
		try {
			String nomeItem = JOptionPane.showInputDialog("Insira o nome do item " + (numeroDoItem + 1) + ":");

			if (nomeItem.length() < 3) {
				throw new IllegalArgumentException();
			}

			return nomeItem;
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Erro: O item " + (numeroDoItem + 1) + " da venda deve ser informado!");
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null,
					"Erro: O item " + (numeroDoItem + 1) + " da venda deve possuir um nome válido!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro inesperado, contate o suporte!");
		}

		return coletaNomeItem(numeroDoItem);
	}

	static float coletaPreco(String produto) {
		try {

			float preco = Float.parseFloat(JOptionPane.showInputDialog("Insira o preço do produto '" + produto + "':"));

			if (preco <= 0) {
				throw new PrecoIncorretoException("ERRO: Preço do produto R$'" + produto + "' esta incorreto!");
			}

			return preco;

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"ERRO: Você precisa informar um número válido para o preço do produto!");
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "ERRO: Você precisa informar o preço do produto!");
		} catch (PrecoIncorretoException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro inesperado, contate o suporte!");
		}

		return coletaPreco(produto);
	}

	static String coletaNomeCliente() {
		try {
			String nome = JOptionPane.showInputDialog("Insira o nome do cliente:");

			if (nome.length() < 3) {
				throw new IllegalArgumentException();
			}

			return nome;
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Cancelando a venda!");
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "ERRO: Nome do cliente inválido!");
			return coletaNomeCliente();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro inesperado, contate o supote!");
		}
		return null;
	}

	static Integer coletaQtdItems() {
		try {

			String quantidade = JOptionPane.showInputDialog("Insira a quantidade de itens:");

			if (quantidade == null) {
				throw new IllegalArgumentException();
			}

			int qtdItems = Integer.parseInt(quantidade);

			if (qtdItems > 10) {
				throw new VendaException("ERRO: Vendas permitidas de no máximo 10 itens por cliente!");
			}

			if (qtdItems < 1) {
				throw new VendaException("ERRO: Vendas permitidas de no mínimo 1 item por cliente!");
			}

			return qtdItems;

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "ERRO: Você precisa informar um número inteiro de items da venda!");
			return coletaQtdItems();
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "Cancelando a venda!");
		} catch (VendaException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro inesperado, contate o suporte!");
		}

		return 0;
	}
}
