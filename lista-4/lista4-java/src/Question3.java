import java.util.Scanner;

public class Question3 {

    static boolean isItPrime(int x) {
		boolean prime = false;
		
		if (x == 2 || x == 3) {
			prime = true;
		} else if (x % 2 == 0) {
			prime = false;
		} else {
			for (int i = 3; i < x; i += 2) {
				if (x % i == 0) {
					break;
				} else {
					prime = true;
				}
			}
		}		
		return prime;
	}
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int number;
		
		System.out.printf("Olá! Insira um valor qualquer de seu agrado: ");
		number = read.nextInt();
		
		while (number < 1) {
			System.out.printf("Por favor, insira um valor positivo: ");
			number = read.nextInt();
		}
		
		if (isItPrime(number)) {
			System.out.println("\nO valor inserido é um número PRIMO!");
		} else {
			System.out.println("\nInfelizmente o valor inserido NÃO é um número primo :(");
		}
	}
}