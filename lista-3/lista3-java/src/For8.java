import java.util.Scanner;

public class For8 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.printf("Insira um valor inicial para sua P.A.: ");
        int a = read.nextInt();
        
        System.out.printf("Agora insira um valor para a razão da sua P.A.: ");
        int r = read.nextInt();

        System.out.printf("\nP.A. = {%d", a);
        for (int i = 1; i < 10; i++) {
            System.out.printf(", %d", a + (r * i));
        }
        System.out.printf("}");
    }
}