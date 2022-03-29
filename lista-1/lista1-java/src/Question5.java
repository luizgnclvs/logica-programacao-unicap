import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in); 
		
		int number;
		
		System.out.printf("Insira um número qualquer: ");
		
		number = read.nextInt();
		
		System.out.printf("\nO antecessor do valor inserido é: %d", number - 1);
			
	}
}