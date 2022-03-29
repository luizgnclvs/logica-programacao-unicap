import java.util.Scanner;

public class Question10 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float weight, height, imc;
		
		System.out.printf("Informe seu peso, em quilogramas: ");
		weight = read.nextFloat();
		System.out.printf("Agora informe sua altura, em metros: ");
		height = read.nextFloat();
		
		imc = weight / (height * height);
		
		if (imc < 18.5) {
			System.out.println("Conforme a tabela do IMC e os dados inseridos, sua condição é de: 'ABAIXO DO PESO'");
		} else if (imc <= 25) {
			System.out.println("Conforme os dados inseridos e a tabela do IMC, sua condição é de: 'PESO NORMAL'");
		} else if (imc <= 30) {
			System.out.println("Conforme os dados inseridos e a tabela do IMC, sua condição é de: 'ACIMA DO PESO'");
		} else {
			System.out.println("Conforme os dados inseridos e a tabela do IMC, sua condição é de: 'OBESO'");
		}
	}
}