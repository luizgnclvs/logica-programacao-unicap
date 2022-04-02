import java.util.Scanner;

public class While5 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.println("Nesta operação, você pode inserir quantos e quaisquer valores que desejar, contanto que sejam positivos.");
	System.out.println("Caso não queira inserir mais nenhum número e encerrar a operação, digite \"0\"\n");

        int count = 0, even = 0, odd = 0;
	float sum = 0, sumEven = 0;

        while (true) {
            System.out.printf("Insira um número: ");
            int number = read.nextInt();

            if (number == 0) {
                break;
            } else if (number < 0) {
                System.out.println("Valor inválido. Tente novamente.");
            } else {
                if (number % 2 == 0) {
			sumEven += number;
			even++;
		} else {
			odd++;
		}
		sum += number;
		count++;   
            }
        }

        System.out.printf("\n\n\t%s \n%s\t\t%d \n%s\t\t%d \n%s\t\t%.2f \n%s\t\t%.2f", "Resultados da Operação", "Quantidade de números pares:", even, "Quantidade de números ímpares:", odd, "Média dos números pares:", sumEven / even, "Média de todos os valores:", sum / count);
    }
}
