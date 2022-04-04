public class DoWhile6 {
    
    public static void main(String[] args) {
        
        System.out.println("Os números ímpares localizados entre 100 e 200 são:");

        int i = 100;

        do {
            if (i % 2 != 0) {
                System.out.printf("%d\t", i);
            }
            i++;
        } while (i < 201);
    }
}
