import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String name;
		int gender, maritalStatus, marriageYears;
		
		System.out.printf("Informe seu nome: ");
		name = read.nextLine();
		System.out.printf("%s \n 1\t%s\n 2\t%s\n 3\t%s\n", "Agora informe seu sexo:", "Feminino", "Masculino", "Outro");
		gender = read.nextInt();
        
		if (gender < 1 || gender > 3) {
            		System.out.printf("Opção inválida! Tente novamente: ");
            		gender = read.nextInt();
        	}
		
		System.out.printf("\n%s\n 1\t%s\n 2\t%s\n 3\t%s\n 4\t%s\n 5\t%s\n", "Por fim, informe seu estado civil, utilizando o número correspondente:", "Solteiro(a)", "Casado(a)", "Separado(a)", "Divorciado(a)", "Viúvo(a)");
		maritalStatus = read.nextInt();
        	
		if (maritalStatus < 1 || maritalStatus > 5) {
            		System.out.printf("Opção inválida! Tente novamente: ");
            		maritalStatus = read.nextInt();
        	}

		if (gender == 1 && maritalStatus == 2) {
			System.out.printf("\nInforme, em anos, quanto tempo tem seu casamento: ");
			marriageYears = read.nextInt();
		}
	}
}
