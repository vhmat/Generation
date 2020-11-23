package exercicio1;

public class main {

	public static void main(String[] args) {
		
		Cliente mateus = new Cliente ();
		Cliente chagas = new Cliente();
		Cliente correa = new Cliente();
		
		chagas.setNome("Lucas Chagas");
		chagas.setIdade(24);
		chagas.setEndereco("Rua Yuke, nº 26, Jardim Tutupom - Campinas");
		chagas.setTelefone("(19) 7658-9658");
		chagas.setCpf("888.888.888-88");		
		System.out.println(chagas.getNome()+"\n"+chagas.getIdade()+" anos\n"+chagas.getCpf()+"\n"+chagas.getEndereco()+"\n"+chagas.getTelefone()+"\n");
		
		correa.setNome("Lucas Correa");
		correa.setIdade(29);
		correa.setEndereco("Rua Yuke, nº 30, Jardim Tutupom - Campinas");
		correa.setTelefone("(19) 7788-9088");
		correa.setCpf("777.777.777-77");		
		System.out.println(correa.getNome()+"\n"+correa.getIdade()+" anos\n"+correa.getCpf()+"\n"+correa.getEndereco()+"\n"+correa.getTelefone()+"\n");
		
		mateus.setNome("Mateus");
		mateus.setIdade(23);
		mateus.setEndereco("Rua Yuke, nº 23, Jardim Tutupom - Campinas");
		mateus.setTelefone("(19) 7658-9088");
		mateus.setCpf("999.999.999-99");		
		System.out.println(mateus.getNome()+"\n"+mateus.getIdade()+" anos\n"+mateus.getCpf()+"\n"+mateus.getEndereco()+"\n"+mateus.getTelefone()+"\n");
		
	}

}

		/* 
		Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
		
		em seguida crie um objeto cliente,  defina as instancias deste objeto e apresente 
		as informações deste objeto no console.
		
		*/