package Lista1;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double num1, num2, num3, maior, meio, menor;
		
		System.out.println("Entre com o primeiro número: ");
		num1 = keyboard.nextFloat();
		System.out.println("Entre com o segundo número: ");
		num2 = keyboard.nextFloat();
		System.out.println("Entre com o terceiro número: ");
		num3 = keyboard.nextFloat();
		
		if(num1 > num2) {
			if(num1 > num3) {
				maior = num1;
				if(num2 > num3) {
					meio = num2;
					menor = num3;									
				}
				else {
					meio = num3;
					menor = num2;
				}
			}
			else {
				maior = num3;
				if(num2 > num1) {
					meio = num2;
					menor = num1;
				}
				else {
					meio = num1;
					menor = num2;
				}
			}
		}
		else{
				if(num2 < num3) {
					maior = num3;
					if(num2 > num1) {
						meio = num2;
						menor = num1;
					}
					else {
						meio = num1;
						menor = num2;
					}
				}
				else {
					maior = num2;
					if(num1 > num3) {
						meio = num1;
						menor = num3;
					}
					else {
						meio = num3;
						menor = num1;
					}
				}
			}
		
		
		System.out.println("Ordem crescente: "+ menor +", "+ meio +", "+ maior);

	}

}
