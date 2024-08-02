package avaliacao.semana1.entities;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private Cliente cliente;
	private List<ItemVenda> items = new ArrayList<>();
	private int desconto;
	private float total;
	private float totalComDesconto;
	private String metodoDePagamento;

	public Venda() {
		super();
	}

	public Venda(Cliente cliente, int desconto) {
		super();
		this.cliente = cliente;
		this.desconto = desconto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemVenda> getItems() {
		return items;
	}

	public void setItems(List<ItemVenda> items) {
		this.items = items;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getTotalComDesconto() {
		return totalComDesconto;
	}

	public void setTotalComDesconto(float totalComDesconto) {
		this.totalComDesconto = totalComDesconto;
	}

	public String getMetodoDePagamento() {
		return metodoDePagamento;
	}

	public void setMetodoDePagamento(String metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}

}
