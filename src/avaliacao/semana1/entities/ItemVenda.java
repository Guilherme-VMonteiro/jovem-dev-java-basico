package avaliacao.semana1.entities;

public class ItemVenda {

	private Produto produto;
	private float totalProduto;

	public ItemVenda() {
		super();
	}

	public ItemVenda(Produto produto) {
		super();
		this.produto = produto;
	}

	public ItemVenda(Produto produto, float totalProduto) {
		super();
		this.produto = produto;
		this.totalProduto = totalProduto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public float getTotalProduto() {
		return totalProduto;
	}

	public void setTotalProduto(float totalProduto) {
		this.totalProduto = totalProduto;
	}

}
