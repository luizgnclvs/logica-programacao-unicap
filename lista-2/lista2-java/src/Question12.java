import java.util.Scanner;

public class Question12 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String concept, situation, idStudent;
		float grade1, grade2, grade3, me, ma;
		
		
		System.out.printf("Informe o número de identificação do aluno: ");
		idStudent = read.nextLine();
		
		System.out.printf("Informe a nota do aluno na primeira avaliação: ");
		grade1 = read.nextFloat();
		System.out.printf("Agora informe a nota da segunda avaliação: ");
		grade2 = read.nextFloat();
		System.out.printf("Por fim, informe a nota da terceira avaliação: ");
		grade3 = read.nextFloat();
		System.out.printf("Informe também a Média de Exercícios do aluno: ");
		me = read.nextFloat();
		
		ma = (grade1 + grade2 * 2 + grade3 * 3 + me) / 7;
				
		if (ma >= 90) {
			concept = "A";
		} else if (ma >= 75) {
			concept = "B";
		} else if (ma >= 60) {
			concept = "C";
		} else if (ma >= 40) {
			concept = "D";
		} else {
			concept = "E";
		}
		
		if (concept.equals("A") || concept.equals("B") || concept.equals("C")) {
			situation = "APROVADO";
		} else {
			situation = "REPROVADO";
		}
		
		System.out.printf("\n%s\t%s \n%s\t\t\t%.1f \n%s\t\t\t%.1f \n%s\t\t\t%.1f \n%s\t\t%.1f \n%s\t%.1f \n%s\t\t\t%s \n%s\t\t\t%s", "Número de Identificação: ", idStudent, "Nota 1: ", grade1, "Nota 2: ", grade2, "Nota 3: ", grade3, "Média de Exercícios: ", me, "Média de Aproveitamento: ", ma, "Conceito: ", concept, "Situação: ", situation);
	}
}