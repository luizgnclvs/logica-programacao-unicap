import java.util.Scanner;

public class While7 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);

        System.out.printf("Insira um número qualquer de 1 a 10: ");
        int n = read.nextInt();
        while (n < 1 || n > 10) {
            System.out.printf("Entrada inválida. Tente novamente: ");
            n = read.nextInt();
        }

        int i = 0;

        while (i < 11) {
            System.out.printf("%d \t✕ \t%d \t= \t%d\n", i, n, i*n);
            i++;
        }
    }
}