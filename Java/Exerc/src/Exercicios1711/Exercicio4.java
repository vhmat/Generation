package Exercicios1711;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String [] args) {
		int numero1=0, numero2=0, numero3=0;
			Scanner read = new Scanner (System.in);
			System.out.println("Programa que retorna o maior n�mero dentre tr�s n�meros digitados!");
			System.out.println("Digite o primeiro n�mero: ");
			numero1= read.nextInt();
			System.out.println("Digite o primeiro n�mero: ");
			numero2= read.nextInt();
			System.out.println("Digite o primeiro n�mero: ");
			numero3= read.nextInt();
			if(numero1 > numero2 && numero1 > numero3) {
				System.out.println("O maior n�mero � "+numero1);
			}
			else if(numero2 > numero1 && numero2 > numero3) {
				System.out.println("O maior n�mero � "+numero2);
			}
			else if(numero3 > numero1 && numero3 > numero2) {
				System.out.println("O maior n�mero � "+numero3);
			}
			
	}
}
