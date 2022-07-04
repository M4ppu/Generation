programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		inteiro atividade [5], pontuacao, maiorPontuacao = 0, i
		

		para(i=0;i<=4;i++){
			escreva("\nDiga o número ", i+1, ": ")
			leia(pontuacao)
			atividade[i] = pontuacao
			se(i == 0){
				maiorPontuacao = pontuacao
			}
			se(pontuacao > maiorPontuacao){
				maiorPontuacao = pontuacao
			}
		}
		para(i=0;i<=4;i++){
			escreva("\nPontuação ", i+1, " : ", atividade[i])
		}
		escreva("\n\nA maior pontuação foi de: ", maiorPontuacao)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 417; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {i, 7, 56, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */