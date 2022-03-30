programa
{
	
	funcao inicio()
	{
		inteiro count = 1, pos = 0, neg = 0 
		real num, sum = 0.0, mean, posper, negper, posr, negr
		cadeia entry
	
		para (inteiro i = 0; i < count; i++) {
			escreva("Insira um valor qualquer: ")
			leia(num)
			sum = sum + num
			se (num != 0.0) {
				se (num > 0.0) {
					pos++
				} senao {
					neg++
				}
			}
			
			para (inteiro j = 0; j < 1; j++) {
				escreva("\nDeseja inserir mais algum valor?\n")
				escreva("1 - fazer nova entrada\n2 - encerrar operações\n\n")
				leia(entry)
				se (entry != "1" e entry != "2") {
					escreva("Opção inválida! Tente novamente\n")
					j--
				} senao se (entry == "1") {
					count++
				} senao {
					j = 1
				}
			}
		}
		
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
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */