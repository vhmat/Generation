/*Desenvolver um sistema que efetue a soma de todos os n�meros �mpares
que s�o m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1
at� 500. (FOR)*/

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		int numero=0;
		Scanner read = new Scanner (System.in);
		for(int i=1; i<=500;i++) {
			if(i%3==1) {
				System.out.println("O n�mero "+i+" � �mpar!");
			}
		}
	}
}
