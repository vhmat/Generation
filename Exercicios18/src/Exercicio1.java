import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int numero=0;
		Scanner read = new Scanner (System.in);
		for(int i=1000; i<2000; i++) {
			numero=i%11;
			if(numero==5) {
				System.out.println("O número "+i+" dividido por 11 tem o resto 5!");
			}
		}
	}

}
