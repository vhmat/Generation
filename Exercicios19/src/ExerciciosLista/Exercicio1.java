package ExerciciosLista;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int [] array = new int[10];
		int maior=0, contador=0, ocorrencia=0;
		double mediaLancamento=0.00, soma=0.00;
		for(int i=0;i<10;i++) {
			System.out.println("Entre com um valor: ");
			array[i] = read.nextInt();
			contador++;
			soma+=array[i];
			mediaLancamento = soma/contador;
			if(array[i]>maior) {
				maior=array[i];
			}
			if(array[i]==6) {
				ocorrencia++;
			}
		}
		System.out.println("A soma dos n�meros lan�ados � igual a "+soma+" e sua m�dia � igual a "+mediaLancamento);
		System.out.println("Houve um total de "+ocorrencia+" ocorr�ncia (as) da maior pontua��o (n� 6)!");
	}
}

	/*
	 
	  }
		for(int i=0;i<10;i++) {
			System.out.println(array[i]);
		}
	  
	  
	  */
	 