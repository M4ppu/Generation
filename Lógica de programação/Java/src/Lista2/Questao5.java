package Lista2;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num, soma = 0;
		
		System.out.println("Digite um número, para parar digite 0: ");
		do {
			num = keyboard.nextInt();
			soma += num;
		}
		while(num != 0);
		
		System.out.println("A soma de todos os números digitados foi de: " + soma);
	}
}