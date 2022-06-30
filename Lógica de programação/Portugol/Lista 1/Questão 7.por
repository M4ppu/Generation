programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		real a, b, c, d, i, f, x, y = 0.0
		escreva("Passe os coeficientes: A, B, C, D, E e F\n")
		leia(a, b, c, d, i, f)
		
		x = (c*i - b*f)/(a*i - b*d)
		y = (a*f - c*d)/(a*i - b*d)

		escreva("Valor X: ", math.arredondar(x, 2), "\nValor Y: ", math.arredondar(y, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 49; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */