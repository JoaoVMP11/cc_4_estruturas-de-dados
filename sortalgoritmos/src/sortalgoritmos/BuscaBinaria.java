package sortalgoritmos;

import java.util.Scanner;

public class BuscaBinaria {
	public static void main(String[] args) {
		// Declaraçao de variaveis
		Scanner leitor = new Scanner(System.in);
		int[] vetor = new int[1000000000];
		int inicio = 0;
		int fim = 0;
		int meio = 0;
		int parametroPesquisa = 0;	
		int contador = 0;
		
		// Construção do vetor
		for (int i = 0; i < vetor.length ; i++) {
			vetor[i] = i;
		}
		
		// Realização de pesquisas
		do {
			System.out.print("Digite o parametro de pesquisa: ");
			parametroPesquisa = leitor.nextInt();
			
			inicio = 0;
			fim = (vetor.length - 1);
			contador = 0;
			
			while (inicio <= fim) {
			meio = ((inicio + fim) / 2);
			contador++;
			
			if (vetor[meio] == parametroPesquisa) {
				System.out.println("ACHEI PORRA ! ! Na posição " + meio + "na tentativa " + contador);
				break;
			}else if (vetor[meio] > parametroPesquisa) {
				fim = (meio - 1);
			}else {
				inicio = (meio + 1);
			}
			}
		}while(parametroPesquisa != -1);
		leitor.close();
	}
}
