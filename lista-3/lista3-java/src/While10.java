import java.util.Scanner;

public class While10 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        System.out.printf("Insira um valor para que seja calculado seu fatorial: ");
        int a = read.nextInt();

        System.out.printf("\nO fatorial de %d é:\n%d! = %d", a, a, a);
        
        int fat = a, i = (a - 1);

        while (i > 0) {
            System.out.printf(" ✕ %d", i);
            fat *= i;
            i--;
        }        
        System.out.printf(" = %d", fat);
    }
}
