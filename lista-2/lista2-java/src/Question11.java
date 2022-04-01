import java.util.Scanner;

public class Question11 {
	 
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float price, priceFinal;
		int installment, inCash;
		
		System.out.printf("Informe o preço de etiqueta do produto: ");
		price = read.nextFloat();
		
		System.out.println("\nDeseja realizar o pagamento em quantas parcelas? \n(Caso deseje pagar à vista, digite '1')");
		installment = read.nextInt();
		
		if (installment == 1) {
			System.out.printf("\n%s \n%s \n\t1\t%s \n\t2\t%s \n\t3\t%s\n", "Qual o método de pagamento desejado?", "(Selecione o número correspondente à opção desejada)", "Dinheiro", "Cheque", "Cartão de Crédito");
			inCash = read.nextInt();
				
			if (inCash == 1 || inCash == 2) {
				priceFinal = price - (price / 10);
			} else {
				priceFinal = price - (15 * price / 100);
			}
		} else if (installment == 2) {
			priceFinal = price;
		} else {
			priceFinal = price + (price / 10);
		}
		
		System.out.printf("\nO valor final do seu produto é de: R$%.2f", priceFinal);
	}
}
