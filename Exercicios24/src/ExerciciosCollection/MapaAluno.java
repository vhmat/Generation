package ExerciciosCollection;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno {
	public static void main (String args[]) {
		Map <String, Aluno> mapa = new TreeMap <String, Aluno>();
		Aluno a= new Aluno("Jo�o da Silva", "Java", 6.8);
		Aluno b= new Aluno("Maria Souza", "Java", 7.8);
		Aluno c= new Aluno("Renata Almeida", "S0", 8);
		Aluno d= new Aluno("Jos� Nascimento", "Internet", 5.5);
		
		mapa.put("Jo�o da Silva",a);
		mapa.put("Maria Souza",b);
		mapa.put("Renata Almeida",c);
		mapa.put("Jos� Nascimento",d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Renata Almeida"));
		
		Collection <Aluno> alunos = mapa.values();
		
		for(Aluno e : alunos) {
			System.out.println(e);
		}
	}
}
