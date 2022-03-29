import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int years, months, days;
		
		System.out.println("Informe sua idade, separado-a em anos, meses e dias:");
		years = read.nextInt();
		months = read.nextInt();
		days = read.nextInt();
		
		System.out.printf("\nSua idade total, somente em dias, é de aproximadamente: %d", (years*365)+(months*30)+days);
		
	}
}