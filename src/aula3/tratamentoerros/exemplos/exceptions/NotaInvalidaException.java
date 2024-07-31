package aula3.tratamentoerros.exemplos.exceptions;

public class NotaInvalidaException extends IllegalArgumentException {

	public NotaInvalidaException(String mensagem) {
		super(mensagem);
	}

	private static final long serialVersionUID = 1L;

}
