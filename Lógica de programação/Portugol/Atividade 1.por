programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		cadeia nome = "Luiza Lima", endereco = "Rua Tudo Bem, 12"
		inteiro idade = 24, op
		real altura = 1.7, n1, n2, n3, media

		escreva("Nome: ",nome, "\nEndereço: ", endereco)
		escreva("\nIdade: ", idade, " anos")
		escreva("\nAltura: ", altura, " m")
		
		escreva("\nEntre com a primeira nota: ")
		leia(n1)
		enquanto(n1 > 10){
			escreva("\nNota inválida, insira novamente: ")
			leia(n1)
		}

		escreva("\nEntre com a segunda nota: ")
		leia(n2)
		enquanto(n1 > 10){
			escreva("\nNota inválida, insira novamente: ")
			leia(n2)
		}
		

		escreva("\nEntre com a terceira nota: ")
		leia(n3)
		enquanto(n1 > 10){
			escreva("\nNota inválida, insira novamente: ")
			leia(n3)
		}

		media = (n1 + n2 + n3)/3

		escreva("\nA média da aluna: ", nome, " foi de: ",math.arredondar(media, 2))

		se(media >= 7.0 e media <= 10.0){
			escreva("\nAluna aprovada!!")
		}
		senao se(media >= 5.0 e media < 7.0){
			escreva("\nAluna de Recuperação!!!")
		}
		senao {
			escreva("\nAluna reprovada!!")
		}

		escreva("\n\t\tEscolha um elogio...")
		escreva("\n1- Mulheres maravilhosas")
		escreva("\n2- Turma focada")
		escreva("\n3- Mulheres muito inteligentes")
		escreva("\n4- Determinadas")
		escreva("\nDigite sua opção: ")
		leia(op)
		
		enquanto(op > 4){
				escreva("\nOpção inválida! Insira novamente: ")
				leia(op)
				}

		escolha(op){				
			caso 1:
				escreva("\nMulheres maravilhosas")
				pare
			caso 2:
				escreva("\nTurma focada")
				pare
			caso 3:
				escreva("\nMulheres muito inteligentes")
				pare
			caso 4:
				escreva("\nDeterminadas")
				pare		
		 		
		}
			

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 51; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */