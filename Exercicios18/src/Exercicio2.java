import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int numero=0, soma=0;
		Scanner read = new Scanner (System.in);
		System.out.println("Retorno de número par e número ímpar!");
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+" número: ");
			numero= read.nextInt();
			soma= (numero%2);
			if(soma==0) {
				System.out.println("O número "+ numero +" é par!\n");
			}
			else if(soma!=0) {
				System.out.println("O número "+numero+" é ímpar!\n");
			}
		}	
	}
}
