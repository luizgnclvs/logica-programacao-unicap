programa
{
	
	funcao inicio()
	{
		//Questão 2
		escreva("Questão 2\n")
		inteiro A, B, C, X, Y, Z
		//letra "a)":
			escreva("a:\n")
			A = 10
			B = 20
			escreva(B, "\n")
			B = 5
			escreva("Resultado: ", A, ", ", B, "\n")
			//o resultado impresso na tela seria: "10, 5"
		//letra "b)":
			escreva("\nb:\n")
			A = 30
			B = 20
			C = A + B
			escreva(C, "\n")
			B = 10
			escreva(B, ", ", C, "\n")
			C = A + B
			escreva("Resultado: ", A, ", ", B, ", ", C, "\n")
			//o resultado impresso na tela seria: "30, 10, 40"
		//letra "c)":
			escreva("\nc:\n")
			A = 10
			B = 20
			C = A
			B = C
			A = B
			escreva("Resultado: ", A, ", ", B, ", ", C, "\n")
			//o resultado impresso na tela seria: "10, 10, 10"
		//letra "d)":
			escreva("\nd:\n")
			A = 10
			B = A + 1
			A = B + 1
			B = A + 1
			escreva(A, "\n")
			A = B + 1
			escreva("Resultado: ", A, ", ", B, "\n")
			//o resultado impresso na tela seria: "14, 13"
		//letra "e)":
			escreva("\ne:\n")
			A = 10
			B = 5
			C = A + B
			B = 20
			A = 10
			escreva("Resultado: ", A, ", ", B, ", ", C, "\n")
			//o resultado impresso na tela seria: "10, 20, 15"
		//letra "f)":
			escreva("\nf:\n")
			X = 1
			Y = 2
			Z = Y - X
			escreva(Z, "\n")
			X = 5
			Y = X + Z
			escreva("Resultado: ", X, ", ", Y, ", ", Z, "\n")
			//o resultado impresso na tela seria: "5, 6, 1"
		
		//Questão 3:
		escreva("\nQuestão 3\n")
		real a, b, c
		a = (4/2)+(2/4)
		escreva(a, "\n")
		a = 4/2+2/4
		escreva(a, "\n")
		escreva("Produzem o mesmo resultado\n\n")
			//produzem o mesmo resultado
		b = 4/(2+2)/4
		escreva(b, "\n")
		b = 4/2+2/4 
		escreva(b, "\n")
		escreva("Não produzem o mesmo resultado\n\n")
			//não produzem o mesmo resultado
		c = (4+2)*2-4
		escreva(c, "\n")
		c = 4+2*2-4
		escreva(c, "\n")
		escreva("Não produzem o mesmo resultado\n\n")
			//não produzem o mesmo resultado
		
		//Questão 5
		escreva("\nQuestão 5\n")
		inteiro valor
		escreva("Escreva um valor: ")
		leia(valor)
		escreva(valor, " - 1, ou, ", valor-1, "\n")
		
		//Questão 6
		escreva("\nQuestão 6\n")
		inteiro baseRetangulo, alturaRetangulo, areaRetangulo
		escreva("Insira a base e a altura do seu retângulo:\n")
		leia(baseRetangulo, alturaRetangulo)
		areaRetangulo = baseRetangulo*alturaRetangulo
		escreva("A área do seu retângulo é de ", areaRetangulo, "m² \n")
		
		//Questão 7
		escreva("\nQuestão 7\n")
		inteiro idadeAnos, idadeMeses, idadeDias, idadeTotal
		escreva("Insira sua idade em anos, meses e dias:\n")
		leia(idadeAnos, idadeMeses, idadeDias)
		idadeTotal = idadeAnos*365 + idadeMeses*30 + idadeDias
		escreva("Sua idade totaliza ", idadeTotal, " dias\n")
		
		//Questão 8
		escreva("\nQuestão 8\n")
		real eleitores, votosBrancos, votosNulos, votosValidos, porBrancos, porNulos, porValidos
		escreva("Insira o número total de eleitores no município: ")
		leia(eleitores)
		escreva("Agora insira o número de votos brancos e de votos nulos nesta ordem:\n")
		leia(votosBrancos, votosNulos)
		votosValidos = eleitores - (votosBrancos + votosNulos)
		porBrancos = (votosBrancos/eleitores)*100
		porNulos = (votosNulos/eleitores)*100
		porValidos = (votosValidos/eleitores)*100
		escreva("O percentual de votos válidos é de ", porValidos, "%\n", "O percentual de votos brancos é de ", porBrancos, "%\n", "O percentual de votos nulos é de ", porNulos, "%\n")
		
		//Questão 9
		escreva("\nQuestão 9\n")
		real salario, porReajuste, salarioReajuste
		escreva("Insira seu salário atual: ")
		leia(salario)
		escreva("Qual a porcentagem do reajuste? ")
		leia(porReajuste)
		salarioReajuste = salario*(porReajuste/100) + salario
		escreva("Seu novo salário é de R$", salarioReajuste, "\n")
		
		//Questão 11
		escreva("\nQuestão 11\n")
		real salarioFixo, valorComissao, numCarros, valorVendas, salarioTotal
		escreva("Insira o valor do salário fixo: ")
		leia(salarioFixo)
		escreva("Insira o valor da comissão por carro vendido: ")
		leia(valorComissao)
		escreva("Insira a quantidade de carros vendida pelo(a) funcionário(a): ")
		leia(numCarros)
		escreva("Insira o valor total das vendas feitas pelo(a) funcionário(a): ")
		leia(valorVendas)
		escreva("\nO valor final do salário é de R$ ", salarioFixo+valorComissao*numCarros+valorVendas*5/100, "\n")
			
		//Questão 12
		escreva("\nQuestão 12\n")
		real tempFahrenheit, tempCelsius
		escreva("Insira a temperatura em graus Fahrenheit: ")
		leia(tempFahrenheit)
		tempCelsius = ((tempFahrenheit-32)/9)*5
		escreva("A temperatura convertida em graus Celsius é de ", tempCelsius, "°C\n")
		
		//Questão 13
		escreva("\nQuestão 13\n")
		real nota1, nota2, nota3, mediaFinal
		escreva("Insira as três notas do aluno, em ordem\n")
		leia(nota1, nota2, nota3)
		mediaFinal = (nota1*2+nota2*3+nota3*5)/10
		escreva("Sua média final é ", mediaFinal)
		}
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 35; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */