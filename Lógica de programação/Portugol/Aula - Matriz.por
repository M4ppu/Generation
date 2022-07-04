programa
{
	
	funcao inicio()
	{
		real numeros [2][3], somaNumeros = 0.0, mediaNumeros
		inteiro linha, coluna

		para(linha=0;linha<2;linha++){
			para(coluna=0;coluna<3;coluna++){
				escreva("\nEntre com um número qualquer: ")
				leia(numeros[linha][coluna])
				somaNumeros = somaNumeros + numeros[linha][coluna]
			}
		}
		mediaNumeros = somaNumeros/6
		escreva("\nMédia dos números lidos foi de: ", mediaNumeros)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 420; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */