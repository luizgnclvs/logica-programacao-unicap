public class DoWhile1 {
    
    public static void main(String[] args) {
        
        int sum = 0, i = 1;

        do {
            if (i % 3 == 0 && i % 2 != 0) {
                sum += i;
            }
            i++;
        } while (i < 501);

        System.out.println("A soma de todos os números ímpares e múltiplos de três encontrados no intervalo de 1 a 500 é de: " + sum);
    }
}
