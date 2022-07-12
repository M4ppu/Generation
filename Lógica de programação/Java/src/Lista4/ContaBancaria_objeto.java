package Lista4;

import java.util.Scanner;

public class ContaBancaria_objeto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();

		double saldo = 0, dep = 0, saq = 0;
		int i, j;

		while (true) {
			System.out.println("\n1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Saldo");
			System.out.println("4 - Sair");
			System.out.print("Digite sua opção: ");
			i = ler.nextInt();
			while (i != 1 && i != 2 && i !=3 && i !=4) {
				System.out.println("\n1 - Depositar");
				System.out.println("2 - Sacar");
				System.out.println("3 - Saldo");
				System.out.println("4 - Sair");
				System.out.print("Digite sua opção: ");
				i = ler.nextInt();
			}

			if (i == 1) {
				System.out.print("\nValor a ser depositado: R$");
				dep = ler.nextDouble();
				conta.deposito(dep);
			}
			
			else if (i == 2) {				
				if (conta.getSaldo() > 0) {
					System.out.print("\nValor do saque: R$");
					saq = ler.nextDouble();
					while (saq > conta.getSaldo()) {
						System.out.println("\nValor do saque não disponível em conta.");
						saq = ler.nextDouble();
						}
					conta.saque(saq);
					}
				
				else
					System.out.println("\nSem saldo na conta.");				
				}
			
			else if(i == 3)
				System.out.printf("\nSaldo de: R$%.2f\n",conta.getSaldo());			

			else if (i == 4)
				break;
		}		
		
		System.out.println();
		conta.estado();
		System.out.printf("Saldo na conta: R$%.2f", conta.getSaldo());
	}
}