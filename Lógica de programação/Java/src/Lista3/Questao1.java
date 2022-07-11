package Lista3;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, atividade [] = new int [5], pontuacao, maiorPontuacao = 0;
		
		
		for(i=0;i<atividade.length;i++) {
			pontuacao = ler.nextInt();
			while(pontuacao<0) {
				System.out.println("Valor inválido, Digite novamente: ");
				pontuacao = ler.nextInt();
			}
			atividade[i] = pontuacao;			
			
			if(pontuacao> maiorPontuacao) {
				maiorPontuacao = pontuacao;
			}
		}
		System.out.print("As pontuações foram: ");
		for(i=0;i<atividade.length;i++) {
			if(i==4) {
				System.out.println(atividade[i] + ".");
			}
			else {
				System.out.print(atividade[i] + ", ");
			}			
		}
		System.out.println("A maior pontuação foi de: " + maiorPontuacao + ".");
	}
}