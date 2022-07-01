programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		inteiro numero = 0, contador = 0
		real numeroMedia = 0.0, numeroTotal = 0.0

		escreva("\nDigite varios númeors, para parar coloque um negativo!\n")
		leia(numero)
		
		enquanto(numero>=0){			
			numeroTotal = numeroTotal + numero
			contador++
			leia(numero)
		}
		numeroMedia = math.arredondar(numeroTotal/contador, 2)
		
		escreva("\nSomátorio de todos os números: ", numeroTotal)
		escreva("\nMédia de todos os números dito: ", numeroMedia)
		escreva("\nForam lidos ", contador, " números")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 573; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */