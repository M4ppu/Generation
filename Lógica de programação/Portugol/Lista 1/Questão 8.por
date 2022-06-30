programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		real custoFab, porcentDistrib, imposto, carroNovo = 0.0

		escreva("Diga o custo de fabricação de um carro: ")
		leia(custoFab)
		
		porcentDistrib = custoFab * 0.28
		imposto = custoFab * 0.45
		carroNovo = custoFab + porcentDistrib + imposto

		escreva("Custo de um carro novo: ", math.arredondar(carroNovo, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 386; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */