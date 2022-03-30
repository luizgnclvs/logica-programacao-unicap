public class For1 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i < 501; i += 2) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		
		System.out.printf("A soma de todos os números ímpares e múltiplos de três que se encontram no intervalo de 1 a 500 é de: %d", sum);
	}
}