programa
{
	
	funcao inicio()
	{
		inteiro sum = 0

		para (inteiro i = 0; i < 501; i++) {
			se (i%2 != 0 e i%3 == 0) {
				sum = sum + i
			}
		}
		escreva("A soma de todos os números ímpares e múltiplos de três dentro do escopo de 1 a 500 é de ", sum)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 259; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */