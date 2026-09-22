public class MatrizEsparsa {
// Propriedades da classe
	
	private Diretor cabeca = null;
	private int modulo = 0;
	
	// Método construtor da classe
	
	public MatrizEsparsa(int modulo) {
		super();
		this.modulo = modulo;
	}
	
	// Métodos da classe
	private Diretor procurarDiretor(int numero) { // se não encontrar, cria
		int resto = (numero % modulo);
		
		// Procura do diretor correto
		Diretor ponteiro = cabeca;
		while ((ponteiro != null) && (ponteiro.getResto() != resto)) {
			ponteiro = ponteiro.getProximoDiretor();
		}
		// Cenário facil: diretor encontrado
		if (ponteiro != null) {
			return ponteiro;
		}
		
		// Cenário fácil: diretor NÃO encontrado
		cabeca = new Diretor(resto, cabeca, null);
		return cabeca;
	}
	
	public void inserir (int numero) {
		Diretor ponteiro = procurarDiretor(numero);
		
		ponteiro.setProximoNo(new No(numero, ponteiro.getProximoNo()));
	}
	
	public void excluir(int numero) {
		Diretor ponteiroDiretor = procurarDiretor(numero);
		
		// Caso MUITO FÁCIL: lista horizontal vazia
		if (ponteiroDiretor.getProximoNo() == null) {
			return;
		}
		
		// Caso fácil: excluir o primeiro
		if (ponteiroDiretor.getProximoNo().getNumero() == numero) {
			ponteiroDiretor.setProximoNo(ponteiroDiretor.getProximoNo().getProximo());
			return;
		}
		// Procura nó a ser excluído
		No ponteiroNo = ponteiroDiretor.getProximoNo();
		// Para no anterior do No a ser excluído
		while ((ponteiroNo.getProximo().getProximo() != null) && (ponteiroNo.getProximo().getNumero() != numero)) {
			ponteiroNo = ponteiroNo.getProximo();
		}
		
		// Caso difícil: não encontrado
		if (ponteiroNo.getProximo() == null) {
			return;
		}
		
		// Caso difícil: encontrado
		ponteiroNo.setProximo(ponteiroNo.getProximo().getProximo());
	}
	
	public void imprimir() {
		Diretor ponteiroDiretor = cabeca;
		System.out.println("Resto \t Números");
		while (ponteiroDiretor != null) {
			System.out.print(ponteiroDiretor.getResto() + " \t");
			No ponteiroNo = ponteiroDiretor.getProximoNo();
			while (ponteiroNo != null) {
				System.out.print(ponteiroNo.getNumero() + ", ");
				ponteiroNo = ponteiroNo.getProximo();
			}
			System.out.println();
			ponteiroDiretor = ponteiroDiretor.getProximoDiretor();
		}
	}
}



















