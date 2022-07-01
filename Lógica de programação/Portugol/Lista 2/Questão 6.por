programa
{
	
	funcao inicio()
	{
		inteiro numero = 0, contador = 0, somatorio = 0
		escreva("Diga um número inteiro: ")
		leia(numero)
		
		faca{			
			contador++
			somatorio = somatorio + contador
			escreva(contador)
			se(contador < numero){
				escreva(" + ")
			}						
		}
		enquanto(contador < numero)
		escreva(" = ", somatorio)		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 146; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */