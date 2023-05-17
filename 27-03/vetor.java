import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		String nomes[] = new String[5];
		int i;
		
		for(i = 0; i < 5; i++) {
			System.out.println("Escreva o " + (i + 1) + " nome: " );		
			Scanner leitor = new Scanner(System.in);
			nomes[i] = leitor.nextLine();	
		}
		
		for(i = 0; i < 5; i++) {
			System.out.println((i + 1) + " nome eh: " + nomes[i]);					
		}			
	}
}
