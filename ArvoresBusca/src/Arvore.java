
public class Arvore {
	private No raiz = null;
	private int contador = 0;
	
	// Métodos da classe
	
	public void inserir(int numero) {
		raiz = inserir(raiz, numero);
	}
	
	private No inserir(No raiz, int numero) {
		// Arvore vazia
		if (raiz == null) {
			return new No(numero, null, null);
		}
		
		// Arvore NAO vazia
		if(numero < raiz.getNumero()) {
			raiz.setEsquerda(inserir(raiz.getEsquerda(), numero));
		} else {
			raiz.setDireita(inserir(raiz.getDireita(), numero));
		}
		
		return raiz;
	}
	
	public void procurar(int numero) {
		procurar(raiz, numero);
	}
	
	private void procurar(No raiz, int numero) {
		// FACIL: arvore vazia
		if (raiz == null) {
			System.out.println("SE FODEU !!!!NÃO achei ! ! !  Tentei " + contador + "vezes");
			contador = 0;
			return;
		}
		
		// Cenario facil: dei sorte e o numero procurado esta na raiz
		if (numero == raiz.getNumero()) {
			System.out.println("PARABÉNS ! ! ACHEI, PORRA ! ! ! ! Tentei " + contador + "vezes !");
			contador = 0;
			return;
		}
		
		//Cenario difícil: nao dei sorte de estar na raiz, tem de procurar.
		contador++;
		if (numero < raiz.getNumero()) {
			procurar(raiz.getEsquerda(), numero);
		} else {
			procurar(raiz.getDireita(), numero);
		}
	}
	
	public void navegarEmOrdem() {
		System.out.print("Navegação em ordem: ");
		navegarEmOrdem(raiz);
		System.out.println();
	}
	
	private void navegarEmOrdem(No raiz) {
		if (raiz == null) return;
		
		navegarEmOrdem(raiz.getEsquerda());
		System.out.print(raiz.getNumero());
		navegarEmOrdem(raiz.getDireita());
	}
	
}























