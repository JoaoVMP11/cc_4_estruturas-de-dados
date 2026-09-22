package sortalgoritmos;

import java.util.Scanner;

public class BuscaExaustiva {
	// Declaração de variáveis
	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	int[] vetor = new int[1000000000];
	int parametroPesquisa = 0;
	
	//Construção vetor
	for (int i = 0; i < vetor.length; i++) {
		vetor[i] = ((int) (vetor.length * Math.random()));
	}
		
		
	// Realização de pesquisas
		do {
			System.out.print("Digite um parametro de pesquisa: ");
			parametroPesquisa = leitor.nextInt();
			for (int i = 0 ; i < vetor.length; i++) {
				
			if (parametroPesquisa == vetor[i]) {
				System.out.println("ACHEI PORRA ! ! ! ! Na posição  "+ i);
				break;
			}
			}
		}while (parametroPesquisa != -1);
		
		leitor.close();
		
		}

	}

