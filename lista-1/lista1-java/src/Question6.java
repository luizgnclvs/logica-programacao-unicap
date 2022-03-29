import java.util.Scanner;

public class Question6 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int base, height;
		
		System.out.printf("Insira o valor da base do seu retângulo: ");
		base = read.nextInt();
		
		System.out.printf("Agora insira a altura do retângulo: ");
		height = read.nextInt();
		
		System.out.printf("\nA área total do seu retângulo é de: %dm²", base*height);
		
	}
}