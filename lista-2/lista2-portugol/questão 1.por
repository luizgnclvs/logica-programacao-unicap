programa
{
	
	funcao inicio()
	{
		inteiro A, B, C
		
		escreva("Insira abaixo dois valores de números inteiros\n")
		leia(A, B)
		escreva("Agora insira um outro valor\n")
		leia(C)
		se (C > A+B) {
			escreva("A soma dos seus valores iniciais, ", A+B, ", é menor que o último valor inserido")
		} senao {
			escreva("Parâmetros não atingidos. Tente novamente :)")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 344; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */