package aula5.stream;

public class ZeroBertoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ZeroBertoException() {
		super("A lista não possui 'berto'");
	}

}
