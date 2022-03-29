import java.util.Scanner;

public class Question11 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float income, salesTotal, commission;
		int cars;
		
		System.out.printf("Informe o valor de seu salário fixo: R$ ");
		income = read.nextFloat();
		System.out.printf("Insira a quantidade de carros vendidos: ");
		cars = read.nextInt();
		System.out.printf("Agora informe o valor de comissão por carro vendido: R$ ");
		commission = read.nextFloat();
		System.out.printf("Por fim, informe a soma total dos valores das vendas efetuadas: R$ ");
		salesTotal = read.nextFloat();
		
		System.out.printf("\nSeu salário final tem o valor de: R$ %.2f", income + (commission * cars) + (salesTotal * 5 / 100));
	}
}