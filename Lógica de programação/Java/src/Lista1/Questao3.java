package Lista1;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Coloque sua idade: ");
		idade = keyboard.nextInt();
		
		while(idade<10 || idade >25) {
			System.out.println("Insira uma idade de 10 até 25 anos: ");
			idade = keyboard.nextInt();
		}
		if(idade >=10 && idade <=14) {
			System.out.println("Infantil");
		}
		else if(idade>=15 && idade<= 17) {
			System.out.println("Juvenil");
		}
		else {
			System.out.println("Adulto");
		}
	}

}
