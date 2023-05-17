import java.util.Scanner;

public class Cimema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade;
		int sala;
		boolean a = false;

		do {
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Informe seu nome:  ");
			nome = leitor.nextLine();
			
			System.out.println("Informe sua idade:  ");
			idade = leitor.nextInt();
			
			System.out.println("----------------- Escolha o filme desejado --------------------\n");
			System.out.println("     Tons de Cinza  - sala 1 - Classificação Indicativa 18 anos\n");
			System.out.println("     Titanic        - sala 2 - Classificação Indicativa 18 anos\n");
			System.out.println("     Matrix         - sala 3 - Classificação Indicativa 16 anos\n");
			System.out.println("     Avatar         - sala 4 - Classificação Indicativa 14 anos\n");
			System.out.println("     Pinoquio       - sala 5 - Classificação Indicativa Livre  \n");

			System.out.println("Informe a sala:  ");
			sala = leitor.nextInt();

			switch (sala) {
			case 1:
				if (idade < 18) {
					System.out.println("Idade abaixo da classificação \n");
					break;
				} else {
					System.out.println("Bom Filme!!\n");
					a = true;
					break;
				}
			case 2:
				if (idade < 18) {
					System.out.println("Idade abaixo da classificação\n");
					break;
				} else {
					System.out.println("Bom Filme!!\n");
					a = true;
					break;
				}
			case 3:
				if (idade < 16) {
					System.out.println("Idade abaixo da classificação\n");
					break;
				} else {
					System.out.println("Bom Filme!!\n");
					a = true;
					break;
				}
			case 4:
				if (idade < 14) {
					System.out.println("Idade abaixo da classificação\n");
					break;
				} else {
					System.out.println("Bom Filme!!\n");
					a = true;
					break;
				}
			case 5:
				System.out.println("Bom Filme!!\n");
				a = true;
				break;
				
			default:
				System.out.println("Sala Inválida\n");
				break;
			}
		} while (a == false);
	}
}
