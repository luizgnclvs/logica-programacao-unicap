import java.util.Scanner;

public class While9 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.printf("Insira um valor inicial para sua P.G.: ");
        int a = read.nextInt();
        
        System.out.printf("Agora insira um valor para a razão da sua P.G.: ");
        int r = read.nextInt();

        int iteration = 1;

        System.out.printf("\nP.G. = {%d", a);
        while (iteration < 10) {
            a *= r;
            System.out.printf(", %d", a);
            iteration++;
        }
        System.out.printf("}");
    }
}