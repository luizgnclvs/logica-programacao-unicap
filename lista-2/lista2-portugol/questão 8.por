programa
{
	
	funcao inicio()
	{
		inteiro num, num2, num3, decr = 0, decr2 = 0, decr3 = 0

		escreva("Insira um valor qualquer: ")
		leia(num)
		escreva("Insira um outro valor, diferente do primeiro: ")
		leia(num2)
		enquanto (num2 == num) {
			escreva("Valores idênticos! Insira outro valor: ")
			leia(num2)
		}
		escreva("Insira mais um valor, diferente dos dois primeiros: ")
		leia(num3)
		enquanto (num3 == num ou num3 == num2) {
			escreva("Valores idênticos! Insira outro valor: ")
			leia(num3)
		}
		se (num > num2 e num > num3) {
			decr = num
		} senao se (num < num2 e num < num3) {
			decr3 = num
		} senao {
			decr2 = num
		}
		se (num2 > num e num2 > num3) {
			decr = num2
		} senao se (num2 < num e num2 < num3) {
			decr3 = num2
		} senao {
			decr2 = num2
		}
		se (num3 > num e num3 > num2) {
			decr = num3
		} senao se (num3 < num e num3 < num2) {
			decr3 = num3
		} senao {
			decr2 = num3
		}
		escreva("Os valores inseridos, em ordem decrescente, são: ", decr, ", ", decr2, " e ", decr3)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 95; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */