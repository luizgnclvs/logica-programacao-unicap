import java.util.Scanner;

public class Question9 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float income, adjustment;
		
		System.out.printf("Informe seu salário atual: R$ ");
		income = read.nextFloat();
		
		System.out.printf("Informe o percentual de reajuste do salário: ");
		adjustment = read.nextFloat();
		
		System.out.printf("\nSeu salário reajustado é de: R$ %.2f", income + (income * adjustment / 100));
		
	}
}