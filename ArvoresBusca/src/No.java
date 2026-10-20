
public class No {
	private int numero = 0;
	private No direita = null;
	private No esquerda = null;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public No getDireita() {
		return direita;
	}
	public void setDireita(No direita) {
		this.direita = direita;
	}
	public No getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	public No(int numero, No direita, No esquerda) {
		super();
		this.numero = numero;
		this.direita = direita;
		this.esquerda = esquerda;
	}
	public No() {
		super();
	}
	
	
}
