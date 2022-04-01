import java.util.Scanner;

public class For5 {
	
     public static void main(String[] args) {
	     
	     Scanner read = new Scanner(System.in);
	     
	     System.out.println("Nesta operação, você pode inserir quantos e quaisquer valores que desejar.");
	     System.out.println("Caso não queira inserir mais nenhum número e encerrar a operação, insira \"0\"\n");
	     
	     int count = 0, countEven = 0, countOdd = 0;
	     float sum = 0, sumEven = 0;
	     
	     for (int i = 0; i < 1; i++) {
		     System.out.printf("Insira um número: ");
		     int number = read.nextInt();
		     
		     if (number == 0) {
			     break;
		     } else {
			     if (number % 2 == 0) {
				     sumEven += number;
				     countEven++;
			     } else {
				     countOdd++;
			     }
			     
		     sum += number;
		     count++;            
		     i--;
		     }            
	     }        
	     
	     System.out.printf("\n\n\t%s \n%s\t\t%d \n%s\t\t%d \n%s\t\t%.2f \n%s\t\t%.2f", "Resultados da Operação", "Quantidade de números pares:", countEven, "Quantidade de números ímpares:", countOdd, "Média dos números pares:", sumEven / countEven, "Média de todos os valores:", sum / count);
     }
}
