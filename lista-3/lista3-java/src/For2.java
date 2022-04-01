import java.util.Scanner;

public class For2 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float[] heights = new float[15]; 
		float tallestH = 0, smallestH = 0;
		
		for (int i = 0; i < heights.length; i++) {
			System.out.printf("Informe a altura, em metros, do espécime de nº %d: ", i + 1);
			heights[i] = read.nextFloat();
			if (heights[i] <= 0) {
				System.out.println("Valor inválido! Tente novamente");
				i--;
			}
		}
		
		for (int i = 0; i < 15; i++) {
			if (heights[i] >= tallestH) {
				tallestH = heights[i];
			}
		}
		
		smallestH = tallestH;
		
		for (int i = 0; i < 15; i++) {
			if (heights[i] <= smallestH) {
				smallestH = heights[i];
			}
		}
		
		System.out.printf("\n%s %.2fm \n%s %.2fm", "Dentre as alturas inseridas, a menor é de:", smallestH, "E a maior é de:", tallestH);
	}
}