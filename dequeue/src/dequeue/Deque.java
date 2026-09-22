package dequeue;

public class Deque {
// propriedades da classe
	
	private No filaNormal = null;
	private No filaPreferencial = null;
	private int contador = 0;
	
	// Métodos da classe
	public void entrar(boolean normal, int numero) {
		if(normal) {
			filaNormal = new No(numero,filaNormal);
		} else {
			filaPreferencial = new No(numero, filaPreferencial);
		}
	}
	
	public void atender() {
		// Caso muito facil
		if ((filaNormal == null) && (filaPreferencial == null)){
			System.out.println("A agência está vazia ! Va tomar café.");
			contador = 0;
			return;
		}
		
		// Caso fácil: fila normal tem gente, preferencial está vazia
		if (filaPreferencial == null) {
			filaNormal = sair(filaNormal);
			contador = 0;
			return;
		}
		// Caso fácil: fila normal tem gente, preferencial está vazia
		if (filaNormal == null) {
			filaNormal = sair(filaPreferencial);
			contador = 0;
			return;
		}
		
		// Caso difícil: ambas tem gente
		if (contador < 3) {
			filaPreferencial = sair(filaPreferencial);
			contador++;
		}else {
			filaNormal = sair(filaNormal);
			contador = 0;
		}
	}
	
	private No sair(No fila) {
		// caso MUITO facil: fila vazia
		if (fila == null) {
			return null;
		}
		
		// Caso fácil: só um unico nó na fila
		if (fila.getProximo() == null) {
			System.out.println(fila.getNumero());
			return null;
		}
		
		// Caso difícil: fila tem mais de um nó
		No penultimo = fila;
		while (penultimo.getProximo().getProximo() != null) {
			penultimo = penultimo.getProximo();
			
		}
		System.out.println(penultimo.getProximo().getNumero());
		penultimo.setProximo(null);
		return fila;
	}

}










