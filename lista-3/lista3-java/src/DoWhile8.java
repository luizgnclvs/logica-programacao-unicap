import java.util.Scanner;

public class DoWhile8 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.printf("Insira um valor inicial para sua P.A.: ");
        int a = read.nextInt();
        
        System.out.printf("Agora insira um valor para a razão da sua P.A.: ");
        int r = read.nextInt();

        int i = 1;

        System.out.printf("\nP.A. = {%d", a);
        do {
            System.out.printf(", %d", a + (r * i));
            i++;
        } while (i < 10);
        System.out.printf("}");
    }
}