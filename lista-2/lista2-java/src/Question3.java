import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int number;
		
		System.out.printf("Informe um número qualquer: ");
		number = read.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("Seu número é par");
		} else {
			System.out.println("Seu número é ímpar");
		}
	}
}