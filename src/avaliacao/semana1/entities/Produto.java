package avaliacao.semana1.entities;

public class Produto {

	private String nome;
	private float precoPorUnidade;
	private int quantidade;

	public Produto(String nome, float precoPorUnidade, int quantidade) {
		super();
		this.nome = nome;
		this.precoPorUnidade = precoPorUnidade;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrecoPorUnidade() {
		return precoPorUnidade;
	}

	public void setPrecoPorUnidade(float precoPorUnidade) {
		this.precoPorUnidade = precoPorUnidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
