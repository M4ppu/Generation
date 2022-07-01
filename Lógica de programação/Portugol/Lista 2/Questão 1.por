programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		real salario, salarioMedia, filho, filhoMedia, filhoTotal = 0.0
		real salarioMaior = 0.0
		real salarioTotal = 0.0
		real salarioMenor100 = 0.0
		real salarioPercentual100 = 0.0
		inteiro i
		
		para(i=0;i<20;i++){
			escreva("\n\n\tHabitante ",i+1,"\n")
			escreva("\nNúmero de filhos: ")
			leia(filho)
			enquanto(filho < 0){
				escreva("\nNão existe filho negativo!!")
				leia(filho)
			}
			
			escreva("\nSalário: R$")
			leia(salario)
			enquanto(salario < 0){
				escreva("\nNão existe salário negativo!!")
				leia(salario)
			}

			filhoTotal = filhoTotal + filho
			salarioTotal = salarioTotal + salario

			se(salarioMaior < salario){
				salarioMaior = salario
			}
			se(salario <= 100){
				salarioMenor100++
			}		
		}
		salarioMedia = math.arredondar(salarioTotal/i, 2)
		filhoMedia = math.arredondar(filhoTotal/i, 2)
		salarioPercentual100 = math.arredondar((salarioMenor100*100)/i, 20)
		escreva("\nMédia salarial da população: R$", salarioMedia)
		escreva("\nMédia do número de filhos: ", filhoMedia, " filhos")
		escreva("\nMaior salário: R$", salarioMaior)
		escreva("\nPercentual de pessoas com salário até RS100,00: ", salarioPercentual100, "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1246; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */