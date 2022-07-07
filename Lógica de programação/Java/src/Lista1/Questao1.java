package Lista1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double num1, num2, num3, maior;
		
		System.out.println("Entre com o primeiro número: ");
		num1 = keyboard.nextFloat();
		System.out.println("Entre com o segundo número: ");
		num2 = keyboard.nextFloat();
		System.out.println("Entre com o terceiro número: ");
		num3 = keyboard.nextFloat();
		
		
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("O primeiro é o maior");
			}
			else {
				System.out.println("O terceiro é o maior");
			}
		}
		else {
				if(num2 < num3) {
					System.out.println("O terceiro é o maior");
				}
				else {
					System.out.println("O segundo é o maior");
				}
			}
		
	}

}
