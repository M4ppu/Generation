package Lista1;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double num;
		
		System.out.println("Coloque um número qualquer: ");
		num = keyboard.nextFloat();
		
		if(num%2==0) {
			System.out.println("O número é par e sua raiz quadrada é: " + Math.sqrt(num));
		}
		else {
			System.out.println("O número é ímpar e ele elevado ao quadrado é: " + Math.pow(num, 2));
		}

	}

}
