programa
{
	
	funcao inicio()
	{
		inteiro A, R, i = 1

		escreva("Insira um valor inicial para sua P.A: ")
		leia(A)
		escreva("\nAgora insira um valor para a razão da sua P.A: ")
		leia(R)
		escreva("\nP.A = {", A)
		enquanto (i < 10) {
			escreva(", ", A + (R * i))
			i++
		}
		escreva("}")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 299; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */