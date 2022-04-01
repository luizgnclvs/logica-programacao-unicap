import java.util.Scanner;

public class For7 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);

        for (int i = 0; i < 1; i++) {
            System.out.printf("Insira um número qualquer de 1 a 10: ");
            int n = read.nextInt();

            if (n < 1 || n > 10) {
                System.out.println("Entrada inválida. Tente novamente.\n");
                i--;
            } else {
                for (int j = 0; j < 11; j++) {
                    System.out.printf("%d \t✕ \t%d \t= \t%d\n", j, n, j*n);
                }
            }
        }
    }
}