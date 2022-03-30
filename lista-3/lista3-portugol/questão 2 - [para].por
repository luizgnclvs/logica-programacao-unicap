programa
{
	
	funcao inicio()
	{
		real heights[15], smallerHeight = 0.0, tallerHeight = 0.0

		para (inteiro i = 0; i < 15; i++) {
			escreva("Insira, em metros, a altura do ", i+1, "º espécime: ")
			leia(heights[i])
			se (heights[i] <= 0.0) {
				escreva("Altura inválida! Insira uma outra altura para o espécime nº ", i+1, ": ")
				leia(heights[i])
				se (heights[i] <= 0.0) {
					i--
				}
			}
		}
			
		para (inteiro i = 0; i < 14; i++) {
			se (heights[i] > heights[i+1] e heights[i] >= tallerHeight) {
				tallerHeight = heights[i]
			} senao se (heights[i+1] >= tallerHeight) {
				tallerHeight = heights[i+1]
			} senao {
				tallerHeight = tallerHeight
			}
		}
		
		smallerHeight = tallerHeight

		para (inteiro i = 0; i <14; i++) {
			se (heights[i] < heights[i+1] e heights[i] <= smallerHeight) {
				smallerHeight = heights[i]
			} senao se (heights[i+1] <= smallerHeight) {
				smallerHeight = heights[i+1]
			} senao {
				smallerHeight = smallerHeight
			}
		}
		escreva("A menor altura dentre as inseridas é de ", smallerHeight, "m, e a maior é de ", tallerHeight, "m")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */