programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		real num1, num2, num3 = 0.0
		real result = 0.0
		escreva("Escreva 3 números inteiros: \n")
		leia(num1)
		leia(num2)
		leia(num3)

		result = ((math.potencia(num1 + num2, 2.0)) + (math.potencia(num2 + num3, 2.0)))/2
		escreva(math.arredondar(result, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 331; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */