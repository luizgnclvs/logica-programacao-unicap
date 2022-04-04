import java.util.Scanner;

public class While3 {

    static boolean isNumeric(String x) {
	    return x != null && x.matches("[0-9.-]+");
    }
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
        float sum = 0, count = 0, pos = 0, neg = 0;

        System.out.println("Nesta operação, você pode inserir quantos e quaisquer valores que desejar.");
		System.out.println("Caso não queira inserir mais nenhum número e encerrar a operação, insira \"terminate\"\n");

        while (true) {
            System.out.printf("Insira um valor qualquer: ");
            String entry = read.nextLine();

            if (entry.equals("terminate")) {
                break;
            } else if (isNumeric (entry)) {
                float number = Float.valueOf(entry).floatValue();
                sum += number;
                count++;
                if (number != 0) {
                    if (number > 0) {
                        pos++;
                    } else {
                        neg++;
                    }
                }
            } else {
		        System.out.println("Entrada inválida! Tente novamente\n");
	        }
        }

        System.out.printf("\n\n\t%s \n%s\t\t\t%.1f \n%s\t%.0f \n%s\t%.2f%% \n%s\t%.0f \n%s\t%.2f%%", "Resultados da Operação", "Média Aritmética:", sum / count, "Quantidade de valores positivos:", pos, "Percentual de valores positivos:", (pos / count) * 100, "Quantidade de valores negativos:", neg, "Percentual de valores negativos:", (neg / count) * 100);
    }
}