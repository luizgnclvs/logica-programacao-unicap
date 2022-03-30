import java.util.Scanner;

public class For3 {
	
	static boolean isNumeric(String x) {
		return x != null && x.matches("[0-9.-]+");
	}

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String entry = " ";
		float sum = 0, count = 0;
		int posCount = 0, negCount = 0;
		
		System.out.println("Nesta operação, você pode inserir quantos e quaisquer valores que desejar.");
		System.out.println("Caso não queira inserir mais nenhum número e encerrar a operação, insira \"terminate\"\n");
		
		for (int i = 0; i < 1; i++) {
			System.out.printf("Insira um número: ");
			entry = read.nextLine();
			
			if (entry.equals("terminate")) {
				break;
			} else if (isNumeric (entry)) {
				float number = Float.valueOf(entry).floatValue();
	            count++;
				sum += number;
				if (number != 0) {
					if (number > 0) {
						posCount++;
					} else {
						negCount++;
					}
				}
				
			} else {
				System.out.println("Entrada inválida! Tente novamente\n");
			}
			i--;
		}	
				
		System.out.printf("\n\n\t%s \n%s\t\t\t%.1f \n%s\t%d \n%s\t%.2f%% \n%s\t%d \n%s\t%.2f%%", "Resultados da Operação", "Média Aritmética:", sum / count, "Quantidade de valores positivos:", posCount, "Percentual de valores positivos:", (posCount / count) * 100, "Quantidade de valores negativos:", negCount, "Percentual de valores negativos:", (negCount / count) * 100);
	}
}