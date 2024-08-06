package aula6.outros;

import java.time.LocalDateTime;

public class Evento {

	private String descricao;
	private LocalDateTime dataHora;
	private TipoDeEvento tipo;

	public Evento(String descricao, LocalDateTime dataHora, TipoDeEvento tipo) {
		super();
		this.descricao = descricao;
		this.dataHora = dataHora;
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

}
