package Lista2;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double num, soma = 0, divisor = 0, media;
		System.out.println("Digite um número, para parar digite 0: ");
		num = keyboard.nextFloat();
		do {			
			if (num%3 == 0 && num != 0) {
				soma += num;
				divisor++;
			}
			num = keyboard.nextFloat();
		}
		while(num != 0);
		
		media = soma/divisor;
		
		System.out.println("A média dos números múltiplos de 3: " + media);
	}
}