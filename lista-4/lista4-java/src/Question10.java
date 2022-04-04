import java.util.Scanner;

public class Question10 {
    
    static boolean isItEven(int x) {
		if (x % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int number;
		
		System.out.printf("Olá! Insira um valor qualquer do seu agrado: ");
		number = read.nextInt();
		
		if (isItEven(number) == true) {
			System.out.println("\nO número inserido é PAR");
		} else {
			System.out.println("\nO número inserido é ÍMPAR");
		}
	}
}