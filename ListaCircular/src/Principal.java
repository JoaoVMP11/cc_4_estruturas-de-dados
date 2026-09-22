import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		// Declaracao de variáveis
		Scanner leitor = new Scanner(System.in);
		Lista objLista = new Lista();
		int opcao = 0;
		
		// ´Processamento
		while (opcao != 5) {
			System.out.println("===============");
			System.out.println("Menu de opcoes  ");
			System.out.println("===============");
			System.out.println("1 - inserir");
			System.out.println("2 - excluir");
			System.out.println("3 - imprimir");
			System.out.println("4 - Cem mil");
			System.out.println("5 - sair");
			System.out.println("Digite sua opcao");
			opcao = leitor.nextInt();
			
			switch (opcao) {
			case 1:
			System.out.print("digite um número");
			objLista.inserir(leitor.nextInt());
			
			case 2:
				System.out.print("Digite um número");
				objLista.excluir(leitor.nextInt());
				break;
				
			case 3:
				objLista.imprimir();
				break;
			case 4:
				for (int i = 0; i <100000; i++) {
					objLista.inserir(i);
				}
				break;
			}
		}
		leitor.close();
		
	}
}
