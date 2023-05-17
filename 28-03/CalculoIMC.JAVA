import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {

				double peso ;
				double altura ;
				String nomeUsuario;		
				double IMC;
				
				Scanner leitor = new Scanner(System.in);
					System.out.println("Escreva o nome do usuário: ");
					nomeUsuario = leitor.next();
					System.out.println("Escreva o peso do usuário: ");
					peso = leitor.nextDouble();
					System.out.println("Escreva a altura do usuário: ");
					altura = leitor.nextDouble();
					
					double alturaTotal = altura * altura;
					IMC = peso/alturaTotal;
					
					if (IMC < 18.5) {							
						System.out.println("O "  + nomeUsuario +     " está abaixo do peso normal - IMC: " + IMC);
					} else if (IMC > 18.5 && IMC <= 24.9) {							
							System.out.println("O "  + nomeUsuario + " está com peso normal - com IMC: " + IMC);
					} else if (IMC > 24.9 && IMC <= 29.9) {							
						System.out.println("O "  + nomeUsuario +     " está excesso de peso - com IMC: " + IMC);
			        } else if (IMC > 29.9 && IMC <= 34.9) {							
						System.out.println("O "  + nomeUsuario +     " esta com obesidade classe I - com IMC: " + IMC);
			        } else if (IMC > 34.9 && IMC <= 39.9) {							
						System.out.println("O "  + nomeUsuario +     " esta com obesidade classe II - com IMC: " + IMC);
			        } else if (IMC > 39.0) {							
						System.out.println("O "  + nomeUsuario +     " esta com obesidade classe III - com IMC: " + IMC);
			        }
		}
}

