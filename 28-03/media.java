import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		double[] notas = new double[10];
		String nomeAluno;		
		double total = 0;
		int i;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o nome do aluno: ");
		nomeAluno = leitor.nextLine();

		for (i = 0; i < 10; i++) {			
			System.out.println("Escreva a nota " + (i + 1) + " : ");
			notas[i] = leitor.nextDouble();
		}
		
		for (i = 0; i < 10; i++) {
			total = total + notas[i];			
		}	
		
		System.out.println(nomeAluno + " obteve a media: " + (total/10));
		System.out.println("De um total de :" + total);
	}
}
