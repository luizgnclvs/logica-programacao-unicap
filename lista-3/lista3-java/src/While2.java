import java.util.Scanner;

public class While2 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);

        float [] heights = new float [15];
        float tallestH = 0, smallestH = 0;

        int i = 0;

        while (i < heights.length) {
            System.out.printf("Informe a altura, em metros, do espécime de nº %d: ", i + 1);
	        heights[i] = read.nextFloat();
            while (heights[i] <= 0) {
                System.out.printf("Valor inválido! Tente novamente: ");
                heights[i] = read.nextFloat();
            }
            i++;
        }

        i = 0;

        while (i < heights.length) {
            if (heights[i] >= tallestH) {
			    tallestH = heights[i];
		    }
            i++;
	    }		
        
	    smallestH = tallestH;
        i = 0;
		
	    while (i < heights.length) {
		    if (heights[i] <= smallestH) {
			    smallestH = heights[i];
		    }
            i++;
	    }

        System.out.printf("\n%s %.2fm \n%s %.2fm", "Dentre as alturas inseridas, a menor é de:", smallestH, "E a maior é de:", tallestH);
    }
}
