public class Question2 {
	
	public static void main(String[] args) {
		
		int A, B, C, X, Y, Z;
		
		System.out.println("Letra a):");
		
		A = 10; B = 20;
		
		System.out.println(B);
		
		B = 5;
		
		System.out.printf("Resultado: %d, %d", A, B); //resposta final para Letra a) é: "10, 5"
		
		System.out.println("\n\nLetra b):");
		
		A = 30; B = 20;
		C = A + B;
		
		System.out.println(C);
		
		B = 10;
		
		System.out.printf("%d, %d", B, C);
		
		C = A + B;
		
		System.out.printf("\nResultado: %d, %d, %d", A, B, C); //resposta final para Letra b) é: 30, 10, 40
		
		System.out.println("\n\nLetra c):");
		
		A = 10; B = 20; 
		C = A;		
		B = C;
		
		System.out.printf("Resultado: %d, %d, %d", A, B, C); //resposta final para Letra c) é: 10, 10, 10
		
		System.out.println("\n\nLetra d):");
		
		A = 10;
		B = A + 1;
		A = B + 1; 
		B = A + 1;
		
		System.out.println(A);
		
		A = B + 1;
		
		System.out.printf("Resultado: %d, %d", A, B); //resposta final para Letra d) é: 14, 13
		
		System.out.println("\n\nLetra e):");
		
		A = 10; B = 5;		
		C = A + B;		
		B = 20;		
		A = 10;
		
		System.out.printf("Resultado: %d, %d, %d", A, B, C); //resposta final para Letra e) é: 10, 20, 15
		
		System.out.println("\n\nLetra f):");
		
		X = 1; Y = 2;		
		Z = Y - X;
		
		System.out.println(Z);
		
		X = 5;		
		Y = X + Z;
		
		System.out.printf("Resultado: %d, %d, %d", X, Y, Z); //resposta final para Letra f) é: 5, 6, 1
		
	}
}