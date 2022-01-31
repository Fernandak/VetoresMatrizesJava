package ExerciciosVetoresMatrizes;

import java.util.Random;
import java.util.Scanner;

/*
 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
 */
public class Exercico2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] lancamentos = new int[10];
		int ocorrencia=0,maiorOcorrecia=0,loop=10;
		double soma=0;
		Random gerador = new Random();

		for (int i=0; i<loop; i++){
			System.out.println("Laçametos: ");
			ocorrencia = gerador.nextInt(6)+1;
			System.out.println(ocorrencia);
			lancamentos[i] = ocorrencia;			 
			soma += ocorrencia;
			if ( ocorrencia > maiorOcorrecia){
				maiorOcorrecia=ocorrencia;
			}

		}
		System.out.printf("\nMédia aritmética é: "+ soma/loop);
		System.out.printf("\nMaior ocorrência: "+maiorOcorrecia+"\n");

		entrada.close();
	}

}
