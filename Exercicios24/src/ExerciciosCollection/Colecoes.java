package ExerciciosCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) {
		Collection <String> nomes = new ArrayList();
		nomes.add("Mario");
		nomes.add("Larissa");
		nomes.add("Juliana");
		nomes.add("Teteu");
		nomes.add("Douglas");
		nomes.add("Ednéia");
		System.out.println("Lista de nomes: \n");
		for(String name : nomes) {
			System.out.println(name);
		}
		
		
		/*Collection <String> nomes2 = Arrays.asList("João", "Joana");
		nomes.addAll(nomes2);
		System.out.println("Lista de nomes: "+nomes);
		System.out.println("Contém o nome Teteu?"+nomes.contains("Teteu"));
		System.out.println("Lista: "+nomes);
		System.out.println("Lista de nomes: "+nomes);
		nomes.clear();
		System.out.println("Lista de nomes: "+nomes);
		
		System.out.println("Lista de nomes: "+nomes);
		nomes.remove("Mario");
		System.out.println("Lista de nomes: "+nomes);
		if(nomes.isEmpty()) {
			System.out.println("Lista vazia!");
		}
		else {
			System.out.println("Lista de nomes: "+nomes);
		}*/
	}

}
