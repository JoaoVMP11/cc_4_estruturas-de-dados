
public class Diretor {
	// Propriedades da classe
	private int resto = 0;
	private Diretor proximoDiretor = null;
	private No proximoNo = null;
	public Diretor(int resto, Diretor proximoDiretor, No proximoNo) {
		super();
		this.resto = resto;
		this.proximoDiretor = proximoDiretor;
		this.proximoNo = proximoNo;
	}
	public Diretor() {
		super();
	}
	public int getResto() {
		return resto;
	}
	public void setResto(int resto) {
		this.resto = resto;
	}
	public Diretor getProximoDiretor() {
		return proximoDiretor;
	}
	public void setProximoDiretor(Diretor proximoDiretor) {
		this.proximoDiretor = proximoDiretor;
	}
	public No getProximoNo() {
		return proximoNo;
	}
	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}
	
	
}
