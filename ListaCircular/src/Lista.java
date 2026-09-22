
public class Lista {
	// Popriedades da classe
	private No cabeca = null;
	
	// Métodos da classe
	public void inserir(int numero) {
		// Caso fácil: lista vazia
		if (cabeca == null) {
			cabeca = new No(numero,null);
			cabeca.setProximo(cabeca);
			return;
		}
		
		// Caso difícil: lista NÂO vazia
		No ultimo = cabeca;
		while (ultimo.getProximo() != cabeca) {
			ultimo = ultimo.getProximo();
		}
		ultimo.setProximo(new No(numero,cabeca));
	}
	
	public void excluir(int numero) {
		// Caso muito fácil: lista vazia
		if (cabeca ==null) {
			return;
		}
		
		// Caso fácil: excluir o único
		if ((cabeca.getNumero() == numero) && (cabeca.getProximo() == cabeca)) {
			cabeca = null;
			return;
		}
		
		// Caso difícil: excluir o primeiro
		if (cabeca.getNumero()== numero) {
			No ultimo = cabeca;
			while(ultimo.getProximo() != cabeca) {
				ultimo = ultimo.getProximo();
			}
			cabeca = cabeca.getProximo();
			ultimo.setProximo(cabeca);
			return;
		}
		
		// Caso MUITO DIDICIL: excluir no meio ou no fim
		
		No anterior = cabeca;
		while ((anterior.getProximo() != cabeca) && (anterior.getProximo().getNumero() != numero)){
			anterior = anterior.getProximo();
		}
		
		if (anterior.getProximo() == cabeca) { // Não encontrei o número
			return;
			
		}
		
		anterior.setProximo(anterior.getProximo().getProximo());
	}
	
	public void imprimir() {
		if (cabeca == null) {
			return;
		}
		
		No ponteiro = cabeca;
		do {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		} while (ponteiro != cabeca);
	}
}
