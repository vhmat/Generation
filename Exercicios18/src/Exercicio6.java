import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		double salario=0.00, somaSalario=0.00, mediaSalarial=0.00,  maior=0.00, percentualSalarioCem=0.00; 
		double mediaFilhos=0.00, quantidadeFilhos=0.00, somaFilhos=0.00;
		int contador=0, contadorMenor=0;
		
		Scanner read = new Scanner (System.in);
		for(int i=0; i<20; i++) {
			System.out.println("Digite o seu sal�rio: ");
			salario= read.nextDouble();
			System.out.println("Digite a quantidade de filhos que voc� tem: ");
			quantidadeFilhos= read.nextDouble();
				//Somando o sal�rio anterior com sal�rio atual e somando a quantidade de filho anterior com a quantidade atual. 
			somaSalario+=salario;
			somaFilhos+=quantidadeFilhos;
				//Acrescentando 1 ao contador para fazer o c�lculo posteriormente.
			contador++;
				//Calculando a m�dia salarial e de filhos e dividindo pelo contador que houve incremento de 1 na linha acima.
			mediaSalarial= somaSalario/contador;
			mediaFilhos=somaFilhos/contador;
				//Estrutura de decis�o if para localizar o maior sal�rio.
			if(salario>maior) {
				maior=salario;
			}
				/*Estrutura de decis�o if para calcular a m�dia salarial das pessoas que recebem at� 100 reais de sal�rio. 
			 	Contador recebendo icremento de um antes para ser utilizado na divis�o abaixo.*/
			if(salario<=100) {
				contadorMenor++;
				percentualSalarioCem=((contadorMenor*100)/20);
			}
		}
		System.out.println("A m�dia do sal�rio da popula��o � igual a R$"+mediaSalarial+" a m�dia de filhos da popula��o � "+mediaFilhos+" por fam�lia!");
		System.out.println("O maior sal�rio foi igual a R$"+maior);
		System.out.println("A porcentagem de pessoas que recebem at� R$100,00 � igual a "+percentualSalarioCem+"%.");
	}
}