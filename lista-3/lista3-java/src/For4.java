import java.util.Scanner;

public class For4 {
        
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Nesta operação, você pode inserir quantos e quaisquer valores que desejar.");
		System.out.println("Caso não queira inserir mais nenhum número e encerrar a operação, insira qualquer valor negativo\n");
		
		int interval1 = 0, interval2 = 0, interval3 = 0, interval4 = 0;
		
		for (int i = 0; i < 1; i++) {
			System.out.printf("Insira um número: ");
			int number = read.nextInt();
			
			if (number < 0) {
				break;
			} else if (number < 26) {
				interval1++;
			} else if (number < 51) {
				interval2++;
			} else if (number < 76) {
				interval3++;
			} else if (number < 101) {
				interval4++;
			} else {
				System.out.println("Número inválido! Insira outro valor.");
			}
			i--;
		}
		
		System.out.printf("\n\n\t\t%s \n%s \n\t%s\t\t\t\t%d \n\t%s\t\t\t%d \n\t%s\t\t\t%d \n\t%s\t\t\t%d", "Resultados da Operação", "Quantidade de números inseridos nos seguintes intervalos:", "[0-25]:", interval1, "[26-50]:", interval2, "[51-75]:", interval3, "[76-100]:", interval4);
	}
}