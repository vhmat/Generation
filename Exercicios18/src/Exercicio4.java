import java.util.Scanner;

public class Exercicio4 {
	public static void main (String[] args) {
		int numero=0, soma=0, contador=0;
		Scanner read = new Scanner (System.in);
		
		do {
			System.out.println("Digite um n�mero: ");
			numero= read.nextInt();
			if(numero!=0) {
				soma+=numero;
				contador++;
			}
			else if (numero==0) {
				break;
			}
		}while(true);
		
		System.out.println("A soma foi igual a "+soma+" e a quantidade de n�meros foi igual a "+contador);
	}
}
