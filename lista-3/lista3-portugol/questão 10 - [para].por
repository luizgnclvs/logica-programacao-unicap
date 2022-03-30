programa
{
	
	funcao inicio()
	{
		inteiro A, fat

		escreva("Insira um valor para que seja calculado seu fatorial: ")
		leia(A)
		escreva("O fatorial de ", A, " é:\n", A, "! = ", A)
		fat = A
		para (inteiro i = A - 1; i > 0; i--) {
			escreva(" * ", i)
			fat = fat * i
		}

		escreva(" = ", fat)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 54; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */