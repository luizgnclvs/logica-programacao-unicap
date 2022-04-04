import java.util.Scanner;

public class DoWhile2 {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);

        float [] heights = new float [15];
        float tallestH = 0, smallestH = 0;

        int i = 0;

        do {
            do {
                System.out.printf("Informe a altura, em metros, do espécime de nº %d: ", i + 1);
	            heights[i] = read.nextFloat();
            } while (heights[i] <= 0);

            if (heights[i] >= tallestH) {
			    tallestH = heights[i];
		    }

            if (i == 0) {
                smallestH = heights[0];
            }

            if (heights[i] <= smallestH) {
			    smallestH = heights[i];
		    }
            
            i++;
        } while (i < 15);

        System.out.printf("\n%s %.2fm \n%s %.2fm", "Dentre as alturas inseridas, a menor é de:", smallestH, "E a maior é de:", tallestH);
    }
}
