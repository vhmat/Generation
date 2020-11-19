/*Desenvolver um sistema que efetue a soma de todos os números ímpares
que são múltiplos de três e que se encontram no conjunto dos números de 1
até 500. (FOR)*/

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		int numero=0;
		Scanner read = new Scanner (System.in);
		for(int i=1; i<=500;i++) {
			if(i%3==1) {
				System.out.println("O número "+i+" é ímpar!");
			}
		}
	}
}
