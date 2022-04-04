import java.util.Scanner;

public class Question24 {
    
    static double factoringOf(int x) {
		double product = 1.0;
		double multiplier = 1.0;
		
		for (int i = 0; i < x; i++) {
			product *= multiplier;
			multiplier++;
		}
		return product;
	}
	
	static double operationS1(int x) {
		return (1 + 1 + 1/(factoringOf(2)) + 1/(factoringOf(3)) + 1/(factoringOf(x)));
	}
	
	static double operationS2(int x) {
		double sum = 1.0;
						
		for (int i = 1; i < x + 1; i++) {
			sum += 1/(factoringOf(i));			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int n, method;
		double s;
		
		System.out.printf("Olá! Insira um valor INTEIRO e POSITIVO qualquer de seu agrado: ");
		n = read.nextInt();
		while (n < 1) {
			System.out.printf("Por favor, insira um valor POSITIVO: ");
			n = read.nextInt();
		}
		
		//Como a questão anterior, não ficou claro o que a questão queria então resolvi fazer dois métodos
		System.out.printf("Escolha o método desejado para a operação, utilizando \"1\" ou \"2\": ");
		method = read.nextInt();
		while (method != 1 && method != 2) {
			System.out.printf("Opção inválida. Tente novamente: ");
			method = read.nextInt();
		}
				
		if (method == 1) {
			s = operationS1(n);
		} else {
			s = operationS2(n);
		}
		
		System.out.printf("\nO resultado da operação é de: S = %.2f", s);
	}
}