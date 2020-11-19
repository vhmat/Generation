import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int idade=0, maior=0, menor=0;
		Scanner read = new Scanner (System.in);
		System.out.println("Contabilizando maiores que 50 anos e menores que 21 anos!");
		while(true) {
			System.out.println("Digite sua idade: ");
			idade= read.nextInt();
			if(idade>=0 && idade<21) {
				menor++;
			}
			else if(idade>50) {
				maior++;
			}
			else if(idade==-99) {
				break;
			}
		}
		System.out.println("Foram inseridas "+menor+" idades menores que 21 anos e "+maior+" maiores que 50 anos!");
	}
}
