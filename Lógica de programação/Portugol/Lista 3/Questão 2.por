programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro dado[10], i, pontuacao[6], maior = 0, valor = -1
		real somaMedia = 0.0, media = 0.0

		para(i=0;i<6;i++){
			pontuacao[i] = 0
		}
		
		para(i=0;i<10;i++){
			dado[i] = Util.sorteia(1, 6)
			pontuacao[dado[i]-1] += 1
			somaMedia += dado[i]
					
		}
		para(i=0;i<6;i++){
			se(maior < pontuacao[i]){
				maior = pontuacao[i]
				valor = i				
			}		
		}
		
		media = somaMedia/10		
		
		escreva("\nA média dos lançamentos foi de: ", media)
		escreva("\nO número ", valor+1, " saiu ", maior, " vezes.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 447; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {dado, 7, 10, 4}-{pontuacao, 7, 23, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */