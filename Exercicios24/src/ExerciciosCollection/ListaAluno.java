package ExerciciosCollection;

import java.util.*;

public class ListaAluno {
	public static void main(String args[]) {
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a= new Aluno("Jo�o da Silva", "Java", 6.8);
		Aluno b= new Aluno("Maria Souza", "Java", 7.8);
		Aluno c= new Aluno("Renata Almeida", "S0", 8);
		Aluno d= new Aluno("Jos� Nascimento", "Internet", 5.5);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
		
	}
}
