import java.util.Scanner;

public class Question8 {
    
    static String swimmerCategory(int x) {
		String y;
		
		if (x < 8) {
			y = "Infantil A";
		} else if (x < 11) {
			y = "Infantil B";
		} else if (x < 14) {
			y = "Juvenil A";
		} else if (x < 18) {
			y = "Juvenil B";
		} else {
			y = "Adulto";
		}		
		return y;
	}
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int age;
				
		System.out.printf("Olá! Informe a idade do nadador: ");
		age = read.nextInt();
		
		while (age < 5) {
			if (age < 1) {
				System.out.printf("Essa idade não existe. Tente novamente: ");
			} else {
				System.out.printf("Não há nenhuma categoria para essa idade. Tente novamente: ");
			}
			
			age = read.nextInt();
		}
		
		String category = swimmerCategory(age);
		
		System.out.printf("\nIdade do nadador: %d \nCategoria do nadador: %s", age, category);
	}
}