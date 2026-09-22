
public class Principal {
	public static void main(String[] args) {
		MatrizEsparsa objMatrizEsparsa = new MatrizEsparsa(3);
		
		for (int i = 0; i < 50; i++) {
			objMatrizEsparsa.inserir(i);
		}
		objMatrizEsparsa.imprimir();
		
		objMatrizEsparsa.excluir(47);
		objMatrizEsparsa.excluir(2);
		objMatrizEsparsa.excluir(46);
		objMatrizEsparsa.excluir(4);
		objMatrizEsparsa.excluir(42);
		objMatrizEsparsa.excluir(6);
		
		objMatrizEsparsa.imprimir();
	}
}
