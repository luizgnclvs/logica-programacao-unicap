import java.util.Scanner;

public class Question8 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Informe três números inteiros quaisquer:");
		n1 = read.nextInt();
		n2 = read.nextInt();
		n3 = read.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			if (n2 >= n3) {
				System.out.printf("\nOs números inseridos, em ordem descrescente, são: %d, %d e %d", n1, n2, n3);
			} else {
				System.out.printf("\nOs números inseridos, em ordem descrescente, são: %d, %d e %d", n1, n3, n2);
			}
		} else if (n2 >= n3) {
			if (n1 >= n3) {
				System.out.printf("\nOs números inseridos, em ordem descrescente, são: %d, %d e %d", n2, n1, n3);
			} else {
				System.out.printf("\nOs números inseridos, em ordem descrescente, são: %d, %d e %d", n2, n3, n1);
			}
		} else {
			if (n1 >= n2) {
				System.out.printf("\nOs números inseridos, em ordem descrescente, são: %d, %d e %d", n3, n1, n2);
			} else {
				System.out.printf("\nOs números inseridos, em ordem descrescente, são: %d, %d e %d", n3, n2, n1);
			}
		}
	}
}