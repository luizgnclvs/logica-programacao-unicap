programa
{
	
	funcao inicio()
	{
		cadeia nome, sexo, estadocivil
		inteiro tempocasamento

		escreva("Por favor, digite seu nome: ")
		leia(nome)
		escreva("\nInsira seu sexo, usando 'F' para feminino, 'M' para masculino ou 'O' para outros: ")
		leia(sexo)
		enquanto (sexo != "F" e sexo != "f" e sexo != "M" e sexo != "m" e sexo != "O" e sexo != "o") {
			escreva("Entrada incorreta! Por favor, selecione uma das opções válidas: ")
			leia(sexo)
		}
		escreva("\nPor fim, informe seu estado civil, lembrando que as opções válidas são: \n'Solteiro(a)', 'Casado(a)', 'Separado(a)', 'Divorciado(a)' e 'Viúvo(a)'\n")
		leia(estadocivil)
		enquanto (estadocivil != "Solteiro(a)" e estadocivil != "Casado(a)" e estadocivil != "Separado(a)" e estadocivil != "Divorciado(a)" e estadocivil != "Viúvo(a)") {
			escreva("Entrada incorreta! Por favor, selecione uma das opções válidas: ")
			leia(estadocivil)
		}
		se ((sexo == "F" ou sexo == "f") e estadocivil == "Casado(a)") {
			escreva("Ah! Nesse caso, informe, em anos, quanto tempo você tem de casamento: ")
			leia(tempocasamento)
		escreva("\n\nAgradecemos por contribuir com suas informações :)")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */