package aula4.lambda.exemplos.thread;

public class Principal {

	public static void main(String[] args) {

		// Classe anonima
//		Runnable runnable = new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 100; i++) {
//					System.out.println(i);
//				}
//			}
//		};

		// Expressao lambda em uma interface funcional
		Runnable runnableLambda = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(i);
			}
		};

		Thread thread = new Thread(runnableLambda);

		System.out.println("Iniciando a thread");
		thread.start();

		System.out.println("Terminando o programa");
	}
}
