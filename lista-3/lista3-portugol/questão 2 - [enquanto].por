programa
{
	
	funcao inicio()
	{
		real heights[15], smallerHeight = 0.0, tallerHeight = 0.0
		inteiro i = 0
		
		enquanto (i < 15) {
			escreva("Insira, em metros, a altura do ", i+1, "º espécime: ")
			leia(heights[i])
			enquanto (heights[i] <= 0.0) { 
				escreva("Altura inválida! Insira uma outra altura para o espécime nº ", i+1, ": ")
				leia(heights[i])
			}
			se (heights[i] >= tallerHeight) {
				tallerHeight = heights[i]
			}
			se (i == 0) {
				smallerHeight = heights[0]
			}
			se (heights[i] <= smallerHeight) {
				smallerHeight = heights[i]
			}
			i++
		}
		escreva("A menor altura dentre as inseridas é de ", smallerHeight, "m, e a maior é de ", tallerHeight, "m")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 497; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */