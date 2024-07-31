package aula3.tratamentoerros.exceptions;

public class PrecoIncorretoException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PrecoIncorretoException(String mensagem) {
		super(mensagem);
	}
}
