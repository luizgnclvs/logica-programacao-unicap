programa
{
	
	funcao inicio()
	{
		real preco, precofinal = 0
		inteiro parcelas
		cadeia avista = " "

		escreva("Qual o preço do produto desejado: ")
		leia(preco)
		escreva("Deseja pacelar em quantas vezes?\n(Caso queira pagar à vista, insira o dígito '1')\n")
		leia(parcelas)
		enquanto (parcelas <= 0) {
			escreva("Oppção inválida! Tente novamente: ")
			leia(parcelas)
		}
		se (parcelas == 1) {
			escreva("Qual o método de pagamento desejado?\n(Opções válidas são 'dinheiro', 'cheque' ou 'cartão de crédito'\n")
			leia(avista)
			enquanto (avista != "dinheiro" e avista != "cheque" e avista != "cartão de crédito") {
				escreva("Opção inválida! Tente novamente: ")
				leia(avista)
			}
			se (avista == "dinheiro" ou avista == "cheque") {
				precofinal = preco - (preco / 10)
			} senao {	
			precofinal = preco - ((preco * 15) / 100)
			}
		} senao se (parcelas == 2) {
			precofinal = preco
		} senao {
			precofinal = preco + (preco / 10)
		}
		escreva("\nO preço final do seu produto é de R$", precofinal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 803; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */