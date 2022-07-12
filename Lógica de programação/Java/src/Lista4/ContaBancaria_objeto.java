package Lista4;

import java.util.Scanner;

public class ContaBancaria_objeto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
		
		double saldo = 0, dep = 0, saq;
		int i;
		
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.println("Quer depositar? ");		
		i = ler.nextInt();
		while(i != 1 && i != 2) {
			System.out.println("Entrada incorreta");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			System.out.println("Quer depositar? ");
			i = ler.nextInt();
		}
		if(i == 1) {
			System.out.print("Valor a ser depositado: ");
			dep = ler.nextDouble();
			conta.deposito(dep);
		}
		
		i = 0;
		
		if(dep > 0) {
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			System.out.print("Quer sacar? ");
			i = ler.nextInt();
			while(i != 1 && i != 2) {
				System.out.println("Entrada incorreta");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				System.out.print("Quer sacar? ");
				i = ler.nextInt();
			}
			if(i == 1) {
				System.out.println("Valor do saque: ");
				saq = ler.nextDouble();
				while(saq > dep) {
					System.out.println("Valor do saque não disponível em conta");
					saq = ler.nextDouble();
				}
				conta.saque(saq);
			}			
		}		
		conta.estado();
		System.out.printf("Saldo na conta: R$%.2f", conta.getSaldo());
	}
}