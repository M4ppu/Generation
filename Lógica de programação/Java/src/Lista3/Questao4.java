package Lista3;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matriz[][] = new int [3][3], i, j, somaTotal = 0, somaDiagonal = 0;
		
		for(i=0; i<matriz.length; i++) {			
			for(j=0; j<matriz.length; j++) {
				matriz[i][j] = ler.nextInt();
				somaTotal += matriz[i][j];
			}
			somaDiagonal += matriz[i][i];
		}
		System.out.println("A soma dos valores da matriz é de: " + somaTotal);
		System.out.println("A soma da diagonal principal foi de: " + somaDiagonal);
	}
}