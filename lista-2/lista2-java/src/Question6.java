import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		boolean boolean1, boolean2;
		
		System.out.printf("Atribua o valor de 'true' ou 'false' à primeira variável: ");
		boolean1 = read.nextBoolean();
		
		System.out.printf("Agora atribua um desses mesmos valores à segunda variável: ");
		boolean2 = read.nextBoolean();
		
		if (boolean1 == true && boolean2 == true) {
			System.out.println("\nAmbas as variáveis possuem o valor de 'true'");
		} else if (boolean1 == false && boolean2 == false) {
			System.out.println("\nAmbas as variáveis possuem o valor de 'false'");
		} else {
			if (boolean1 == true) {
				System.out.println("\nSomente a primeira variável possui o valor de 'true', já a segunda possui o valor de 'false'");
			} else {
				System.out.println("\nSomente a segunda variável possui o valor de 'true', já a primeira possui o valor de 'false'");
			}
		}
	}
}