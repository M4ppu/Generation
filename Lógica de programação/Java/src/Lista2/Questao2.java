package Lista2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int i, num, contPar = 0, contImpar = 0;
		
		for(i=0;i<10;i++) {
			System.out.println("Número "+ (i+1) +": ");
			num = keyboard.nextInt();
			if(num%2==0) {
				contPar++;
			}
			else {
				contImpar++;
			}			
		}
		System.out.println("Foram ditos "+ contPar + " números pares e " + contImpar + " números ímpares");
	}
}