public class While1 {
    
    public static void main(String[] args) {
        
        int sum = 0, number = 1;

        while (number < 501) {
            if (number % 3 == 0 && number % 2 != 0) {
                sum += number;
            }
            number++;
        }

        System.out.println("A soma de todos os números ímpares e múltiplos de três encontrados no intervalo de 1 a 500 é de: " + sum);
    }
}