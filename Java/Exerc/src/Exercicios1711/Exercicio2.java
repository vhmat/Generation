package Exercicios1711;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String[] args) {
		int senhaValida=1234, senhaUsuario=0;
		Scanner read = new Scanner (System.in);
		System.out.println("Compara��o entre senhas!");
		System.out.println("Digite sua senha: ");
		senhaUsuario= read.nextInt();
		if(senhaUsuario==senhaValida) {
			System.out.println("Acesso permitido!");
		}
		else {
			System.out.println("Acesso negado!");
		}
	}

}
