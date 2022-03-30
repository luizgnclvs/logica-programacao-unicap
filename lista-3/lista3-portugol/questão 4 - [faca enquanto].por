programa
{
	inclua biblioteca Mouse
	inclua biblioteca Internet
	
	funcao inicio()
	{
		inteiro range1 = 0, range2 = 0, range3 = 0, range4 = 0, num
		logico ctrl = verdadeiro
		
		faca {
			escreva("\nInsira um valor qualquer:")
			escreva("\n(Caso queira encerrar a operação de entrada, insira número negativo qualquer)\n")
			leia(num)
			se (num < 0) {
				ctrl = falso
				escreva("\nOperação de entrada encerrada.\n")
			} senao {
				se (num < 26) {
					range1++
				} senao se (num < 51) {
					range2++
				} senao se (num < 76) {
					range3++
				} senao se (num < 101) {
					range4++
				} senao {
					ctrl = verdadeiro
				}
			}
		} enquanto (ctrl == verdadeiro)

		escreva("\nDos valores inseridos, ", range1, " se encontram no intervalo de [0-25]\n")
		escreva("Dos valores inseridos, ", range2, " se encontram no intervalo de [26-50]\n")
		escreva("Dos valores inseridos, ", range3, " se encontram no intervalo de [51-75]\n")
		escreva("Dos valores inseridos, ", range4, " se encontram no intervalo de [76-100]\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */