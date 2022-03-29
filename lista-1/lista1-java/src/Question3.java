public class Question3 {
	
	public static void main(String[] args) {
		
		int A, B, C;
		
		A = (4 / 2) + (2 / 4);
		
		System.out.printf("A = %d", A);
		
		A = 4 / 2 + 2 / 4;
		
		System.out.printf(" e A = %d {produzem o mesmo resultado}", A); //produzem o mesmo resultado
		
		B = 4 / (2 + 2) / 4;
		
		System.out.printf("\nB = %d", B);
		
		B = 4 / 2 + 2 / 4;
		
		System.out.printf(" e B = %d {NÃO produzem o mesmo resultado}", B); //não produzem o mesmo resultado
		
		C = (4 + 2) * 2 - 4;
		
		System.out.printf("\nC = %d", C);
		
		C =  4 + 2 * 2 - 4;
		
		System.out.printf(" e C = %d {NÃO produzem o mesmo resultado}", C); //não produzem o mesmo resultado
		
	}
}