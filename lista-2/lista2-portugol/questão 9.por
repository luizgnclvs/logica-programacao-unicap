programa
{
	
	funcao inicio()
	{
		real altura, pesoid
		cadeia sexo

		escreva("Informe seu sexo, usando as palavras-chave 'masculino' ou 'feminino'\n")
		leia(sexo)
		enquanto (sexo != "masculino" e sexo != "feminino") {
			escreva("Opção inválida! Tente novamente: ")
			leia(sexo)
		}
		escreva("Insira sua altura: ")
		leia(altura)

		se (sexo == "masculino") {
			pesoid = (72.7 * altura) - 58
		} senao {
			pesoid = (62.1 * altura) - 44.7
		}
		escreva("O peso ideal para seu sexo e altura é de: ", pesoid)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 508; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */