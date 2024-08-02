package avaliacao.semana1.entities;

import java.time.LocalDate;

public class Cliente {

	private String nome;
	private LocalDate dataNascimento;
	private boolean isPremium;

	public Cliente() {
		this.isPremium = false;
	}

	public Cliente(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.isPremium = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean isPremium() {
		return isPremium;
	}

	protected void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}
}
