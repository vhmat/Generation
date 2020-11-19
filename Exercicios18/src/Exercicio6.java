import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		double salario=0.00, somaSalario=0.00, mediaSalarial=0.00,  maior=0.00, percentualSalarioCem=0.00; 
		double mediaFilhos=0.00, quantidadeFilhos=0.00, somaFilhos=0.00;
		int contador=0, contadorMenor=0;
		
		Scanner read = new Scanner (System.in);
		for(int i=0; i<20; i++) {
			System.out.println("Digite o seu salário: ");
			salario= read.nextDouble();
			System.out.println("Digite a quantidade de filhos que você tem: ");
			quantidadeFilhos= read.nextDouble();
				//Somando o salário anterior com salário atual e somando a quantidade de filho anterior com a quantidade atual. 
			somaSalario+=salario;
			somaFilhos+=quantidadeFilhos;
				//Acrescentando 1 ao contador para fazer o cálculo posteriormente.
			contador++;
				//Calculando a média salarial e de filhos e dividindo pelo contador que houve incremento de 1 na linha acima.
			mediaSalarial= somaSalario/contador;
			mediaFilhos=somaFilhos/contador;
				//Estrutura de decisão if para localizar o maior salário.
			if(salario>maior) {
				maior=salario;
			}
				/*Estrutura de decisão if para calcular a média salarial das pessoas que recebem até 100 reais de salário. 
			 	Contador recebendo icremento de um antes para ser utilizado na divisão abaixo.*/
			if(salario<=100) {
				contadorMenor++;
				percentualSalarioCem=((contadorMenor*100)/20);
			}
		}
		System.out.println("A média do salário da população é igual a R$"+mediaSalarial+" a média de filhos da população é "+mediaFilhos+" por família!");
		System.out.println("O maior salário foi igual a R$"+maior);
		System.out.println("A porcentagem de pessoas que recebem até R$100,00 é igual a "+percentualSalarioCem+"%.");
	}
}