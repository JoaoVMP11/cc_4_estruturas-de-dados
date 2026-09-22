package filapilha1;

public class Pilha {
	private No cabeca = null;
	
	// Métodos da classe
	public void push(int numero) {
		cabeca = new No(numero, cabeca);
	}
	
	public void pop() {
		// Caso fácil: pilha vazia
		if (cabeca == null) {
			return;
		}
		
		// Caso fácil: pilha NAO vazia:
		System.out.println(cabeca.getNumero());
		cabeca = cabeca.getProximo();
	}
}
