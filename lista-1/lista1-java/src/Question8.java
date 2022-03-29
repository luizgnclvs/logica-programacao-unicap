import java.util.Scanner;

public class Question8 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int voters;
		float blankVotes, nullVotes;
		
		System.out.printf("Informe o número total de eleitores dentro do município: ");
		voters = read.nextInt();
		
		System.out.printf("Informe o total de votos brancos: ");
		blankVotes = read.nextFloat();
		
		System.out.printf("Agora informe a quantidade de votos nulos: ");
		nullVotes = read.nextFloat();
		
		System.out.printf("\nO percentual de votos brancos é de, aproximademente, %.2f%% em relação ao número total de eleitores", (blankVotes / voters)*100);
		System.out.printf("\nO percentual de votos nulos é de, aproximadamente, %.2f%% em relação ao número total de eleitores", (nullVotes / voters)*100);
		
	}
}