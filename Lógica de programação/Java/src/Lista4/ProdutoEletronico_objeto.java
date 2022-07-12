package Lista4;

import java.util.Scanner;

public class ProdutoEletronico_objeto {
	public static void main(String[] args) {
		ProdutoEletronico geladeira = new ProdutoEletronico();
		Scanner ler = new Scanner(System.in);
		int modo, potencia, tempoDeUso;
		
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
		System.out.print("A geladeira está ligada? ");
		modo = ler.nextInt();
		while(modo != 1 && modo != 2) {
			System.out.println("Entrada incorreta!");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			System.out.print("A geladeira está ligada? ");
			modo = ler.nextInt();
		}
		
		System.out.print("Qual a potência: ");
		potencia = ler.nextInt();
		while(potencia <= 0) {
			System.out.println("Valor incorreto ou negativo");
			System.out.print("Qual a potência: ");
			potencia = ler.nextInt();
		}
		geladeira.setPotencia(potencia);
		
		System.out.print("Tempo de uso diário: ");
		tempoDeUso = ler.nextInt();
		while(tempoDeUso < 0 || tempoDeUso > 24) {
			System.out.println("Tempo incorreto");
			System.out.print("Tempo de uso diário: ");
			tempoDeUso = ler.nextInt();
		}
		
		geladeira.setCusto_mensal((((tempoDeUso * potencia)/1000) * 0.74)*30);
		
		if(modo == 1) 
			geladeira.setLigado(true);
		else
			geladeira.setLigado(false);
		
		System.out.println();
		geladeira.estado();
		System.out.println("Potência de: " + geladeira.getPotencia() + "w");
		System.out.printf("Custo mensal de R$%.2f", geladeira.getCusto_mensal());
	}
}