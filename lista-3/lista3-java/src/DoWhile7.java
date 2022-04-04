import java.util.Scanner;

public class DoWhile7 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);

        int n;

        do {
            System.out.printf("Insira um número qualquer de 1 a 10: ");
            n = read.nextInt();
        } while (n < 1 || n > 10);

        int i = 0;

        do {
            System.out.printf("%d \t✕ \t%d \t= \t%d\n", i, n, i*n);
            i++;
        } while (i < 11);
    }
}
