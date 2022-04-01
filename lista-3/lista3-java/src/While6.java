public class While6 {
    
    public static void main(String[] args) {
        
        System.out.println("Os números ímpares localizados entre 100 e 200 são:");

        int number = 100;

        while (number < 201) {
            if (number % 2 != 0) {
                System.out.printf("%d\t", number);
            }
            number++;
        }
    }
}
