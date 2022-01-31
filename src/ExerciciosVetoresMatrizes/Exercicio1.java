package ExerciciosVetoresMatrizes;

import java.util.Scanner;

/*
 * 1. Fa�a um programa que crie um vetor por leitura com 5 valores de
 *pontua��o de uma atividade e o escreva em seguida.
 * Encontre ap�s a maior pontua��o e a apresente.
 */

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] pontuacao = new int[5];
		int maiorpontuacao = 0;

		for (int i=0; i <5; i++) {
			System.out.println("Pontua��es das atividades: ");
			pontuacao[i] = entrada.nextInt();
			
			if (pontuacao[i] > maiorpontuacao){

				maiorpontuacao = pontuacao[i];
			}
		}
		System.out.println("A maior pontua��o �: "+maiorpontuacao);
		entrada.close();
	}
}
