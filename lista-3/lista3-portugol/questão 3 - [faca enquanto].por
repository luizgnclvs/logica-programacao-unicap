programa
{
	
	funcao inicio()
	{
		inteiro count = 0, pos = 0, neg = 0
		real num, sum = 0.0, mean, posper, negper
		logico ctrl = verdadeiro
		cadeia entry

		faca {
			escreva("Insira um valor qualquer: ")
			leia(num)
			sum = sum + num
			count++
			se (num != 0.0) {
				se (num > 0.0) {
					pos++
				} senao {
					neg++
				}
			}
			
			faca {
				escreva("\nDeseja inserir mais algum valor?\n")
				escreva("1 - fazer nova entrada\n2 - encerrar operações\n\n")
				leia(entry)
			} enquanto (entry != "1" e entry != "2")
			
			se (entry == "2") {
				ctrl = falso
			}
		} enquanto (ctrl == verdadeiro)

		mean = sum / count
		posper = (100 * pos) / count //se inicializar as variáveis 'pos' e 'neg' como reais, a porcentagem retorna exata
		negper = (100 * neg) / count //mas por questões estéticas, preferi deixá-las como variáveis inteiras e ficar com a porcentagem aproximada

		escreva("\n* A média dos valores inseridos é de ", mean, ", ")
		escreva("\nsendo esta a divisão da soma total dos valores, ", sum, ", pela sua quantidade, ", count)
		escreva("\n* A quantidade de valores positivos inseridos é de ", pos, ", \nrepresentando aproximadamente ", posper, "% da quantidade total de valores") 
		escreva("\n* A quantidade de valores negativos inseridos é de ", neg, ", \nrepresentando aproximadamente ", negper, "% da quantidade total de valores")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 348; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */