package avaliacao.semana1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.function.BinaryOperator;

import javax.swing.JOptionPane;

import avaliacao.semana1.entities.Cliente;
import avaliacao.semana1.entities.ClientePremium;
import avaliacao.semana1.entities.ItemVenda;
import avaliacao.semana1.entities.Produto;
import avaliacao.semana1.entities.Venda;

public class Main {

	public static void main(String[] args) {

		Cliente cliente = coletaCliente();

		if (cliente != null) {
			Venda venda = new Venda(cliente, coletaDesconto(cliente.getDataNascimento(), cliente.isPremium()));
			coletaItemsVenda(venda.getItems());
			venda.setTotal(calculaTotal(venda.getItems()));

			if (venda.getTotal() == 0) {
				JOptionPane.showMessageDialog(null, "Encerrando venda!");
			} else {
				venda.setMetodoDePagamento(coletaMetodoDePagamento());
				venda.setTotalComDesconto(venda.getTotal() * ((100 - venda.getDesconto()) / (float) 100));
			}

			imprimirCupom(venda);
		}
	}

	private static void imprimirCupom(Venda venda) {

		System.out.println("************ CUPOM ************\n");

		imprimirItems(venda.getItems());

		System.out.println("");

		System.out.println("SubTotal  ............... " + String.format("%.2f", venda.getTotal()));

		String mensagemDesconto = "";

		switch (venda.getDesconto()) {
		case 10:
			mensagemDesconto = "terceira idade";
			break;
		case 20:
			mensagemDesconto = "cliente premium";
			break;
		case 30:
			mensagemDesconto = "aniversariante";
			break;
		default:
			mensagemDesconto = "sem desconto";
			break;
		}

		System.out.println("Descto. " + venda.getDesconto() + "% " + mensagemDesconto + "\n");

		System.out.println("Total .................  " + String.format("%.2f", venda.getTotalComDesconto()));
		System.out.println("Forma de pagamento: " + venda.getMetodoDePagamento());
		System.out.println("Cliente: " + venda.getCliente().getNome().charAt(0) + venda.getCliente().getNome()
				.substring(1, venda.getCliente().getNome().length()).replaceAll("[a-zA-Z]", "*"));
	}

	private static void imprimirItems(List<ItemVenda> items) {

		for (ItemVenda itemVenda : items) {
			System.out.println(itemVenda.getProduto().getNome());
			System.out.println(" " + itemVenda.getProduto().getQuantidade() + "x "
					+ String.format("%.2f", itemVenda.getProduto().getPrecoPorUnidade()) + "  ................ "
					+ String.format("%.2f", itemVenda.getTotalProduto()));
		}
	}

	private static String coletaMetodoDePagamento() {

		try {

			int opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Insira a forma de pagamento:\n\n1 - Cartão de Crédito\n2 - Cartão de Débito\n3 - Dinheiro"));

			switch (opcao) {
			case 1: {
				return "Crédito";
			}
			case 2: {
				return "Débito";
			}
			case 3: {
				return "Dinheiro";
			}
			default: {
				JOptionPane.showMessageDialog(null, "ERRO: Opção inválida");
				break;
			}
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "ERRO: Opção inválida!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro inesperado, contate o suporte!");
		}

		return coletaMetodoDePagamento();
	}

	private static float calculaTotal(List<ItemVenda> items) {

		try {
			return items.stream().map(item -> item.getTotalProduto()).reduce(somador::apply).get();
		} catch (Exception e) {
			// Improvável que caia aqui, pelo fato de que sempre terá itens na lista devido
			// ao coletaItemsVenda() e suas verifiações
			JOptionPane.showMessageDialog(null, "Erro inesperado, contate o suporte!");
		}

		return 0;
	}

	private static BinaryOperator<Float> somador = (a, b) -> a += b;

