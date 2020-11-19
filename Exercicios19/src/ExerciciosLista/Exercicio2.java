package ExerciciosLista;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int[][] matriz1 = new int [4][6];
		int[][] matriz2 = new int [4][6];
		int[][] matriz3 = new int [4][6];
		int[][] matriz4 = new int [4][6];

		for(int l=0;l<4;l++) {
			for(int c=0;c<6;c++) {
				System.out.println("Digite um número para armazenar na posição ["+l+"]"+"["+c+"] da matriz 1: ");
				matriz1[l][c] = read.nextInt();
			}
		}
		
		for(int l=0;l<4;l++) {
			for(int c=0;c<6;c++) {
				System.out.println("Digite um número para armazenar na posição ["+l+"]"+"["+c+"] da matriz 2: ");
				matriz2[l][c] = read.nextInt();
			}
		}
		//Somando as matrizes e armazenando na matriz 3.
		for(int l=0;l<4;l++) {
			for(int c=0;c<6;c++) {
				matriz3[l][c]=matriz1[l][c]+matriz2[l][c];
				matriz4[l][c]=matriz1[l][c]-matriz2[l][c];
			}
		}
		//Apresentação matriz 3
		System.out.println("A soma dos elementos da matriz 1 com a matriz 2 é igual a: ");
		for(int l=0;l<4;l++) {
			for(int c=0;c<6;c++) {
				System.out.printf("["+matriz3[l][c]+"]");
			}
			System.out.printf("\n");
		}
		System.out.println("A subtração dos elementos da matriz 1 com a matriz 2 é igual a: ");
		for(int l=0;l<4;l++) {
			for(int c=0;c<6;c++) {
				System.out.printf("["+matriz4[l][c]+"]");
			}
			System.out.printf("\n");
		}
	}
}

/*
2.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
*/