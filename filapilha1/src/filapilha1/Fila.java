package filapilha1;

public class Fila {
	private No cabeca = null;
	
	// Metodos da classe
	public void entrar(int numero) {
	cabeca = new No(numero, cabeca);	
	}
	
	public void sair() {
		// Caso facil: lista vazia
		if (cabeca == null) {
			return;
		}
		// Caso médio: só tem um trouxa na fila
		if (cabeca.getProximo() == null) {
			System.out.println(cabeca.getNumero());
			cabeca = null;
			return;
		}
		
		// Caso difícil: tem mais de um trouxa na fila
		No penultimo = cabeca;
		while (penultimo.getProximo().getProximo() != null) {
			penultimo = penultimo.getProximo();
		}
		System.out.println(penultimo.getProximo().getNumero());
		penultimo.setProximo(null);
	}
}
