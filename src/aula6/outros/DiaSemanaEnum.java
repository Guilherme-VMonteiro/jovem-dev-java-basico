package aula6.outros;

import java.util.function.Supplier;

public enum DiaSemanaEnum {
	
	// Achei esta minha abordagem muito ruim! 
	
	SEGUNDA_FEIRA("Segunda-Feira", () -> "Não"),
	TERCA_FEIRA("Terça-Feira", () -> "Não"),
	QUARTA_FEIRA("Quarta-Feira", () -> "Não"),
	QUINTA_FEIRA("Quinta-Feira", () -> "Não"),
	SEXTA_FEIRA("Sexta-Feira", () -> "Não"),
	SABADO("Sábado", () -> "Sim"),
	DOMINGO("Domingo", () -> "Sim");

	private String nome;
	private Supplier<String> isFimDeSemana;

	private DiaSemanaEnum(String nome, Supplier<String> isFimDeSemana) {
		this.nome = nome;
		this.isFimDeSemana = isFimDeSemana;
	}

	public String getNome() {
		return nome;
	}

	public String isFimDeSemana() {
		return isFimDeSemana.get();
	}
}
