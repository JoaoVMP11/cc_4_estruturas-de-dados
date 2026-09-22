package arvore5;

public class Arvore {
	// Propriedades da classe
	private No raiz = null;
	
	// Métodos da classe
	
	public void inserir(int numero) {
		raiz = inserir(raiz, numero);
	}
	
	private No inserir(No raiz, int numero) {
		// Cenario muito facil: arvore vazia
		if (raiz == null) {
			return new No(numero, null, null, null, null, null);
		}
		
		int sorteio = (1 + ((int) (5 * Math.random())));
		
		if (sorteio == 1) {
			raiz.setFilho1(inserir(raiz.getFilho1(), numero));
		} else if (sorteio == 2) {
			raiz.setFilho2(inserir(raiz.getFilho2(), numero));
		}else if (sorteio == 3) {
			raiz.setFilho2(inserir(raiz.getFilho3(), numero));
		}else if (sorteio == 4) {
			raiz.setFilho2(inserir(raiz.getFilho4(), numero));
		}else {
			raiz.setFilho2(inserir(raiz.getFilho5(), numero));
		}
		
		return raiz;
	}
	
	public void imprimir() {
		imprimir(raiz, "");
	}
	
	private void imprimir(No raiz, String identacao) {
		if (raiz == null) return;
		
		System.out.println(identacao + raiz.getNumero());
		imprimir(raiz.getFilho1(), identacao + "---");
		imprimir(raiz.getFilho2(), identacao + "---");
		imprimir(raiz.getFilho3(), identacao + "---");
		imprimir(raiz.getFilho4(), identacao + "---");
		imprimir(raiz.getFilho5(), identacao + "---");
	}
}
