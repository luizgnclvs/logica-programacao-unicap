import java.util.Scanner;

public class Question15 {
    
    static String triangleType(double x, double y, double z) {
		if ((x < y + z) && (y < x + z) && (z < x + y)) {
			if (x == y && x == z) {
				return "Triângulo Equilátero";
			} else if (x == y || x == z || y == z) {
				return "Triângulo Isóceles";
			} else {
				return "Triângulo Escaleno";
			}									
		} else {
			return "TRIÂNGULO IMPOSSÍVEL :/";
		}
	}
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double side1, side2, side3;
		
		System.out.printf("Olá! Informe as medidas do seu triângulo \nLado 1: ");
		side1 = read.nextDouble();
		System.out.printf("Lado 2: ");
		side2 = read.nextDouble();
		System.out.printf("Lado 3: ");
		side3 = read.nextDouble();
		
		System.out.printf("\nCom os dados inseridos obtemos: %s", triangleType(side1, side2, side3));
	}
}
