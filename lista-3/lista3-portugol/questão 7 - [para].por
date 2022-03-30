programa
{
	
	funcao inicio()
	{
		inteiro N

		para (inteiro i = 0; i < 1; i++) {
			escreva("Insira um número de 1 a 10: ")
			leia(N)
			se (N < 1 ou N > 10) {
				escreva("\nEntrada inválida. Tente novamente.\n\n")
				i--
			} senao {
				escreva("\nA tabuada básica de ", N, " é:\n")
				para (inteiro j = 0; j < 11; j++) {
					escreva("\n", N, " * ", j, "\t = ", j*N)
				}
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */