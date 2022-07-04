programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		real matriz[3][3], somaTotal = 0.0, somaDiagonal = 0.0
		inteiro i, j

		para(i=0;i<3;i++){
			para(j=0;j<3;j++){
				escreva("\nEscreva o valor da matriz na poisção ", i+1, "x", j+1, ": ")
				leia(matriz[i][j])				
			}
		}
		para(i=0;i<3;i++){
			somaDiagonal += matriz[i][i]
			para(j=0;j<3;j++){
				somaTotal += matriz[i][j]				
			}
		}		
		escreva("\nSoma do valor total: ", somaTotal)
		escreva("\nSoma dos valores na diagonal: ", somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */