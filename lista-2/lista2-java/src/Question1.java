import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.println("Insira três valores quaisquer:");
		A = read.nextInt();
		B = read.nextInt();
		C = read.nextInt();
		
		if (A + B < C) {
			System.out.println("\nA soma dos dois primeiros valores é menor que o terceiro valor");
		} else {
			System.out.println("\nA soma dos dois primerios valores NÂO é menor que o terceiro valor");
		}
	}
}