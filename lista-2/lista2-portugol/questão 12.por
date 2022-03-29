programa
{
	
	funcao inicio()
	{
		cadeia matricula, conceito, situacao
		real nota1, nota2, nota3, me
		inteiro ma

		escreva("Iforme o número de matrícula do aluno: ")
		leia(matricula)
		escreva("\nInsira a nota da primeira avaliação do aluno: ")
		leia(nota1)
		enquanto (nota1 < 0 ou nota1 > 10) {
			escreva("Informação inválida! Tente novamante: ")
			leia(nota1)
		}
		escreva("Agora insira a segunda nota: ")
		leia(nota2)
		enquanto (nota2 < 0 ou nota2 > 10) {
			escreva("Informação inválida! Tente novamante: ")
			leia(nota2)
		}
		escreva("Por fim, insira a nota da terceira avaliação: ")
		leia(nota3)
		enquanto (nota3 < 0 ou nota3 > 10) {
			escreva("Informação inválida! Tente novamante: ")
			leia(nota3)
		}
		escreva("\nAh! Insira também a média de exercícios do aluno: ")
		leia(me)
		enquanto (me < 0 ou me > 10) {
			escreva("Informação inválida! Tente novamante: ")
			leia(me)
		}
		ma = (nota1 + nota2 * 2 + nota3 * 3 + me) / 7
		se (ma >= 90) {
			conceito = "A"
		} senao se (ma >= 75 e ma < 90) {
			conceito = "B"
		} senao se (ma >= 60 e ma < 75) {
			conceito = "C"
		} senao se (ma >= 40 e ma < 60) {
			conceito = "D"
		} senao {
			conceito = "E"
		}
		se (conceito == "A" ou conceito == "B" ou conceito == "C") {
			situacao = "Aprovado"
		} senao {
			situacao = "Reprovado"
		}
		escreva("\nDados do aluno\nNúmero de Matrícula: ", matricula, "\nNota 1: ", nota1, "  Nota 2: ", nota2, "  Nota 3: ", nota3)
		escreva("\nMédia de Exercícios: ", me, "\nMédia de Aproveitamento: ", ma, "   Conceito: ", conceito)
		escreva("\nSituação: ", situacao)
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */