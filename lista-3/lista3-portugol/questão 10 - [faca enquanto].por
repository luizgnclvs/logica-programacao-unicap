programa
{
	
	funcao inicio()
	{
		inteiro A, fat, i = 1

		escreva("Insira um valor para que seja calculado seu fatorial: ")
		leia(A)
		escreva("O fatorial de ", A, " é:\n", A, "! = ", A)
		i = A - 1
		fat = A
		faca {
			escreva(" * ", i)
			fat = fat * i
			i--
		} enquanto (i > 0)

		escreva(" = ", fat)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 314; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */