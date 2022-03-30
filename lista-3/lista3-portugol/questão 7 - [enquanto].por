programa
{
	
	funcao inicio()
	{
		inteiro N, i = 0

		escreva("Insira um número de 1 a 10: ")
		leia(N)
		enquanto (N < 1 ou N > 10) {
			escreva("\nEntrada inválida. Tente novamente: ")
			leia(N)
		}

		escreva("\nA tabuada básica de ", N, " é:\n")
		enquanto (i < 11) {
			escreva("\n", N, " * ", i, "\t = ", i*N)
			i++
		}
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