import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.printf("Insira um número qualquer: ");
		A = read.nextInt();
		
		System.out.printf("Insira mais um número qualquer: ");
		B = read.nextInt();
		
		if (A == B) {
			C = A + B;
		} else {
			C = A * B;
		}
		
		System.out.printf("\nO valor final da operação foi de: %d", C);
	}
}