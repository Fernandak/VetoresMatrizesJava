package ExerciciosVetoresMatrizes;

import java.util.Random;

/*
 * 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
 */
public class Exercicio3 {

	public static void main(String[] args) {
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		int l, c;
		Random gerador = new Random();


		for(l=0; l<4; l++) {
			for(c=0; c<6; c++) {
				N1[l][c] =gerador.nextInt(10);	
				System.out.printf("{ "+ N1[l][c]+ " }");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		for(l=0; l<4; l++) {
			for(c=0; c<6; c++) {
				N2[l][c] =gerador.nextInt(10);
				System.out.printf("{ "+ N2[l][c]+ " }");
			}
			System.out.print("\n");
		}
		System.out.print("\n");

		for(l=0; l<4; l++) {
			for(c=0; c<6; c++) {
				M1[l][c] = N1[l][c] + N2[l][c]	;
			}
		}

		for(l=0; l<4; l++) {
			for(c=0; c<6; c++){
				System.out.printf("{ "+ M1[l][c]+" }");
			}
			System.out.print("\n");
		}

		System.out.print("\n");
		for(l=0; l<4; l++) {
			for(c=0; c<6; c++){			
				M2[l][c] = N1[l][c] - N2[l][c];
			}
		}

		for(l=0; l<4; l++) {
			for(c=0; c<6; c++){
				System.out.printf("{ "+ M2[l][c]+ " }");
			}
			System.out.print("\n");
		}				

	}

}
