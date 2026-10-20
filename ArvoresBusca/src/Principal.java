import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		Arvore objArvore = new Arvore();
		int numero = 0;
		int tamanho = 150000000;
		
		// Construção da árvore
		for (int i = 0; i < tamanho ; i++) {
			objArvore.inserir((int) (tamanho * Math.random()));
		}
		
		// Realização de pesquisas.
		do {
			System.out.print("Digite um numero: ");
			numero = leitor.nextInt();
			objArvore.procurar(numero);
		} while (numero != -99);
		leitor.close();
		
		// Impressão em ordem crescente
		objArvore.navegarEmOrdem();
	}
}
