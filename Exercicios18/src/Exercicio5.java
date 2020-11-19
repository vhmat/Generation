import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		int numero=0, soma=0, contador=0, media=0;
		Scanner read = new Scanner (System.in);
		do {
			System.out.println("Digite um número: ");
			numero = read.nextInt();
			if(numero%3==0 && numero>0) {
				soma+=numero;
				contador++;
			}
			else if(numero==0) {
				break;
			}
		}while(true);
		
		media=soma/contador;
		System.out.println("A soma dos números múltiplos de 3 foi igual a "+soma+" e sua média foi igual a "+media+"! :)");
	}
}
