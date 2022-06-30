programa
{
	
	funcao inicio()
	{
		inteiro ano, mes, dias = 0

		escreva("Diga sua idade em dias: \n")
		leia (dias)

		ano = dias/365
		dias = dias%365
		mes = dias/30
		dias = dias%30

		escreva("Sua idade é: ", ano, " ano(s) ", mes, " (mes(es) e ",  dias, " dia(s)")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 249; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */