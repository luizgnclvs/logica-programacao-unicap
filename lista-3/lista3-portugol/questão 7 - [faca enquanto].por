programa
{
	
	funcao inicio()
	{
		inteiro N, i = 0

		faca {
			escreva("Insira um número de 1 a 10: ")
			leia(N)
		} enquanto (N < 1 ou N > 10)

		escreva("\nA tabuada básica de ", N, " é:\n")
		faca {
			escreva("\n", N, " * ", i, "\t = ", i*N)
			i++
		} enquanto (i < 11)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 200; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */