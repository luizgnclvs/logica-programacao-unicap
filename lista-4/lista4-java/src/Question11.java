import java.util.Scanner;

public class Question11 {
    
    static String gradeConcept(double x) {
		String y;
		
		if (x < 5) {
			y = "D";
		} else if (x < 7) {
			y = "C";
		} else if (x < 9) {
			y = "B";
		} else {
			y = "A";
		}		
		return y;
	}
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double grade;
		
		System.out.printf("Olá! Informe a média final do aluno: ");
		grade = read.nextDouble();
		
		while (grade < 0 || grade > 10) {
			System.out.printf("Nota inválida! Tente novamente: ");
			grade = read.nextDouble();
		}
		
		System.out.printf("\nO conceito do aluno é: %s", gradeConcept(grade));
	}
}
