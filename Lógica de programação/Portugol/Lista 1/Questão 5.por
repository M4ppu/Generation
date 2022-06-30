programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		real n1, n2, n3, media = 0.0
		
		escreva("\nEntre com a primeira nota: ")
		leia(n1)
		enquanto(n1 > 10 ou n1 < 0){
			escreva("\nNota inválida, insira novamente: ")
			leia(n1)
		}

		escreva("\nEntre com a segunda nota: ")
		leia(n2)
		enquanto(n2 > 10 ou n2 < 0){
			escreva("\nNota inválida, insira novamente: ")
			leia(n2)
		}
		

		escreva("\nEntre com a terceira nota: ")
		leia(n3)
		enquanto(n3 > 10 ou n3 < 0){
			escreva("\nNota inválida, insira novamente: ")
			leia(n3)
		}

		media = (n1*2 + n2*3 + n3*5)/10

		escreva("\nA média foi de: ",math.arredondar(media, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 593; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */