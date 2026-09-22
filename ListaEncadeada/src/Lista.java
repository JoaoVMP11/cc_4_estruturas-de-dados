public class Lista {
	// propriedades da classe
	private No cabeca = null;
	
	// Metodos da classe
	
	public void inserir(int numero) {
		// cenario facil: lista vazia
		if (cabeca == null) {
			cabeca = new No(numero, null);
			return;
		}
		
		// cenario dificil: lista NAO vazia
		No ultimo = cabeca;
		while(ultimo.getProximo() != null) {
			ultimo = ultimo.getProximo();
		}
		ultimo.setProximo(new No(numero,null));
	}
	
	public void excluir(int numero) {
		// lista vazia
		if (cabeca == null) {
			return;
		}
		// excluir primeiro no da lista
		if (cabeca.getNumero() == numero) {
		cabeca = cabeca.getProximo();
		return;
		}
		
		// Procurar o no a ser excluido, lembrando que precisa parar no anterior
		No anterior = cabeca;
		while ((anterior.getProximo() != null) && (anterior.getProximo().getNumero() != numero)) {
			anterior = anterior.getProximo();
		}
		// Nao foi encontrado numero para excluir
		if (anterior.getProximo() == null) {
			return;
		}
		
		// encontrei numero a ser excluido
		anterior.setProximo(anterior.getProximo().getProximo());
	}
	
	public void imprimir() {
		No ponteiro = cabeca;
		while (ponteiro != null) {
			System.out.println(ponteiro.getNumero());
			ponteiro = ponteiro.getProximo();
		}
	}
	
}
