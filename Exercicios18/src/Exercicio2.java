import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int numero=0, soma=0;
		Scanner read = new Scanner (System.in);
		System.out.println("Retorno de n�mero par e n�mero �mpar!");
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+" n�mero: ");
			numero= read.nextInt();
			soma= (numero%2);
			if(soma==0) {
				System.out.println("O n�mero "+ numero +" � par!\n");
			}
			else if(soma!=0) {
				System.out.println("O n�mero "+numero+" � �mpar!\n");
			}
		}	
	}
}
