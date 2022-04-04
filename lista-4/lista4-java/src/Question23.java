import java.util.Scanner;

public class Question23 {
    
    static double operationS1(int x) { 
		double y = x;
		return (1 + 0.5 + 0.33 + 0.25 + 0.2 + 1/y);
	}
	
	static double operationS2(int x) {
		double sum = 0.0;
		double denominator = 1.0;
		
		for (int i = 0; i < x; i++) {
			sum += 1/denominator;
			denominator++;
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
		
		//Não entendi se a questão quer apenas que substitua o valor de N na fórmula para obter o resultado,
		//ou se é pra somar sucessivamente toda as frações de denominador 1 a N, então fiz dos dois modos
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