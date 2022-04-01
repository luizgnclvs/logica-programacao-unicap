import java.util.Scanner;

public class For10 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.printf("Insira um valor para que seja calculado seu fatorial: ");
        int a = read.nextInt();

        System.out.printf("\nO fatorial de %d é:\n%d! = %d", a, a, a);
        
        int fat = a;
        
        for (int i = (a - 1); i > 0; i--) {
            System.out.printf(" ✕ %d", i);
            fat *= i;
        }
        System.out.printf(" = %d", fat);
    }
}