	private static void coletaItemsVenda(List<ItemVenda> items) {

		String nomeProduto;

		do {

			nomeProduto = coletaNomeProduto();

			if (!nomeProduto.equals("fim")) {
				float precoUn = coletaPrecoUnitario(nomeProduto);
				int quantidade = coletaQuantidade(nomeProduto);

				items.add(new ItemVenda(new Produto(nomeProduto, precoUn, quantidade), quantidade * precoUn));
			}
		} while (!nomeProduto.equals("fim"));

		if (items.isEmpty()) {
			JOptionPane.showMessageDialog(null,
					"ERRO: Para realizar uma venda é necessario que ela tenha pelo menos um item!");
			coletaItemsVenda(items);
		}
	}

	private static int coletaQuantidade(String produto) {
		try {
			int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantiade de " + produto + ":"));

			if (quantidade <= 0 || quantidade > 50) {
				throw new IllegalArgumentException();
			}

			return quantidade;
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "ERRO: Quantidade inválida!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro inesperado, contate o suporte!");
		}

		return coletaQuantidade(produto);
	}

	private static float coletaPrecoUnitario(String produto) {
		try {
			float preco = Float.parseFloat(
					JOptionPane.showInputDialog("Insira o valor do unitario de " + produto + ":").replace(",", "."));

			if (preco <= 0) {
				throw new IllegalArgumentException();
			}

			return preco;
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "ERRO: Preço inválido!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro inesperado, contate o suporte!");
		}

		return coletaPrecoUnitario(produto);
	}

	private static String coletaNomeProduto() {

		try {
			String nomeProduto = JOptionPane
					.showInputDialog("Insira o nome do produto:\n(Digite 'fim' para parar de inserir)");

			if (nomeProduto == null || nomeProduto.isEmpty()) {
				throw new IllegalArgumentException("ERRO: Nome inválido!");
			}

			return nomeProduto;
		} catch (NullPointerException | IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro inesperado, contate o suporte!");
		}

		return coletaNomeProduto();
	}

	private static int coletaDesconto(LocalDate dataNascimento, boolean isPremium) {

		LocalDate hoje = LocalDate.now();

		if (dataNascimento.getDayOfMonth() == hoje.getDayOfMonth()
				&& dataNascimento.getMonth().equals(hoje.getMonth())) {
			return 30;
		} else if (isPremium) {
			return 20;
		} else if (Period.between(dataNascimento, hoje).getYears() > 60) {
			return 10;
		}

		return 0;
	}

	private static Cliente coletaCliente() {

		String nomeCliente = coletaNomeCliente();

		if (nomeCliente != null) {
			LocalDate dataNascimentoCliente = coletaDataNascimento();

			if (dataNascimentoCliente != null) {
				if (nomeCliente.contains("Thiago")) {
					return new ClientePremium(nomeCliente, dataNascimentoCliente);
				} else {
					return new Cliente(nomeCliente, dataNascimentoCliente);
				}
			}
		}

		return null;
	}

	private static LocalDate coletaDataNascimento() {
		try {

			String dataNascimento = JOptionPane
					.showInputDialog("Insira a data de nascimento do cliente:\n(Modelo: dia/mes/ano)");

			if (dataNascimento.isEmpty() || dataNascimento.length() < 10) {
				throw new IllegalArgumentException();
			}

			DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			return LocalDate.parse(dataNascimento, formatador);

		} catch (NullPointerException e) {
			return null;
		} catch (IllegalArgumentException | DateTimeParseException e) {
			JOptionPane.showMessageDialog(null, "ERRO: Data de nascimento inválida!");
			return coletaDataNascimento();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro inesperado, contate o suporte!");
		}
		return null;
	}

	private static String coletaNomeCliente() {

		try {
			String nomeCliente = JOptionPane.showInputDialog("Insira o nome do cliente:");

			if (nomeCliente.isEmpty()) {
				throw new IllegalArgumentException("ERRO: Nome inválido!");
			}

			return nomeCliente;
		} catch (NullPointerException e) {
			return null;
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return coletaNomeCliente();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro inesperado, contate o suporte!");
		}

		return null;
	}
}
