import java.util.Scanner;

public class Question12 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float temperature;
		
		System.out.printf("Informe o valor da temperatura em graus Fahrenheit: ");
		temperature = read.nextFloat();
		
		System.out.printf("\nA temperatura, em graus Celsius, é de: %.1f°C", (temperature - 32) / 9 * 5);
	}
}