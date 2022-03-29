programa
{
	
	funcao inicio()
	{
		real peso, altura, imc
		cadeia condic

		escreva("Informe seu peso: ")
		leia(peso)
		escreva("Informe também sua altura: ")
		leia(altura)
		imc = peso / (altura * altura)
		se (imc < 18.5) {
			condic = "abaixo do peso"
		} senao se (imc >= 18.5 e imc <= 25) {
			condic = "peso normal"
		} senao se (imc > 25 e imc <= 30) {
			condic = "acima do peso"
		} senao {
			condic = "obeso"
		}
		escreva("De acordo com o cálculo do IMC (", imc, "), sua condição de peso é de '", condic, "'")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 486; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */