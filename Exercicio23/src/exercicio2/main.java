package exercicio2;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
	
		Aviao aviao1 = new Aviao();
		
		System.out.println("Digite o modelo do avi�o: ");
		aviao1.setModelo(read.next());	
		
		System.out.println("Digite o porte do avi�o: ");
		aviao1.setPorte(read.next());		
		
		System.out.println("Digite a capacidade de tripulantes do avi�o: ");
		aviao1.setCapacidadeTripulantes(read.nextInt());		
		
		System.out.println("Digite a capacidade de passageiros do avi�o: ");
		aviao1.setCapacidadePassageiro(read.nextInt());		

		System.out.println("O modelo do avi�o � do tipo "+aviao1.getModelo());
		System.out.println("O porte do avi�o � do tipo "+aviao1.getPorte());
		System.out.println("A capacidade de tripulantes do avi�o � de "+aviao1.getCapacidadeTripulantes());
		System.out.println("A capacidade de passageiros do avi�o � de "+aviao1.getCapacidadePassageiro());
		System.out.println("A capacidade total de pessoas do avi�o � de "+(aviao1.getCapacidadePassageiro()+aviao1.getCapacidadeTripulantes()));
		
	}

}

/*
Crie uma classe avi�o e apresente os atributos e
m�todos referentes esta classe, em seguida crie um objeto avi�o, 
defina as instancias deste objeto e apresente as informa��es deste
objeto no console.
*/