package ExerciciosVetoresMatrizes;

import java.util.Scanner;

/*
 * 4. Crie um programa que receba valores do usuário para preencher
 *uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a 
 *soma dos valores da primeira diagonal, ou seja, diagonal principal.
 */
public class exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int l,c, totaldiagonal=0, soma=0;

		for (l=0; l<3; l++) {   
			for(c=0; c<3; c++) {  
				System.out.printf("Posição [ "+l+" ][ "+c+" ]:");
				matriz[l][c] = entrada.nextInt();
			}
		}

		for(l=0; l<3; l++) {
			for(c=0; c<3; c++){
				System.out.printf("{ "+ matriz[l][c]+ " }");
			}
			System.out.println("\n");
		}
		for(l=0; l<3; l++) {
			for(c=0; c<3; c++){
				if (l == c){
					totaldiagonal = totaldiagonal + matriz[l][c];         	
				}
			}
		}		
		System.out.printf("\nA soma da diagonal principal: "+totaldiagonal);

		for(l=0; l<3; l++) {
			for(c=0; c<3; c++){
				soma= soma + matriz[l][c]  ; 
			}
		}
		System.out.printf("\nA soma dos valores: "+soma);
	}
}