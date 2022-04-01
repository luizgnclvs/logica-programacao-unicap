public class For6 {

    public static void main(String[] args) {
        
        System.out.println("Os números ímpares localizados entre 100 e 200 são:");
        for (int i = 100; i < 201; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d\t", i);
            }
        }
    }
}