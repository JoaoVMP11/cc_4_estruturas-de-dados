package arvoreAVL;

public class No {
	private int numero = 0;
	private No esquerda = null;
	private No direita = null;
	private int altura = 0;
	
	public No(int numero, No esquerda, No direita, int altura) {
		super();
		this.numero = numero;
		this.esquerda = esquerda;
		this.direita = direita;
		this.altura = altura;
	}
	public No() {
		super();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public No getEsquerda() {
		return esquerda;
	}
	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}
	public No getDireita() {
		return direita;
	}
	public void setDireita(No direita) {
		this.direita = direita;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
}
