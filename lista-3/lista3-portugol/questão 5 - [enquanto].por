programa
{
	
	funcao inicio()
	{
		inteiro num, sum = 0, count = 0, even = 0, sumEven = 0, odd = 0, mean, meanEven
		logico ctrl = verdadeiro

		enquanto (ctrl == verdadeiro) {
			escreva("\nInsira um número positivo:")
			escreva("\n(Digite '0' para encerrar operações)\n")
			leia(num)
			se (num == 0) {
				ctrl = falso
			} senao se (num < 0) {
				escreva("\nOpção inválida! Tente novamente\n")
			} senao {
				count++
				sum = sum + num
				se (num%2 == 0) {
					even++
					sumEven = sumEven + num
				} senao {
					odd++
				}
			}
		}

		mean = sum / count
		meanEven = sumEven / even

		escreva("\n\nDos valores inseridos, ", even, " são pares")
		escreva("\nDos valores inseridos, ", odd, " são ímpares")
		escreva("\nA média dos valores pares é de aproximadamente ", meanEven)
		escreva("\nEnquanto a média geral dos valores é de cerca de ", mean)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */