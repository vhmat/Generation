package Ata;

import java.util.Scanner;

public class Exerc1 {
	public static void main (String[] args) {
		int numero1=0, numero2=0;
			Scanner read = new Scanner (System.in);
			System.out.println("Programa que retorna o maior n�mero digitado pelo usu�rio!");
			System.out.println("Digite o primeiro n�mero: ");
			numero1= read.nextInt();
			System.out.println("Digite o segundo n�mero: ");
			numero2= read.nextInt();
			if(numero1==numero2) {
				System.out.println("N�meros iguais. Favor iniciar o programa novamente!");
			}
			else if(numero1>numero2) {
				System.out.println("O n�mero "+numero1+" � o maior!");
			}
			else {
				System.out.println("O n�mero "+numero2+" � o maior!");
			}
	}
}
