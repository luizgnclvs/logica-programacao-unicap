import java.util.Scanner;

public class For9 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.printf("Insira um valor inicial para sua P.G.: ");
        int a = read.nextInt();
        
        System.out.printf("Agora insira um valor para a razão da sua P.G.: ");
        int r = read.nextInt();

        System.out.printf("\nP.G. = {%d", a);
        for (int i = 1; i < 10; i++) {
            a *= r;
            System.out.printf(", %d", a);
        }
        System.out.printf("}");
    }
}
