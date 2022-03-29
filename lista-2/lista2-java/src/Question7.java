import java.util.Scanner;

public class Question7 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int number;
		
		System.out.printf("Informe um número qualquer: ");
		number = read.nextInt();
		
		if (number % 2 == 0) {
			System.out.printf("O resultado da operação é de: %d", number + 5);
		} else {
			System.out.printf("O resultado da operação é de: %d", number + 8);
		}
	}
}