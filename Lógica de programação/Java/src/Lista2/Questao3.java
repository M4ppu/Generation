package Lista2;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int idade = 0, cont21 = 0, cont50 = 0;
		System.out.println("Entre com uma idade, para encerrar coloque -99: ");
		while(idade != -99) {
			idade = keyboard.nextInt();
			if(idade >=0 && idade <= 21) {
				cont21++;
			}
			if(idade >= 50) {
				cont50++;
			}
		}
		System.out.println("Pessoas com idade até 21 anos: "+ cont21);
		System.out.println("Pessoas com idade acima de 50 anos: " + cont50);
	}
}