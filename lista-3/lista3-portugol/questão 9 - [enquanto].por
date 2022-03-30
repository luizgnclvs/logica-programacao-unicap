programa
{
	
	funcao inicio()
	{
		inteiro A, R, p, i = 1

		escreva("Insira um valor inicial para sua P.G: ")
		leia(A)
		escreva("\nAgora insira um valor para a razão da sua P.G: ")
		leia(R)
		p = A * R
		escreva("\nP.G = {", A)
		enquanto ( i < 10) {
			escreva(", ", p)
			p = p * R
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