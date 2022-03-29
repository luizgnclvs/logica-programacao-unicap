import java.util.Scanner;

public class Question13 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float grade1, grade2, grade3;
		
		System.out.printf("Informe sua primeira nota: ");
		grade1 = read.nextFloat();
		System.out.printf("Agora a segunda nota: ");
		grade2 = read.nextFloat();
		System.out.printf("Por fim, insira a terceira nota: ");
		grade3 = read.nextFloat();
		
		System.out.printf("\nSua média final é de: %.1f", (grade1 * 2 + grade2 * 3 + grade3 * 5) / 10);
	}
}