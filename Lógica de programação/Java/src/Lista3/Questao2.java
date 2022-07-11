package Lista3;

import java.util.*;

public class Questao2 {
	public static void main(String[] args) {
		Random gerador = new Random();
		int i,maisSaiu = 0, valor = 0, result[] = new int [10], pontuacao[] = new int [6];
        double media, soma = 0;
		
        for (i=0; i<result.length; i++) {
            result[i] = gerador.nextInt(1, 6);
            pontuacao[result[i]-1] += 1;
            soma += result[i];
		}
        System.out.println();
        media = soma/10;
        for(i=0; i<pontuacao.length; i++) {
        	if(maisSaiu < pontuacao[i]) {
        		maisSaiu = pontuacao[i];
        		valor = i;
        	}      	
        }
        System.out.println("A média dos lançamentos foram: " + media);
    	System.out.println("\nO número " + (valor+1) + " saiu " + maisSaiu + " vezes" );
	}
}