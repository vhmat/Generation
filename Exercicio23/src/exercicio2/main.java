package exercicio2;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
	
		Aviao aviao1 = new Aviao();
		
		System.out.println("Digite o modelo do avião: ");
		aviao1.setModelo(read.next());	
		
		System.out.println("Digite o porte do avião: ");
		aviao1.setPorte(read.next());		
		
		System.out.println("Digite a capacidade de tripulantes do avião: ");
		aviao1.setCapacidadeTripulantes(read.nextInt());		
		
		System.out.println("Digite a capacidade de passageiros do avião: ");
		aviao1.setCapacidadePassageiro(read.nextInt());		

		System.out.println("O modelo do avião é do tipo "+aviao1.getModelo());
		System.out.println("O porte do avião é do tipo "+aviao1.getPorte());
		System.out.println("A capacidade de tripulantes do avião é de "+aviao1.getCapacidadeTripulantes());
		System.out.println("A capacidade de passageiros do avião é de "+aviao1.getCapacidadePassageiro());
		System.out.println("A capacidade total de pessoas do avião é de "+(aviao1.getCapacidadePassageiro()+aviao1.getCapacidadeTripulantes()));
		
	}

}

/*
Crie uma classe avião e apresente os atributos e
métodos referentes esta classe, em seguida crie um objeto avião, 
defina as instancias deste objeto e apresente as informações deste
objeto no console.
*/