package Exercicios1711;

import java.util.Scanner;

public class EscolhaCaso {
	public static void main (String[] args) {
		double quantidadeMaca=0.00, total=0.00;
		int numero=0;
			Scanner read = new Scanner (System.in);
			System.out.println("Digite a quantidade de ma��s: ");
			quantidadeMaca= read.nextDouble();
			System.out.println("Se o n�mero de ma�as for menor igual a 11, digite 1. Se for maior igual a 12, digite 2: ");
			numero= read.nextInt();
			
			switch (numero) {
				case 1: {
					total=(quantidadeMaca*0.30);
					System.out.println("A quantidade de ma�as compradas foram "+quantidadeMaca+" e o total da compra foi de R$ "+total+"!");
					break;
				}
				case 2:{
					total=(quantidadeMaca*0.25);
					System.out.println("A quantidade de ma�as compradas foram "+quantidadeMaca+" e o total da compra foi de R$ "+total+"!");
					break;
				}
			}
	}
}
