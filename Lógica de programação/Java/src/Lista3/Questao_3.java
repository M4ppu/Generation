package Lista3;

import java.util.*;

public class Questao_3 {
	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner ler = new Scanner(System.in);
		int m1[][] = new int [4][6], m2[][] = new int [4][6],
				n1[][] = new int [4][6], n2[][] = new int [4][6], i, j;
		
		for(i=0;i<m1.length;i++) {
			for(j=0;j<m1.length;j++) {
				m1[i][j] = gerador.nextInt(1, 10);
				m2[i][j] = gerador.nextInt(1, 10);				
			}			
		}
		for(i=0;i<m1.length;i++) {
			if(i == 0) {
				System.out.println("Soma: ");
			}
			for(j=0;j<m1.length;j++) {
				n1[i][j] = m1[i][j] + m2[i][j];
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();			
		}
		System.out.println();
		for(i=0;i<m1.length;i++) {
			if(i == 0) {
				System.out.println("Subtração: ");
			}
			for(j=0;j<m1.length;j++) {
				
				n2[i][j] = m1[i][j] + m2[i][j];
				System.out.print(n2[i][j] + " ");
			}
			System.out.println();
		}		
	}
}