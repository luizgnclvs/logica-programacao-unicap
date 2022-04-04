public class While1 {
    
    public static void main(String[] args) {
        
        int sum = 0, i = 1;

        while (i < 501) {
            if (i % 3 == 0 && i % 2 != 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("A soma de todos os números ímpares e múltiplos de três encontrados no intervalo de 1 a 500 é de: " + sum);
    }
}