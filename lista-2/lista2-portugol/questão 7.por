programa
{
	
	funcao inicio()
	{
		inteiro var, var2

		escreva("Insira um número qualquer: ")
		leia(var)
		se (var %2 == 0) {
			var2 = var + 5
		} senao {
			var2 = var + 8
		}
		escreva("O resultado da operação é de: ", var2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 142; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */