programa
{
	
	funcao inicio()
	{
		inteiro A, R

		escreva("Insira um valor inicial para sua P.A: ")
		leia(A)
		escreva("\nAgora insira um valor para a razão da sua P.A: ")
		leia(R)
		escreva("\nP.A = {", A)
		para (inteiro i = 1; i < 10; i++) {
			escreva(", ", A + (R * i))
		}
		
		escreva("}")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 52; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */