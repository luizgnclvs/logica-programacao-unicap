import java.util.Scanner;

public class Question9 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float height;
		int gender;
		
		System.out.printf("Informe sua altura, em metros: ");
		height = read.nextFloat();
		
		System.out.printf("\n%s \n 1\t%s\n 2\t%s\n", "Agora informe seu sexo:", "Feminino", "Masculino");
		gender = read.nextInt();
		
		if (gender == 1) {
			System.out.printf("\nO peso ideal para sua altura e gênero é de: %.2fkg", (height * 62.1) - 44.7);
		} else if (gender == 2) {
			System.out.printf("\nO peso ideal para sua altura e gênero é de: %.2fkg", (height * 72.2) - 58);
		} else {
			System.out.println("Alguma das opções inseridas foi inválida, por favor tente novamente");
		}
	}
}