package ExerciciosVetoresMatrizes;

import java.util.Random;
import java.util.Scanner;

/*
 * 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
 */
public class Exercico2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] lancamentos = new int[10];
		int ocorrencia=0,maiorOcorrecia=0,loop=10;
		double soma=0;
		Random gerador = new Random();

		for (int i=0; i<loop; i++){
			System.out.println("La�ametos: ");
			ocorrencia = gerador.nextInt(6)+1;
			System.out.println(ocorrencia);
			lancamentos[i] = ocorrencia;			 
			soma += ocorrencia;
			if ( ocorrencia > maiorOcorrecia){
				maiorOcorrecia=ocorrencia;
			}

		}
		System.out.printf("\nM�dia aritm�tica �: "+ soma/loop);
		System.out.printf("\nMaior ocorr�ncia: "+maiorOcorrecia+"\n");

		entrada.close();
	}

}
