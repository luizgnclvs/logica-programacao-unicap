import java.util.Scanner;

public class While2 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);

        float [] heights = new float [15];
        float tallestH = 0, smallestH = 0;

        int index = 0;

        while (index < heights.length) {
            System.out.printf("Informe a altura, em metros, do espécime de nº %d: ", index + 1);
	    heights[index] = read.nextFloat();
            while (heights[index] <= 0) {
                System.out.printf("Valor inválido! Tente novamente: ");
                heights[index] = read.nextFloat();
            }
            index++;
        }

        index = 0;

        while (index < heights.length) {
		if (heights[index] >= tallestH) {
			tallestH = heights[index];
		}
            index++;
	}		
        
	smallestH = tallestH;
        index = 0;
		
	while (index < heights.length) {
		if (heights[index] <= smallestH) {
			smallestH = heights[index];
		}
            	index++;
	}

        System.out.printf("\n%s %.2fm \n%s %.2fm", "Dentre as alturas inseridas, a menor é de:", smallestH, "E a maior é de:", tallestH);
    }
}
