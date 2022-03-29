import java.util.Scanner; 

public class Question5 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int number;
		
		System.out.printf("Informe um número qualquer: ");
		number = read.nextInt();
		
		if (number > 0) {
			System.out.printf("O resultado da operação é: %d", number * 2);
		} else if (number < 0) {
			System.out.printf("O resultado da operação é: %d", number * 3);
		} else {
			System.out.println("O número inserido tem valor nulo, logo nenhuma operação foi realizada");
		}
	}
}