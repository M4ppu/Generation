programa
{
	
	funcao inicio()
	{
		inteiro segundos = 0
		leia(segundos)
		inteiro hora, min, sec = 0

		hora = segundos/3600
		segundos = segundos%3600
		min = segundos/60
		segundos = segundos%60
		sec = segundos
		
		escreva("\n", hora, ":", min, ":", sec)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */