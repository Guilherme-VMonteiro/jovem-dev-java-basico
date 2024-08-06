package aula6.outros.exemplos.enums;

import java.util.function.Function;

public enum ExemploEnum {

	CARTAO_CREDITO(1, "Cartão de Crédito", valor -> valor),
	CARTAO_DEBITO(2, "Cartão de Débito", valor -> valor),
	DINHEIRO(3, "Dinheiro", valor -> valor * 0.9),
	PIX(17, "PIX", valor -> valor * 0.9);

	private int codigo;
	private String descricao;

	// CRIAR METODOS ATUALMENTE
	private Function<Double, Double> desconto;

	private ExemploEnum(int codigo, String descricao, Function<Double, Double> desconto) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.desconto = desconto;
	}

	// CRIAR METODOS ANTIGAMENTE
	// CRIAR METODO ABSTRATO E IMPLEMENTAR METODO PARA CADA CONSTANTE DO ENUM
//	abstract Double getDesconto(double d);

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Function<Double, Double> getDesconto() {
		return desconto;
	}
}
