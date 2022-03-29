programa
{
	
	funcao inicio()
	{
		logico x, y

		escreva("Atribua o valor de 'verdaeiro' ou 'falso' à sua primeira variável: ")
		leia(x)
		escreva("Agora faça o mesmo com a variável de número 2: ")
		leia(y)
		se (x == verdadeiro e y == verdadeiro) {
			escreva("\nAmbas variáveis possuem o valor 'verdadeiro'")
		} senao se (x == falso e y == falso) {
			escreva("Ambas variáveis possuem o valor 'falso'")
		} senao {
			se (x == verdadeiro) {
				escreva("\nSomente a primeira variável é verdadeira") 
			} senao {
				escreva("\nSomente a segunda variável é verdadeira")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 216; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */